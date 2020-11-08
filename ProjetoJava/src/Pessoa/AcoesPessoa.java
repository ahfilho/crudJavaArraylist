package Pessoa;

import java.util.List;

public interface AcoesPessoa {

	public boolean salvar(Pessoa pessoa);

	public boolean remover(Long id);

	public List<Pessoa> ListarClientes();

	public boolean Alterar(Pessoa pessoa);
	// public boolean autentica(Pessoa pessoa);

	public boolean verificaId(Pessoa pessoa);

	public boolean verificaRemover(Pessoa pessoa);
}
