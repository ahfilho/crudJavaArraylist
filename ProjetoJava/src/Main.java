import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import AcoesProduto.Produto;
import Pessoa.*;

public class Main {

	static Cliente cliente = new Cliente();
	static Produto produto = new Produto();
	// objeto estático para acessar todos os métodos e atributos/
	// assim não precisa criar vários objetos

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		Scanner menu = new Scanner(System.in);

		System.out.println("MENU DE OPCOES");
		System.out.println("1 ------- SALVAR");
		System.out.println("2 ------- LISTAR");
		System.out.println("3 ------- ALTERAR");
		System.out.println("4 ------- REMOVER");

		System.out.println("\n OPCAO ESCOLHIDA: \n");

		int op = menu.nextInt();
		switch (op) {
			case 1:
				salvarCliente();
				break;
			case 2:
				listar();
				break;
			case 3:
				alterar();
				break;
			case 4:
				removeCliente();
				break;
			case 5:
				// cadastrarProduto();
				break;
		}

	}

	public static boolean salvarCliente() {
		Pessoa pessoa = new Pessoa();

		Scanner scan = new Scanner(System.in);
		// scan pega numeros
		Scanner scaner = new Scanner(System.in);
		// sc pega texto
		System.out.println("CADASTRAR NOVO CLIENTE \n");
		System.out.print("ID: ");
		pessoa.setId(scan.nextLong());

		cliente.verificaId(pessoa);
		if (cliente.verificaId(pessoa) == true) {
			System.out.println("JÁ EXISTE.\n");
		} else {
			System.out.print("NOME: ");
			pessoa.setNome(scaner.nextLine());

			System.out.print("CPF: ");
			pessoa.setCpf(scan.nextInt());

			System.out.print("Telefone: ");
			pessoa.setTelefone(scan.nextInt());

			System.out.print("E-mail: ");
			pessoa.setEmail(scaner.nextLine());

			System.out.print("Rua: ");
			pessoa.setRua(scaner.nextLine());

			System.out.print("Nº: ");
			pessoa.setNumeroCasa(scan.nextInt());

			System.out.print("Complemento: ");
			pessoa.setComplemento(scaner.nextLine());

			System.out.print("Bairro: ");
			pessoa.setBairro(scaner.nextLine());

			System.out.print("Cidade: ");
			pessoa.setCidade(scaner.nextLine());

			System.out.print("Estado: ");
			pessoa.setEstado(scaner.nextLine());

			boolean salvo;
			salvo = cliente.salvar(pessoa);
			if (salvo) {
				System.out.println("\n***** SALVO COM SUCESSO ***** \n\n");

			}
		}
		menu();

		return true;
	}

	public static boolean removeCliente() {
		List<Pessoa> lista = new ArrayList<Pessoa>();

		Pessoa pessoa = new Pessoa();

		Scanner sca = new Scanner(System.in);
		System.out.print("ID A REMOVER: ");
		pessoa.setId(sca.nextLong());

		cliente.verificaRemover(pessoa);
		if (cliente.verificaRemover(pessoa) == true) {
			System.out.println("ID INVALIDO");
			menu();
		}
		boolean remove;
		remove = cliente.remover(pessoa.getId());
		if (remove) {
			System.out.println("\nPESSOA REMOVIDA COM SUCESSO");
			menu();
		}
		return true;
	}

	public static void listar() {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		// uma lista para comportar os objetos

		lista = cliente.ListarClientes();
		for (Pessoa pessoa : lista) {

			System.out.println("------LISTA DAS PESSOAS------\n");
			System.out.println("ID: " + pessoa.getId());
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Cpf: " + pessoa.getCpf());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("E-mail: " + pessoa.getEmail());
			System.out.println("Rua: " + pessoa.getRua());
			System.out.println("Nº: " + pessoa.getNumeroCasa());
			System.out.println("Complemento: " + pessoa.getComplemento());
			System.out.println("Bairro: " + pessoa.getBairro());
			System.out.println("Cidade: " + pessoa.getCidade());
			System.out.println("Estado: " + pessoa.getEstado());
			System.out.println("---------------------------------- \n\n");

			System.out.println("\nTAMANHO DA LISTA:" + lista.size() + "\n");

		}

		menu();

	}

	public static void alterar() {

		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

		Pessoa pessoa = new Pessoa();
		Scanner pegaTexto = new Scanner(System.in);
		Scanner pegaNumero = new Scanner(System.in);

		System.out.println("ID a alterar");
		pessoa.setId(pegaNumero.nextLong());

		cliente.Alterar(pessoa);

		System.out.println("------ ALTERAÇÃO DE CADASTRO DE PESSOA------");
		System.out.print("ID: ");
		pessoa.setId(pegaNumero.nextLong());
		System.out.print("Nome: ");
		pessoa.setNome(pegaTexto.nextLine());
		System.out.print("Cpf: ");
		pessoa.setCpf(pegaNumero.nextInt());
		System.out.print("Telefone: ");
		pessoa.setTelefone(pegaNumero.nextInt());
		System.out.print("E-mail: ");
		pessoa.setEmail(pegaTexto.nextLine());
		System.out.print("Rua: ");
		pessoa.setRua(pegaTexto.nextLine());
		System.out.print("Nº ");
		pessoa.setNumeroCasa(pegaNumero.nextInt());
		System.out.print("Complemento: ");
		pessoa.setComplemento(pegaTexto.nextLine());
		System.out.print("Bairro: ");
		pessoa.setBairro(pegaTexto.nextLine());
		System.out.print("Cidade: ");
		pessoa.setCidade(pegaTexto.nextLine());
		System.out.print("Estado: ");
		pessoa.setEstado(pegaTexto.nextLine());
		System.out.println("----------------------------------");

		listar();
		menu();
	}

}
