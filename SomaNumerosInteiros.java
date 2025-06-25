// Escrever um programa Java que calcule a soma de todos os números inteiros positivos menores ou iguais a esse número.

public class SomaNumerosInteiros {  
    public static void main(String[] args) {
        var numero = 10;
        var soma = 0;

        do {
            soma += numero;
            numero--;

        } while (numero > 0);

        System.out.println(soma); 
    }
}

// esse foi complicadinho