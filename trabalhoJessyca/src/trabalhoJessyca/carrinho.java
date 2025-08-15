package trabalhoJessyca;

import java.util.ArrayList;
import java.util.List;

public class carrinho {
	private int idCarrinho;
	private String produtos;
	private float total;

	private List<produto> itens = new ArrayList<>();

	public carrinho(int idCarrinho, String produtos, float total) {
		this.idCarrinho = idCarrinho;
		this.produtos = produtos;
		this.total = total;
	}

	public int getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public void adicionarProduto(produto idProduto) {
		itens.add(idProduto);
	}

	public void removerProduto(produto idProduto) {
		itens.remove(idProduto);
	}

	public void listarProdutos() {
		if (itens.isEmpty()) {
			System.out.println("Carrinho vazio!");
		} else {
			for (produto p : itens) {
				System.out.println(p.getNome() + " - R$ " + p.getPreco());
			}
		}
	}

	public double calcularTotal() {
		double total = 0;
		for (produto p : itens) {
			total += p.getPreco();
		}
		return total;
	}

}
