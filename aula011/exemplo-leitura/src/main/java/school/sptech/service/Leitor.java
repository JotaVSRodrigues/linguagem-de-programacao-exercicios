package school.sptech.service;

import school.sptech.entity.Livro;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
    // InputStream -> fluxo de entrada de bytes
    // FileInputStream ->ler arquivos
    // ByteArrayInputStream -> ler em memoria
    public void ler(String nomeArquivo) {
        try (
                InputStream inputStream = new FileInputStream(nomeArquivo);
                InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String linha;
            while((linha = bufferedReader.readLine()) != null) {
                System.out.print(linha);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }
    }

    public List<Livro> importarLivros(String nomeArquivo) {
        List<Livro> livros = new ArrayList<>();

        try (
                InputStream inputStream = new FileInputStream(nomeArquivo);
                InputStreamReader bufferedReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(bufferedReader)
        ) {
            String linha;
            reader.readLine(); // -> pular cabecalho

            while((linha = reader.readLine()) != null) {
                String[] colunas = linha.split((";"));
                if (linha.isBlank() || colunas.length != 8) continue;

                String colunaPrecoMedio = colunas[5].contains(",") ? colunas[5].replace(",", ".") : colunas[5];

                String isbn = colunas[0];
                String titulo = colunas[2];
                Double precoMedio = Double.valueOf(colunaPrecoMedio);
                Livro livro = new Livro(isbn, titulo, precoMedio);

                livros.add(livro);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
        }

        return livros;
    }
}
