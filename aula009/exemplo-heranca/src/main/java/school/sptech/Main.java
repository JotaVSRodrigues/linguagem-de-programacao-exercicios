package school.sptech;

public class Main {
    public static void main(String[] args) {
        AlunoPos alunoPos01 = new AlunoPos("04261100", "Joao");
        alunoPos01.setAc01(6.0);
        alunoPos01.setAc02(4.0);
        alunoPos01.setAc03(9.0);
        alunoPos01.setNotaTCC(8.0);
//        alunoPos01.setNotaTcc
        System.out.println(alunoPos01);


        Faculdade sptech = new Faculdade();
        sptech.matricularAluno(alunoPos01);
        sptech.exibirAlunos();
        System.out.println("Media TCC - " + sptech.calcularMediaTCC());
    }
}