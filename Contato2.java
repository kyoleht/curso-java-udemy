import java.io.*;
import java.util.*;

public class Contato2 implements Serializable{
    public String nome;
    public int telefone;

    public Contato2(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public static void serializarContato(List<Contato2> listaContatos) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
            oos.writeObject(listaContatos);
            System.out.println("Contatos serializados e salvos com sucesso.");
        }
    }

    @SuppressWarnings("unchecked")
    public static void desserializarContato() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
            List<Contato2> contatosLidos = (List<Contato2>) ois.readObject();
            for (Contato2 contato : contatosLidos) {
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
            }
        }
    }

    public static void main(String[] args) {
        Contato2 contato1 = new Contato2("Rafael", 1234567890);
        Contato2 contato2 = new Contato2("Jessica", 987654321);
        Contato2 contato3 = new Contato2("Marcos", 348904545);
        Contato2 contato4 = new Contato2("Ana", 999548694);

        List<Contato2> listaDeContatos = new ArrayList<>(); 
        listaDeContatos.add(contato1);
        listaDeContatos.add(contato2);
        listaDeContatos.add(contato3);
        listaDeContatos.add(contato4);

        try {
            serializarContato(listaDeContatos);
            desserializarContato();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

