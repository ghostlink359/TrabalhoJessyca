package trabalhoJessyca;

import java.util.Date;

public class pedido {
	private int idPedido;
	private cliente idCliente;
	private String status;
	private carrinho carrinho;

	public pedido(int idPedido, cliente idCliente, carrinho carrinho, String status) {
		try {
			setIdPedido(idPedido);
			setIdCliente(idCliente);
			setCarrinho(carrinho);
			setStatus(status);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao criar pedido: " + e.getMessage());
			this.status = "Aberto";
		}
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		if (idPedido <= 0) {
			throw new IllegalArgumentException("O ID do pedido deve ser positivo.");
		}
		this.idPedido = idPedido;
	}

	public cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(cliente idCliente) {
		if (idCliente == null) {
			throw new IllegalArgumentException("O cliente associado ao pedido não pode ser nulo.");
		}
		this.idCliente = idCliente;
	}

	public carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(carrinho carrinho) {
		if (carrinho == null) {
			throw new IllegalArgumentException("O carrinho não pode ser nulo.");
		}
		this.carrinho = carrinho;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status == null || status.trim().isEmpty()) {
			throw new IllegalArgumentException("O status do pedido não pode ser vazio.");
		}
		this.status = status;
	}

	public void AtualizarStatus(String novoStatus) {
		try {
			setStatus(novoStatus);
			System.out.println("Status do pedido atualizado para: " + this.status);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao atualizar status: " + e.getMessage());
		}
	}

	public void exibirResumo() {
		try {
			if (carrinho == null) {
				throw new IllegalStateException("Não é possível exibir resumo: carrinho inexistente.");
			}
			System.out.println("Resumo do Pedido (ID: " + idPedido + ")");
			carrinho.listarProdutos();
			System.out.println("Total: R$ " + carrinho.calcularTotal());
			System.out.println("Status: " + status);
		} catch (Exception e) {
			System.out.println("Erro ao exibir resumo do pedido: " + e.getMessage());
		}
	}

}
