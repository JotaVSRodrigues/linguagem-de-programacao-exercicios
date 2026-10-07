package school.sptech;

public class AlunoPos extends Aluno {
    private Double notaTCC;


    public AlunoPos(String nome, String ra) {
        super(nome, ra);
        this.notaTCC = 0.0;
    }

    @Override
    public Double getNotaFinal() {
        return super.getAc01() * 0.2 +
                super.getAc02() * 0.2 +
                super.getAc03() * 0.2 +
                this.notaTCC * 0.4;
    }


    public Double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(Double notaTCC) {
        this.notaTCC = notaTCC;
    }
}
