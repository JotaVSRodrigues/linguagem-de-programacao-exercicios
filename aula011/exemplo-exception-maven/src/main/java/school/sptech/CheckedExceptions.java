package school.sptech;

import school.sptech.entity.Leitor;

import java.io.FileNotFoundException;

// Checked Exceptions: preciso tratar (sou obrigado)
// Erro de compilação se nao tratar
// Herdam de Exception
public class CheckedExceptions {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        try {
            leitor.ler();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
