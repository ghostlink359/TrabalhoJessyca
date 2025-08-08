package trabalhoJessyca;

public class produto {
	private int idProduto;
	private String nome;
	private float preco;
	private int estoque;
	
	private produto (int idProduto, String nome, float preco, int estoque) {
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
}
