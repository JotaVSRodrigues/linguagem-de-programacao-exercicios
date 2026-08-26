package school.sptech;

public class LacosRepeticao {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("For com i: " + i );
//        }
//
//        for (int i = 9; i >= 0; i--) {
//            System.out.println("For com menos i: " + i);
//        }

        int contador = 11;
        while (contador < 10) {
            System.out.println("Estou no while " + contador);
            contador++;
        }

        int contadorDoWhile = 11;
        do {
            System.out.println("Contador do-while " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 10);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
        }
    }
}
