import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class manipulacaoArquivosNIO {
    static String escreverArquivo(String nomeArquivo, String conteudo) {
        try {
            Path path = Paths.get(nomeArquivo);
            Files.write(path, conteudo.getBytes());
        } catch (IOException e) {
            return "Erro ao escrever o arquivo: " + e.getMessage();
        }
        return "Arquivo escrito com sucesso!";
    }

    static String lerDoArquivo(String nomeArquivo) {
        try {
            Path path = Paths.get(nomeArquivo);
            byte[] bytes = Files.readAllBytes(path);
            String conteudo = new String(bytes);
            return conteudo;
        } catch (IOException e) {
            return "Erro ao ler o arquivo: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(escreverArquivo("meuArquivoNIO.txt", "Arquivo NIO criado com sucesso!"));
            System.out.println(escreverArquivo("meuArquivoNIO.txt", "Novo Conteudo do Arquivo NIO!"));
            System.out.println(lerDoArquivo("meuArquivoNIO.txt"));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
