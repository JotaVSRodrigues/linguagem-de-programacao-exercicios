package school.sptech;

public class Interpolacao {
    public static void main(String[] args) {
        String name = "João";
        Integer idade = 18;
        Double altura = 1.72;
        String comida = "feijoada";

        String mensagem = "Meu nome é: %s, logo eu gosto de comer %s. Tambem tenho %d anos e %.2f de altura. Teste: 25%x".formatted(name, comida, idade, altura);
        System.out.println(mensagem);

        String texto = """
            Meu nome é
                """;

        System.out.printf("Meu nome é: ", name);
    }
}
