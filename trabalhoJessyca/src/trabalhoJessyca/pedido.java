package trabalhoJessyca;

import java.util.Date;

public class pedido {
	private int idPedido;
	private cliente idCliente;
	private String status;
	private carrinho carrinho;

	public pedido(int idPedido, cliente idCliente, carrinho carrinho, String status) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.carrinho = carrinho;
		this.status = "Aberto";
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(cliente idCliente) {
		this.idCliente = idCliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void AtualizarStatus(String novoStatus) {
		this.status = novoStatus;
	}

	public void exibirResumo() {
		carrinho.listarProdutos();
		System.out.println("Total: R$ " + carrinho.calcularTotal());
		System.out.println("Status: " + status);
	}

}
