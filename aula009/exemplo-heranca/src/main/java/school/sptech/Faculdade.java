package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private List<Aluno> alunos;
    private Double totalTCC;

    public void exibirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void matricularAluno(Aluno aluno) {
        alunos = new ArrayList<>();
        alunos.add(aluno);
    }

    public Double calcularMediaTCC() {
        // Pattern matching
        totalTCC = 0.0;
        Integer quantidadeTCC = 0;
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPos alunoPos) {
                totalTCC += alunoPos.getNotaTCC();
                quantidadeTCC++;
            }
        }

        return totalTCC / quantidadeTCC;
    }
}
