package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(11);
        Integer numeroAleatorio2 = ThreadLocalRandom.current().nextInt(10, 21);
        System.out.println("Numero aleatorio: " + numeroAleatorio);
        System.out.println("Numero aleatorio: " + numeroAleatorio2);

//        Math.random();
    }
}
