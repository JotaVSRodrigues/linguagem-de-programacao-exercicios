package school.sptech.service;

import school.sptech.entity.Produto;

import java.io.*;
import java.util.List;

public class Escritor {

    // OutputStream -> fluxo de saida de bytes
    // FileOutputStream -> para escrever arquivos
    // ByteArrayOutputStream -> escrever em memoria
    // PrintStream (extra) -> escreve a saida formatada

    public void escrever(String nomeArquivo, List<Produto> produtos) {
        // try-with-resourcers
        // try-resourcers
        try (FileOutputStream outputStream = new FileOutputStream(nomeArquivo, false);
            OutputStreamWriter streamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(streamWriter)) {

            String cabecalho = "nome;preco;categoria;estoque";
            bufferedWriter.write(cabecalho);
            bufferedWriter.newLine();

            for (Produto produto : produtos) {
                String linha = "%s;%.2f;%s;%d"
                        .formatted(
                                produto.getNome(),
                                produto.getValor(),
                                produto.getCategoria(),
                                produto.getEstoque()
                        );
                bufferedWriter.write(linha);
                bufferedWriter.newLine();

            }
            System.out.println("Arquivo escrito com sucesso");
//            outputStream.close(); ===> não precisa com o try-resources
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo - " + e.getMessage());
        }
    }
}

//            bufferedWriter.write("nome;idade");
//            bufferedWriter.newLine();
//            bufferedWriter.write("joao;20");
//            bufferedWriter.newLine();
//            bufferedWriter.write("marcos;40");
