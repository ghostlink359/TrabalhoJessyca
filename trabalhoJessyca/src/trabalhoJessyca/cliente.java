package trabalhoJessyca;

public class cliente {
	private int idCliente;
	private String nome;
	private String email;
	private String senha;
	private String endereco;

	public cliente(int idCliente, String nome, String email, String endereco) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void visualizarPerfil() {
		System.out.println("Id: " + idCliente);
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Endereço: " + endereco);
	}

	public void atualizarCadastro(String novoNome, String novoEmail, String novoEndereco) {
		this.nome = novoNome;
		this.email = novoEmail;
		this.endereco = novoEndereco;
	}

}
