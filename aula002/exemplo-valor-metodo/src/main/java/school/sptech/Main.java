package school.sptech;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class    Main {
    public static void main(String[] args) {
//        int[] numeros = new int[10];
//        System.out.println(Arrays.toString(numeros));
//
//        ArrayList<Integer> numerosArr = new ArrayList<>();
//        numerosArr.add(20);
//        numerosArr.add(90);
//        System.out.println(numerosArr);
//
//        String[] frutas = {"Banana", "Melancia"};
//        System.out.println("Tamanho do vetor de frutas: " + frutas.length);
//
//        System.out.println();
//
//        for (int i = frutas.length - 1; i >= 0; i--) {
//
//        }
//
//        Boolean[] likes = {true, false, false, true};
//        for (Boolean like : likes) {
//            String mensagem = like ? "Deu like :)" : "Nao deu like :(";
//            System.out.println(mensagem);
//        }
//
//        String[] nomes = new String[3];
//        int indexDigitado = 5;
//
//        nomes[indexDigitado] = "Lucas";

        Integer[] vetorInteiros = new Integer[3];
        vetorInteiros[0] = 12;
        vetorInteiros[1] = 5;
        vetorInteiros[2] = 7;

        Calculadora calculadora = new Calculadora();
//        calculadora.somarVetor(vetorInteiros);
        calculadora.calcularMedia(vetorInteiros);
    }
}