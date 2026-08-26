package school.sptech;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // vetor é estático
        // String[] nomes = new String[];

        // List -> ArrayList que é dinâmico
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Isabella");
        nomes.add("Professor Lucas");
        nomes.add("Professor Rosim");

        // .size() != .length
        System.out.println(nomes + " " + nomes.size());

//        List<String> nomesLinked = new LinkedList<>();
        // Remover um nome
//        nomes.remove("Joao");

        nomes.removeIf(s -> s.contains("P"));
        System.out.println(nomes);

//        nomes.getLast();

        // quero atualizar um valor


        try {
            nomes.set(1, "Maicon");
            System.out.println(nomes);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        nomes.replaceAll(s -> s.toLowerCase());
        System.out.println(nomes);

        List<String> frutas = new ArrayList<>(List.of("Banana", "Pera", "Carambola", "Mamao", "Maca", "Laranja"));
//        frutas.add("Melancia"); --> deu erro
        System.out.println(frutas);

        // Enhanced for (for aprimorado)
        // remover frutas que comecam com "m"
//        for (String fruta : frutas) {
//            System.out.println(fruta);

            // ISSO NAO FUNCIONA -> ja tem uma thread rolando -> nao rola de fazer isso dentro de um enhanced for
//            if (fruta.startsWith("M")) {
//                frutas.remove(fruta);
////                frutas.removeIf(s -> s.startsWith("M"));
//            }

//        }


        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));

            if (frutas.get(i).startsWith("M")) {
                frutas.remove(frutas.get(i));
                i--;
            }
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);

        int paraRemover = 2; // se for Integer, ele remove o valor ao inves do indice
        numeros.remove(paraRemover);
        System.out.println(numeros);
    }
}