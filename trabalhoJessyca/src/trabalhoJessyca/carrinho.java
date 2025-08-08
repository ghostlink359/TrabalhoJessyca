package trabalhoJessyca;

public class carrinho {
	private int idCarrinho;
	private String produtos;
	private float total;
	
	public carrinho (int idCarrinho, String produtos, float total) {
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
}
