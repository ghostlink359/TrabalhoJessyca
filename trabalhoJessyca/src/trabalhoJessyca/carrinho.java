package trabalhoJessyca;

import java.util.ArrayList;
import java.util.List;

public class carrinho {
	private int idCarrinho;
	private String produtos;
	private float total;

	private List<produto> itens = new ArrayList<>();

	public carrinho(int idCarrinho, String produtos, float total) {
		try {
			setIdCarrinho(idCarrinho);
			setProdutos(produtos);
			setTotal(total);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao criar carrinho: " + e.getMessage());
			this.total = 0;
		}
	}

	public int getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(int idCarrinho) {
		if (idCarrinho <= 0) {
			throw new IllegalArgumentException("O ID do carrinho deve ser positivo.");
		}
		this.idCarrinho = idCarrinho;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		if (produtos == null) {
			throw new IllegalArgumentException("A descrição dos produtos presents no carrinho não pode ser nula.");
		}
		this.produtos = produtos;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		if (total < 0) {
			throw new IllegalArgumentException("O total do carrinho não pode ser negativo.");
		}
		this.total = total;
	}

	public void adicionarProduto(produto p) {
		try {
			if (p == null) {
				throw new IllegalArgumentException("Produto inválido (null).");
			}
			itens.add(p);
			System.out.println("Produto adicionado: " + p.getNome());
		} catch (Exception e) {
			System.out.println("Erro ao adicionar produto: " + e.getMessage());
		}
	}

	public void removerProduto(produto p) {
		try {
			if (p == null) {
				throw new IllegalArgumentException("Produto inválido (null).");
			}
			if (itens.remove(p)) {
				System.out.println("Produto removido: " + p.getNome());
			} else {
				System.out.println("Produto não encontrado no carrinho.");
			}
		} catch (Exception e) {
			System.out.println("Erro ao remover produto: " + e.getMessage());
		}
	}

	public void listarProdutos() {
		try {
			if (itens.isEmpty()) {
				System.out.println("Carrinho vazio!");
			} else {
				System.out.println("Produtos no carrinho:");
				for (produto p : itens) {
					System.out.println("- " + p.getNome() + " | R$ " + p.getPreco());
				}
			}
		} catch (Exception e) {
			System.out.println("Erro ao listar produtos: " + e.getMessage());
		}
	}

	public float calcularTotal() {
		try {
			float soma = 0;
			for (produto p : itens) {
				if (p != null) {
					soma += p.getPreco();
				}
			}
			this.total = (float) soma;
			return soma;
		} catch (Exception e) {
			System.out.println("Erro ao calcular total: " + e.getMessage());
			return 0;
		}
	}

}
