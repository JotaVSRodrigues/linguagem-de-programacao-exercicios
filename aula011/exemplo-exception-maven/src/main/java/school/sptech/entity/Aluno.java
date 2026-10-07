package school.sptech.entity;

import school.sptech.exception.AlunoInvalidoException;
import school.sptech.exception.DocumentoInvalidoException;
import school.sptech.exception.ValorInvalidoException;

public class Aluno {
    private String nome;
    private String documento;
    private Double nota;
    private Double individual;

    public Aluno(String nome, String documento) throws AlunoInvalidoException {
        if (nome == null || documento == null) {
            throw new AlunoInvalidoException("Nome e documento obrigatorio");
        }
        this.nome = nome;
        this.documento = documento;
    }

    public Double calcularNotaFinal() {
        if (nota == null || individual == null) {
            throw new ValorInvalidoException("Nota ou nota do Individual invalidos");
        }

        return nota * 0.3 + individual * 0.7;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null) {
            throw new DocumentoInvalidoException("O documento nao pode ser nulo");
        }

        if (documento.isEmpty()) {
            throw new DocumentoInvalidoException("O documento nao pode estar vazio");
        }

        if (documento.length() != 11) {
            throw new DocumentoInvalidoException("O documento deve ter 11 caracteres");
        }

        this.documento = documento;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getIndividual() {
        return individual;
    }

    public void setIndividual(Double individual) {
        this.individual = individual;
    }

    @Override
    public String       toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", nota=" + nota +
                ", individual=" + individual +
                '}';
    }
}
