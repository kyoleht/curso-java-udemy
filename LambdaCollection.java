import java.util.*;

public class LambdaCollection {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.removeIf(n -> n % 2 == 0);
        
        System.out.println("Números ímpares dentro do array: " + numeros);
    }
}
