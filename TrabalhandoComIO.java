import java.io.*;

public class TrabalhandoComIO {
    public static void main(String[] args) {
        System.out.println("Trabalhando com Entrada e Saída de Dados");
        try {
            FileWriter writer = new FileWriter("meuArquivo.txt");
            writer.write("Olá, este é um arquivo de texto criado em Java!\n");
            writer.close();

            FileReader reader = new FileReader("meuArquivo.txt");
            int data = reader.read(); // lê o arquivo
    
            while (data != -1) {
                System.out.print((char)data);
    
                data = reader.read();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
