package trabalhoJessyca;

public class produto {
	private int idProduto;
	private String nome;
	private float preco;
	private int estoque;

	public produto(int idProduto, String nome, float preco, int estoque) {
		this.idProduto = idProduto;
		setNome(nome);
		setPreco(preco);
		setEstoque(estoque);
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		if (idProduto <= 0) {
			throw new IllegalArgumentException("O ID do produto deve ser mior que 0.");
		}
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
		}
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("O preço não pode ser negativo.");
		}
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		if (estoque < 0) {
			throw new IllegalArgumentException("O estoque não pode ser negativo.");
		}
		this.estoque = estoque;
	}

	public void alterarPreco(float novoPreco) {
		try {
			setPreco(novoPreco);
			System.out.println("Preço alterado com sucesso!");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao alterar preço: " + e.getMessage());
		}
	}

	public void atualizarEstoque(int quantidade) {
		try {
			if (this.estoque + quantidade < 0) {
				throw new IllegalArgumentException("Não é possível reduzir o estoque abaixo de zero.");
			}
			this.estoque += quantidade;
			System.out.println("Estoque atualizado com sucesso!");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao atualizar estoque: " + e.getMessage());
		}
	}

	public boolean verificarEstoque(int quantidadeDesejada) {
		if (quantidadeDesejada <= 0) {
			System.out.println("Quantidade inválida para verificação de estoque.");
			return false;
		}
		return this.estoque >= quantidadeDesejada;
	}

	public void atualizarProduto(String novoNome, float novoPreco, int novoEstoque) {
		try {
			setNome(novoNome);
			setPreco(novoPreco);
			setEstoque(novoEstoque);
			System.out.println("Produto atualizado com sucesso!");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao atualizar produto: " + e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Produto [ID=" + idProduto + ", Nome=" + nome + ", Preço=" + preco + ", Estoque=" + estoque + "]";
	}

}
