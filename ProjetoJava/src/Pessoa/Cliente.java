package Pessoa;

import java.util.List;
import java.util.ArrayList;

public class Cliente implements AcoesPessoa {

	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	// static Pessoa pessoa = new Pessoa();

	@Override
	public boolean salvar(Pessoa pessoa) {

		try {
			// TENTA ADICIONA UMA PESSOA À LISTA
			lista.add(pessoa);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@Override
	public boolean remover(Long id) {

		for (Pessoa pessoa : lista) { // PERCORRE O ARRAYLIST
			if (pessoa.getId().equals(id)) { // COMPARA OS ID'S
				lista.remove(pessoa); // E SE DER CERTO REMOVE DA LISTA
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Pessoa> ListarClientes() {
		if (lista.size() == 0) { // SE A LISTA FICAR VAZIA, RETORNA ZERO.
			System.out.println("LISTA VAZIA");

		}
		return lista;
	}

	@Override
	public boolean Alterar(Pessoa pessoa) {

		for (Pessoa pessoa1 : lista) { // PERCORRE A LISTA
			if (pessoa1.getId() == pessoa.getId()) { // E COMPARA OS ID'S, DA LISTA (PESSOA1) E O ID PASSADO COMO
														// PARÂMETRO
				lista.remove(pessoa1); // ENTÃO REMOVE A PESSOA1
				lista.add(pessoa); // E ADICIONA UMA PESSOA
			}
		}
		return false;
	}

	@Override
	public boolean verificaId(Pessoa pessoa) {
		for (Pessoa pessoa1 : lista) { // VERIFICA SE EXISTE UM OBJETO COM O MESMO ID
			if (pessoa1.getId() == pessoa.getId()) { // SE EXISTIR EXIBE UM ALERTA E VOLTA PARA O MENU
				return true;
			}
			if (pessoa1.getId() != pessoa.getId()) {
				return false;
			}
			if (lista.isEmpty()) {
				System.out.println("VAZIO");
			}
		}
		return false;
	}

	@Override
	public boolean verificaRemover(Pessoa pessoa) {
		for (Pessoa pessoa1 : lista) {
			// percorre a lista
			if (pessoa1.getId() != pessoa.getId()) {
				return true;
			}

		}

		return false;
	}

}