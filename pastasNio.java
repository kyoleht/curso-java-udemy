import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pastasNio {
    public static void main(String[] args) {

        Path NioPath = Paths.get("resumo.txt");

        try {
            Files.createDirectories(Paths.get("notas"));

            NioPath = Paths.get("notas/resumo.txt"); // combina o diretório com o nome do arquivo

            Files.write(NioPath, "Resumo do dia: aprendi NIO e achei legal!".getBytes());

            byte[] bytes = Files.readAllBytes(NioPath);

            String content = new String(bytes);

        } catch (Exception e) {

            System.out.println("Erro ao ler arquivo NioPath: " + e.getMessage());
            
        } 
    }
}
