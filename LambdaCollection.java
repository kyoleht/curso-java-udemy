import java.util.*;
public class LambdaCollection {
    public static void main(String[] args) {
        /* Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.removeIf(n -> n % 2 == 0);
        
        System.out.println("Números ímpares dentro do array: " + numeros); */

        List<String> nomes = new ArrayList<>();
        nomes.add("Rafael");
        nomes.add("Ana");
        nomes.add("Luna");
        nomes.add("Gustavo");
        nomes.add("Juliana");

        // removendo nomes que tenham mais de 6 letras
        nomes.removeIf(str -> str.length() > 6);

        System.out.println("Nomes com 6 ou menos letras: " + nomes);

        // adição de elementos em índices específicos
        nomes.add(0, "Maria");
        nomes.add(3, "Jéssica");
        
        // o forEach itera sobre cada elemento da coleção
        System.out.println();
        System.out.println("Nomes atualizados:");
        nomes.forEach(System.out::println);
    }
}
