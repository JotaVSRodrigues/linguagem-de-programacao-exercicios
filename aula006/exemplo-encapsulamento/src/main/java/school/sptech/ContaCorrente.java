package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {
    String numero;
    String titular;
    String telefone;
    String email;
    Double saldo;

    // Construtor -> metodo especial responsavel por instanciar novos objetivos
    public ContaCorrente() {
    }

    public ContaCorrente(String titular, String telefone, String email) {
        this.numero = String.valueOf(ThreadLocalRandom.current().nextInt(1000, 2000));
        this.titular = titular;
        this.telefone = telefone;
        this.email = email;
        this.saldo = 0.0;
    }

    public ContaCorrente(String numero, String titular, String telefone, String email, Double saldo) {
        this(titular, telefone, email);
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar (Double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    void sacar (Double valor) {
        if (valor == null || valor <= 0) {
            System.out.println("Valor invalido para saque");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente :( ");
            return;
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
    }

    void printarInformacoes() {
        String mensagem = """
                ========================================
                
                Titular: %s
                Número: %s
                Saldo: %.2f
                Email: %s
                Telefone %s
                
                ========================================
                """.formatted(titular, numero, saldo, email, telefone);

        System.out.println(mensagem);
    }


    public void setTelefone(String telefone) {
        if (telefone == null || telefone.length() > 11) {
            return;
        }

        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return """
                ========================================
                
                Titular: %s
                Número: %s
                Saldo: %.2f
                Email: %s
                Telefone %s
                
                ========================================
                """.formatted(titular, numero, saldo, email, telefone);
    }
}
