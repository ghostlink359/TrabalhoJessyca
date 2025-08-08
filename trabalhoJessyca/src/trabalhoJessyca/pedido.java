package trabalhoJessyca;

import java.util.Date;

public class pedido {
	private int idPedido;
	private cliente idCliente;
	private Date data;
	private float valorTotal;
	private String status;
	
	public pedido (int idPedido, cliente idCliente, Date data, float valorTotal, String status) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.data = data;
		this.valorTotal = valorTotal;
		this.status = status;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
 	
}
