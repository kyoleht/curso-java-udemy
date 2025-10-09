import java.util.*;

public class ListExercise {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();
        filmes.add("Homem-Aranha: De Volta ao Lar");
        filmes.add("Batman: O Cavaleiro das Trevas");
        filmes.add("Vingadores: Ultimato");
        filmes.add("Tenet");
        filmes.add("Interestelar");

        System.out.println("Total de filmes na lista: " + filmes.size());
        System.out.println("Checando 'Batman: O Cavaleiro das Trevas':" + filmes.contains("Batman: O Cavaleiro das Trevas")); // true
        System.out.println("Checando 'Matrix':" + filmes.contains("Matrix")); // false
        System.out.println("Lista de filmes: " + filmes);
    }
}
