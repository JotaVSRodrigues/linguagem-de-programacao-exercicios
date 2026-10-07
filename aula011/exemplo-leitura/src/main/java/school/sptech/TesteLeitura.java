package school.sptech;

import school.sptech.entity.Livro;
import school.sptech.service.Leitor;

import java.util.List;

public class TesteLeitura {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        leitor.ler("teste.txt");

        List<Livro> livrosLidos = leitor.importarLivros("base-dados-livro.csv");

        System.out.println(livrosLidos);
    }
}
