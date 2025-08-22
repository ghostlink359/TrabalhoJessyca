package trabalhoJessyca;

public class cliente {
	private int idCliente;
	private String nome;
	private String email;
	private String senha;
	private String endereco;

	public cliente(int idCliente, String nome, String email, String endereco) {
		this.idCliente = idCliente;
		setNome(nome);
		setEmail(email);
		setEndereco(endereco);
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		if (idCliente <= 0) {
			throw new IllegalArgumentException("ID do cliente deve ser maior que zero.");
		}
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio.");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		try {
			if (email == null || !email.contains("@")) {
				throw new IllegalArgumentException("E-mail inválido! Deve conter '@'.");
			}
			this.email = email;
		} catch (IllegalArgumentException e) {
			System.out.println("Erro ao definir e-mail: " + e.getMessage());
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha == null || senha.length() < 6) {
			throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres.");
		}
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco == null || endereco.trim().isEmpty()) {
			throw new IllegalArgumentException("Endereço não pode ser vazio.");
		}
		this.endereco = endereco;
	}

	public void visualizarPerfil() {
		System.out.println("Perfil do Cliente:");
		System.out.println("Id: " + idCliente);
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Endereço: " + endereco);
	}

	public void atualizarCadastro(String novoNome, String novoEmail, String novoEndereco) {
		try {
			setNome(novoNome);
			setEmail(novoEmail);
			setEndereco(novoEndereco);
			System.out.println(" Cadastro atualizado com sucesso!");
		} catch (Exception e) {
			System.out.println(" Erro ao atualizar cadastro: " + e.getMessage());
		}
	}

}
