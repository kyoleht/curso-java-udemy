// Este exercício envolve a criação de um programa em Java que calcula a soma dos números de 1 a 10 usando um loop for.

public class For {
    public static void main(String[] args) {
        var soma = 0;

        for (int i = 1; i < 11; i++) {
            soma = i + soma;

            System.out.println(soma);
        }
    }
}
