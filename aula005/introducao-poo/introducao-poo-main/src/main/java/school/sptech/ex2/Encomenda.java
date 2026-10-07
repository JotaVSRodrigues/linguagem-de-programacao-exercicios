package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double calcularFrete() {
        Double valorAdicionado = 0.0;

        if (tamanho.equals("P")) {
            valorAdicionado += valorProduto * 0.01;
        } else if (tamanho.equals("M")) {
            valorAdicionado += valorProduto * 0.03;
        } else if (tamanho.equals("G")) {
            valorAdicionado += valorProduto * 0.05;
        }

        if (distancia <= 50) {
            valorAdicionado += 3.0;
        } else if (distancia <= 200) {
            valorAdicionado += 5.0;
        } else if (distancia > 200) {
            valorAdicionado += 7.0;
        }

        return valorAdicionado;
    }

    void aplicarCupomDeDesconto(Integer percentual) {
        Double valorPercentual = valorProduto * (Double.valueOf(percentual) / 100);
        valorProduto = valorProduto - valorPercentual;
    }

    Double valorTotalDaEncomenda() {
        return valorProduto + calcularFrete();
    }
}
