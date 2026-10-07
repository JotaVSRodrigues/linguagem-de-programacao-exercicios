package school.sptech.ex6;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    String nomeLista;
    Integer capacidadeMaxima;
    List<String> itens;

    void adicionarItem(String item) {
        if (
                item == null ||
                item.length() <= 0 ||
                itens.size() + 1 > capacidadeMaxima ||
                itens.contains(item)
        ) {
            return;
        }

//        itens = new ArrayList<>();
        itens.add(item);
    }

    Boolean removerItem(String item) {
        if (itens.contains(item)) {
            itens.remove(item);
            return true;
        }
        return false;
    }

    String obterItem(Integer posicao) {
        if (
                posicao < 0 ||
                posicao > itens.size() - 1 ||
                posicao == null ||
                itens.size() < 1
        ) {
            return null;
        }

        return itens.get(posicao);
    }

    Boolean substituirItem(Integer posicao, String itemNome) {
        if (
                posicao == null ||
                posicao < 0 ||
                posicao > itens.size() ||
                itemNome == null ||
                itens.get(posicao).equals(itemNome) ||
                itens.get(posicao) == null ||
                itens.contains(itemNome)
        ) {
            return false;
        }

        itens.set(posicao, itemNome);
        return true;
    }

    Integer calcularVagasRestantes() {
        return capacidadeMaxima - itens.size();
    }

    String removerItemNaPosicao(Integer posicao) {
        if (posicao == null || posicao < 0 || posicao > itens.size()) {
            return null;
        }
        String item = itens.get(posicao);
        itens.remove(item);
        return item;
    }

    Integer removerItensDuplicados() {

        List<String> itensSemDupli = new ArrayList<>();
        Integer itensRemovidos = 0;
        for (String item : itens) {

            if (!itensSemDupli.contains(item)) {
                itensSemDupli.add(item);
                continue;
            }

            itensRemovidos++;
        }
        itens = itensSemDupli;
        return itensRemovidos;
    }
}
