package school.sptech.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Leitor {

    public void ler() throws FileNotFoundException { // isso vai forçar que quem instanciar o metodo trate com try catch
        FileInputStream fileStream = new FileInputStream("texto.txt");
    }
}
