package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer qtdDesejada) {
        if (qtdDesejada == null || qtdDesejada < 0) {
            return;
        }

        if (quantidadeEmEstoque < qtdDesejada) {
            return;
        }
        quantidadeVendida += qtdDesejada;
        quantidadeEmEstoque -= qtdDesejada;
    }

    void aumentarEstoque(Integer qtdAdicionada) {
        if (qtdAdicionada == null) {
            return;
        }

        if (qtdAdicionada < 0) {
            quantidadeEmEstoque -= qtdAdicionada;
        }

        quantidadeEmEstoque += qtdAdicionada;
    }

    Integer quantidadeDisponivel() {
        return quantidadeEmEstoque;
    }

    Double totalVendido() {
        return valor * quantidadeVendida;
    }
}
