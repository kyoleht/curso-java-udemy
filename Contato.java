import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Contato implements Serializable {
    String nome;
    int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Contato> listaDeContatos = new ArrayList<>();
    
        Contato contato1 = new Contato("Rafael", 123456789);
        Contato contato2 = new Contato("Jessica", 987654321);
    
        FileOutputStream fos;
        fos = new FileOutputStream("contato.ser");
    
        ObjectOutputStream outputstream;
        outputstream = new ObjectOutputStream(fos);
    
        outputstream.writeObject(listaDeContatos);
    
        FileInputStream fis;
        fis = new FileInputStream("contato.ser");
        
        ObjectInputStream inputstream;
        inputstream = new ObjectInputStream(fis);
    
        List<Contato> contatosLidos;
        contatosLidos = (List<Contato>) inputstream.readObject();
    }
}


