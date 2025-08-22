package trabalhoJessyca;

public class pagamento {
	private pedido idPedido;
	private float valor;
	private String metodo;
	private String status;

	public pagamento(pedido idPedido, float valor, String metodo, String status) {
		try {
			setIdPedido(idPedido);
			setValor(valor);
			setMetodo(metodo);
			setStatus(status);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao criar pagamento: " + e.getMessage());
			this.status = "Pendente";
		}
	}

	public pedido getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(pedido idPedido) {
		if (idPedido == null) {
			throw new IllegalArgumentException("O pagamento precisa estar associado a um pedido.");
		}
		this.idPedido = idPedido;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
		}
		this.valor = valor;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		if (metodo == null || metodo.trim().isEmpty()) {
			throw new IllegalArgumentException("O método de pagamento não pode ser vazio.");
		}
		this.metodo = metodo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status == null || status.trim().isEmpty()) {
			throw new IllegalArgumentException("O status não pode ser vazio.");
		}

		String statusLower = status.toLowerCase();
		if (!statusLower.equals("pendente") && !statusLower.equals("pago") && !statusLower.equals("cancelado")) {
			throw new IllegalArgumentException("Status inválido. Use: Pendente, Pago ou Cancelado.");
		}

		this.status = status;
	}

	public void processarPagamento() {
		try {
			if (!status.equalsIgnoreCase("Pago")) {
				status = "Pago";
				System.out.println("Pagamento processado com sucesso.");
			} else {
				System.out.println("Pagamento já foi realizado.");
			}
		} catch (Exception e) {
			System.out.println("Erro ao processar pagamento: " + e.getMessage());
		}
	}

	public void verificarStatus() {
		try {
			System.out.println("Status do pagamento: " + status);
		} catch (Exception e) {
			System.out.println("Erro ao verificar status: " + e.getMessage());
		}
	}

}
