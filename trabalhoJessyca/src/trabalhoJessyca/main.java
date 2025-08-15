package trabalhoJessyca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<cliente> clientes = new ArrayList<>();
		List<produto> produtos = new ArrayList<>();

		int opcao;
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Remover Cliente");
			System.out.println("4 - Cadastrar Produto");
			System.out.println("5 - Listar Produtos");
			System.out.println("6 - Remover Produto");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Id do cliente: ");
				int idC = sc.nextInt();
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Endereço: ");
				String endereco = sc.next();
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
				System.out.print("Qual o id do cliente que deseja remover?");
				idC = sc.nextInt();
				clientes.remove(idC);
				break;
			case 4:
				System.out.print("Id: ");
				int idP = sc.nextInt();
				System.out.print("Nome: ");
				String nomeP = sc.next();
				System.out.print("Preço: ");
				Float preco = sc.nextFloat();
				System.out.print("Estoque: ");
				int estoque = sc.nextInt();
				produtos.add(new produto(idP, nomeP, preco, estoque));
				System.out.println("Produto cadastrado!");
				break;
			case 5:
				for (produto p : produtos) {
					System.out.println(p.getNome() + " - R$ " + p.getPreco());
				}
				break;
			case 6:
				System.out.print("Qual o id do produto que deseja remover?");
				idP = sc.nextInt();
				produtos.remove(idP);
				break;
			}
		} while (opcao != 0);
	}

}
