package trabalhoJessyca;

public class pagamento {
	private int idPagamento;
	private pedido idPedido;
	private float valor;
	private String metodo;
	private String status;
	
	public pagamento (int idPagamento, pedido idPedido, float valor, String metodo, String status) {
		this.idPagamento = idPagamento;
		this.idPedido = idPedido;
		this.valor = valor;
		this.metodo = metodo;
		this.status = status;
	}

	public int getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}

	public pedido getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(pedido idPedido) {
		this.idPedido = idPedido;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
