package trabalhoJessyca;

public class pagamento {
	private pedido idPedido;
	private float valor;
	private String metodo;
	private String status;

	public pagamento(pedido idPedido, float valor, String metodo, String status) {
		this.idPedido = idPedido;
		this.valor = valor;
		this.metodo = metodo;
		this.status = status;
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

	public void processarPagamento() {
		if (!status.equalsIgnoreCase("Pago")) {
			status = "Pago";
			System.out.println("Pagamento processado com sucesso.");
		} else {
			System.out.println("Pagamento já realizado.");
		}
	}

	public void verificarStatus() {
		System.out.println("O status de pagamento é: " + status);
	}

}
