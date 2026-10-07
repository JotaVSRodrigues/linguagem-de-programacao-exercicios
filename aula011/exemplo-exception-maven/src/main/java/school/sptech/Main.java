package school.sptech;

import school.sptech.entity.Aluno;
import school.sptech.exception.AlunoInvalidoException;
import school.sptech.exception.DocumentoInvalidoException;
import school.sptech.exception.ValorInvalidoException;

public class Main {
    public static void main(String[] args) {
//        try {
//            Aluno aluno01 = new Aluno(null, null);
//            System.out.println(aluno01);
//        } catch (AlunoInvalidoException e) {
//            System.out.println("Aluno invalido - " + e.getMessage());
//            e.printStackTrace();
//        }

//        try {
//
//        } catch (ValorInvalidoException | DocumentoInvalidoException | AlunoInvalidoException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
////            throw new RuntimeException(e);
//        }

        Aluno aluno02 = new Aluno("Joao", "documento.txt");
        aluno02.setIndividual(5.6);
        aluno02.setNota(9.0);

        System.out.println("Nota aluno 2 = " + aluno02.calcularNotaFinal());

        aluno02.setDocumento("new-doc.txt");
        System.out.println(aluno02.getDocumento());

    }

}
