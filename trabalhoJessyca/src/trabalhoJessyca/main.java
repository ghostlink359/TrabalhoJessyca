package trabalhoJessyca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<cliente> clientes = new ArrayList<>();
		List<produto> produtos = new ArrayList<>();
		List<pedido> pedidos = new ArrayList<>();

		int opcao;
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Remover Cliente");
			System.out.println("4 - Cadastrar Produto");
			System.out.println("5 - Listar Produtos");
			System.out.println("6 - Remover Produto");
			System.out.println("7 - Criar Pedido");
			System.out.println("8 - Processar Pagamento");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Id do cliente: ");
				int idC = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Endereço: ");
				String endereco = sc.nextLine();
				clientes.add(new cliente(idC, nome, email, endereco));
				System.out.println("Cliente cadastrado!");
				break;

			case 2:
				for (cliente c : clientes) {
					c.visualizarPerfil();
					System.out.println("------");
				}
				break;

			case 3:
				System.out.print("Qual o id do cliente que deseja remover? ");
				idC = sc.nextInt();
				if (clientes.removeIf(c -> c.getIdCliente() == idC)) {
					System.out.println("Cliente removido!");
				} else {
					System.out.println("Cliente não encontrado.");
				}
				break;

			case 4:
				System.out.print("Id: ");
				int idP = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome: ");
				String nomeP = sc.nextLine();
				System.out.print("Preço: ");
				float preco = sc.nextFloat();
				System.out.print("Estoque: ");
				int estoque = sc.nextInt();
				produtos.add(new produto(idP, nomeP, preco, estoque));
				System.out.println("Produto cadastrado!");
				break;

			case 5:
				for (produto p : produtos) {
					System.out.println(p.getIdProduto() + " - " + p.getNome() + " - R$ " + p.getPreco());
				}
				break;

			case 6:
				System.out.print("Qual o id do produto que deseja remover? ");
				idP = sc.nextInt();
				if (produtos.removeIf(p -> p.getIdProduto() == idP)) {
					System.out.println("Produto removido!");
				} else {
					System.out.println("Produto não encontrado.");
				}
				break;

			case 7:
				
				if (clientes.isEmpty() || produtos.isEmpty()) {
					System.out.println("É necessário ter clientes e produtos cadastrados primeiro.");
					break;
				}

				System.out.print("Informe o id do cliente: ");
				idC = sc.nextInt();
				cliente clienteSelecionado = null;
				for (cliente c : clientes) {
					if (c.getIdCliente() == idC) {
						clienteSelecionado = c;
						break;
					}
				}
				if (clienteSelecionado == null) {
					System.out.println("Cliente não encontrado.");
					break;
				}
				
				carrinho novoCarrinho = new carrinho(idC, "Carrinho de " + clienteSelecionado.getNome(), 0);
				int idProd;
				do {
					System.out.println("Digite o id do produto para adicionar ao carrinho (0 para finalizar): ");
					idProd = sc.nextInt();
					if (idProd != 0) {
						produto prodSel = null;
						for (produto p : produtos) {
							if (p.getIdProduto() == idProd) {
								prodSel = p;
								break;
							}
						}
						if (prodSel != null) {
							System.out.print("Quantidade: ");
							int qtd = sc.nextInt();
							novoCarrinho.adicionarProduto(prodSel);
						} else {
							System.out.println("Produto não encontrado.");
						}
					}
				} while (idProd != 0);

				pedido novoPedido = new pedido(pedidos.size() + 1, clienteSelecionado, novoCarrinho, "Aberto");
				pedidos.add(novoPedido);
				System.out.println("Pedido criado com sucesso! ID: " + novoPedido.getIdPedido());
				break;

			case 8:
				if (pedidos.isEmpty()) {
					System.out.println("Não há pedidos para processar.");
					break;
				}
				System.out.print("Informe o id do pedido para pagar: ");
				int idPedido = sc.nextInt();
				pedido pedidoSel = null;
				for (pedido ped : pedidos) {
					if (ped.getIdPedido() == idPedido) {
						pedidoSel = ped;
						break;
					}
				}
				if (pedidoSel == null) {
					System.out.println("Pedido não encontrado.");
					break;
				}

				float valor = pedidoSel.getCarrinho().calcularTotal();
				sc.nextLine();
				System.out.print("Método de pagamento: ");
				String metodo = sc.nextLine();

				pagamento pg = new pagamento(pedidoSel, valor, metodo, "Pendente");
				pg.processarPagamento();
				pg.verificarStatus();
				pedidoSel.AtualizarStatus("Pago");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}

}
