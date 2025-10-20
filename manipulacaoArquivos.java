import java.io.*;

public class manipulacaoArquivos {
    String escreverArquivo(String nomeArquivo, String conteudo) throws IOException {
        try {
            FileWriter writer = new FileWriter("ArquivoIO.txt");
            writer.write("Arquivo criado com sucesso!");
            writer.close();
            return "Arquivo escrito com sucesso!";
        } catch (IOException e) {
            return "Erro ao escrever o arquivo: " + e.getMessage();
        }
    }

    String lerDoArquivo(String nomeArquivo) throws IOException {
        StringBuilder conteudo = new StringBuilder();
        try (FileReader reader = new FileReader("ArquivoIO.txt")) {
            int data = reader.read();
            while(data != -1) {
                conteudo.append((char)data);
                data = reader.read();
            }
            return conteudo.toString();
        } catch (IOException e) {
            return "Erro ao ler o arquivo: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        manipulacaoArquivos manipula = new manipulacaoArquivos();
        try {
            System.out.println(manipula.escreverArquivo("ArquivoIO.txt", "Arquivo criado com sucesso!"));
            manipula.lerDoArquivo("ArquivoIO.txt");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

