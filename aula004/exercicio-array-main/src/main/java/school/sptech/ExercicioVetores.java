package school.sptech;

import java.util.*;

public class ExercicioVetores {
    Integer somar(Integer[] vetor) {
        Integer soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma;
    }

    Double calcularMedia(Double[] notas) {
        Double soma = 0.0;
        Integer contador = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            contador++;
        }

        return soma / contador;
    }

    Integer buscarMaiorNumero(Integer[] vetor) {
        Integer maiorNumero = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (maiorNumero < vetor[i]) maiorNumero = vetor[i];
        }

        return maiorNumero;
    }

    Integer calcularDecimal(Integer[] binario) {
        Integer soma = 0;
        Integer indice = 0;
        for (int i = binario.length - 1; i > -1; i--) {
            if (binario[i].equals(1)) {
                Integer potencia = (int) Math.pow(2, indice);
                soma+=potencia;
            }
            indice++;
        }
        return soma;
    }

    Character[] inverter(Character[] vetor)  {
        Character[] novoVetor = new Character[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[vetor.length - 1 - i];
        }

        return novoVetor;
    }

    Integer[] mesclar(Integer[] vetor1, Integer[] vetor2) {
        Set<Integer> setInt = new TreeSet<>();
        for (int i = 0; i < vetor1.length; i++) {
            setInt.add(vetor1[i]);
        }
        for (int i = 0; i < vetor2.length; i++) {
            setInt.add(vetor2[i]);
        }

        return setInt.toArray(new Integer[0]);
    }

    Integer[] somarDois(Integer[] vetor, Integer alvo) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < vetor.length; i++) {
            Integer numFaltante = alvo - vetor[i];
            if (hashMap.containsKey(numFaltante)) {
                return new Integer[]{hashMap.get(numFaltante), i};
            }
            hashMap.put(vetor[i], i);
        }
        return null;
    }
}