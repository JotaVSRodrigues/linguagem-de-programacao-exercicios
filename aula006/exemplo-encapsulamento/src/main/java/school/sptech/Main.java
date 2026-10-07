package school.sptech;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta01 = new ContaCorrente();
        conta01.numero = "1234";
        conta01.titular = "Joao Vitor";
        conta01.saldo = 0.0;
        conta01.telefone = "11934230471";
        conta01.email = "joao.rdg119@gmail.com";

        // conta01.printarInformacoes();

        ContaCorrente conta02 = new ContaCorrente("João Rodrigues", "11959990471", "joaozito@gmail.com");
        conta02.depositar(490.0);
        conta01.setTelefone("11911110123");

        // conta02.printarInformacoes();
        System.out.println(conta02);
    }
}