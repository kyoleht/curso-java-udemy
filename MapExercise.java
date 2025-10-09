import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz", 20);
        estoque.put("Feijão", 15);
        estoque.put("Macarrão", 13);
        estoque.put("Carne", 12);
        estoque.put("Frango", 10);

        System.out.println("Quantidade de 'Arroz' no estoque: " + estoque.get("Arroz")); // 20
        System.out.println("Quantidade de 'Batata' no estoque: " + estoque.get("Batata")); // null (ainda não adicionamos no estoque)

        var quantidadeARemover = 2;
        estoque.put("Macarrão", estoque.get("Macarrão") - quantidadeARemover);
        System.out.println("Quantidade de 'Macarrão' após compra: " + estoque.get("Macarrão"));

        System.out.println("Itens e quantidade no estoque: " + estoque);
    }
}
