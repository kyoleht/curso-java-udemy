// O objetivo deste exercício é criar um programa em Java que, com base em um número fornecido pelo usuário (representando o nível de satisfação), determine e exiba o feedback correspondente.

public class NívelSatisfação {
    public static void main(String[] args) {
        var nivel = 1;

        switch (nivel) {
            case 1 -> System.out.println("Insatisfeito");
            case 2 -> System.out.println("Pouco satisfeito");
            case 3 -> System.out.println("Satisfeito");
            case 4 -> System.out.println("Muito satisfeito");
            case 5 -> System.out.println("Perfeito");
                default -> System.out.println("Avaliação desconhecida");
        }
    }
}
