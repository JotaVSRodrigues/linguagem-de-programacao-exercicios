package school.sptech;

public class ComparadorIgual {
    public static void main(String[] args) {
        Integer numeroA = 128;
        Integer numeroB = 128;

        String textoA = new String("teste");
        String textoB = new String("teste");

        String resposta = textoA.equals(textoB) ? "São iguais" : "São diferentes";
        System.out.println(resposta);
//        numeroB = 21;
//        System.out.println(numeroA);

        if (numeroA.equals(numeroB)) {
            System.out.println("Numeros iguais");
        } else {
            System.out.println("Numeros diferentes");
        }

        // USAR == PARA COMPARAR VALORES NULOS, MESMO EM VARIAVEIS TIPO WRAPPER
        String texto1 = null;
        String texto2 = null;

        if (texto1 == texto2) {
            System.out.println("São iguais");
        } else {
            System.out.println("Sao diferentes");
        }
    }
}
