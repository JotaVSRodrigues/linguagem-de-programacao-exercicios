package school.sptech;

import java.util.ArrayList;
import java.util.List;

// herdam RuntimeException

public class UncheckedException {
    public static void main(String[] args) {
        // NullPointerException
        try {
            String nome = null;
            System.out.println("nome lowercase: " + nome.toLowerCase());

            List<String> frutas = new ArrayList<>();
            frutas.get(10);

        } catch (NullPointerException e) {
            System.out.println("Nome nao pode ser nulo - " + e.getMessage());
            e.printStackTrace();
//            e.getCause();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index invalido - " + e.getMessage());
            e.printStackTrace();
        }



        // IndexOutOfBoundException


    }
}
