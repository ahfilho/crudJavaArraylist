package AcoesProduto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoFaz {
    List<Produto> lista = new ArrayList<Produto>();

    public boolean cadastrarProduto(Produto produto) {
        try {
            lista.add(produto);
        } catch (Exception e) {
            System.out.println("ERRO AO SALVAR PRODUTO");
        }
        return false;

    }

}
