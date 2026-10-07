package school.sptech;

import school.sptech.service.Escritor;
import school.sptech.entity.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Escritor escritor = new Escritor();

        Produto produto01 = new Produto("TV", 2000.5, "Eletronico", 20);
        Produto produto02 = new Produto("Garrafa Frescca", 4.5, "Consumivel", 400);
        Produto produto03 = new Produto("Melao", 5.0, "Fruta", 100);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto01);
        produtoList.add(produto02);
        produtoList.add(produto03);

        escritor.escrever("teste.csv", produtoList);

    }
}
