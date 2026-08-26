package school.sptech;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Pode votar e dirigir");
        } else {
            System.out.println("Não pode votar e nem dirigir");
        }

        String mensagem = idade >= 18 ? "Maior de 18" : "Menor de idade";
        System.out.println(mensagem);
    }
}
