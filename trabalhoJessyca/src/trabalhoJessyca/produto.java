package trabalhoJessyca;

public class produto {
	private int idProduto;
	private String nome;
	private float preco;
	private int estoque;

	public produto(int idProduto, String nome, float preco, int estoque) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void alterarPreco(float novoPreco) {
		this.preco = novoPreco;
	}

	public void atualizarEstoque(int quantidade) {
		this.estoque += quantidade;
	}

	public boolean verificarEstoque(int quantidadeDesejada) {
		return this.estoque >= quantidadeDesejada;
	}

	public void atualizarProduto(String novoNome, float novoPreco, int novoEstoque) {
		this.nome = novoNome;
		this.preco = novoPreco;
		this.estoque = novoEstoque;
	}

	@Override
	public String toString() {
		return "Produto [ID=" + idProduto + ", Nome=" + nome + ", Preço=" + preco + ", Estoque=" + estoque + "]";
	}

}
