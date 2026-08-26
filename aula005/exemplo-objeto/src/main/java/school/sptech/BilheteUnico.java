package school.sptech;

public class BilheteUnico {

    // atributos -> fields
    String titular;
    String codigo;
    Double saldo;
    Boolean isIdoso;
    Boolean isPCD;
    Boolean isEstudante;
    String cor;

    Boolean recarregar(Double valorRecarga) {
        if (valorRecarga == null || valorRecarga.isNaN() || valorRecarga <= 0) {
            System.out.println("Valor inválido para recarga");
            return false;
        }

        if (valorRecarga > 300) {
            System.out.println("Valor máximo de recarga atingido");
            return false;
        }

        this.saldo = this.saldo + valorRecarga;
        return true;
    }

    Boolean passar() {
        if (this.isIdoso || this.isPCD) {
            System.out.println("Bilhete passado com sucesso");
            return true;
        }
        if (this.isEstudante && this.saldo > 2.40) {
            System.out.println("Bilhete passado com sucesso");
            this.saldo = this.saldo - 2.40;
            return true;
        }

        if (this.saldo > 5.60) {
            System.out.println("Bilhete passado com sucesso");
            this.saldo = this.saldo - 5.60;
            return true;
        }

        System.out.println("Bilhete não foi passado com sucesso");

        return false;
    }

    void printar() {
        System.out.printf(
                """
                titular: %s,
                codigo: %s,
                saldo: %s,
                cor: %s,
                isPCD: %s,
                isIdoso: %s,
                isEstudante: %s
                """, this.titular, this.codigo, this.saldo, this.cor, this.isPCD, this.isIdoso, this.isEstudante
        );
    }
}
