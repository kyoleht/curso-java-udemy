import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploNIO {
    public static void main(String[] args) {
        Path path = Paths.get("Arquivo.txt");
        try {
            // Escrevendo em um arquivo
            Files.write(path, "Olá, Mundo NIO!".getBytes());

            // Lendo do arquivo
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);
            System.out.println("Conteúdo do arquivo: " + content);

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
