package school.sptech.ex4;

import java.util.Arrays;

public class Turma {
    String turma;
    Integer capacidadeMaxima;
    Integer quantidadeAlunosMatriculados;

    void matricularAluno(Integer qtdMatriculas) {
        if (qtdMatriculas == null || qtdMatriculas <= 0) {
            return;
        }

        if (quantidadeAlunosMatriculados + qtdMatriculas > capacidadeMaxima) {
            return;
        }

        quantidadeAlunosMatriculados += qtdMatriculas;
    }

    Double encontrarMaiorNota(Double[] notas) {
        Double maiorNota = notas[0];

        for (Double nota : notas) {
            if (maiorNota < nota) maiorNota = nota;
        }

        return maiorNota;
    }

    Double calcularMediaTurma(Double[] notas) {
        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    Integer contarAprovados(Double[] notas) {
        Integer qtdAprovados = 0;

        for (Double nota : notas) {
            if (nota >= 6.0) qtdAprovados++;
        }

        return qtdAprovados;
    }

    Boolean validarQuantidadeNotas(Double[] notas) {
        if (quantidadeAlunosMatriculados.equals(notas.length)) return true;
        return false;
    }

    Double encontrarNotaMaisProximaDaMedia(Double[] notas) {
        Double media = calcularMediaTurma(notas);
        Double[] diferencas = new Double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] - media < 0) {
                diferencas[i] = (notas[i] - media) * -1;
            } else {
                diferencas[i] = notas[i] - media;
            }
        }

        Double menorDiferenca = diferencas[0];
        for (Double diferenca : diferencas) {
            if (menorDiferenca > diferenca) {
                menorDiferenca = diferenca;
            }
        }

        Integer indice = Arrays.asList(diferencas).indexOf(menorDiferenca);
        return notas[indice];
    }
}
