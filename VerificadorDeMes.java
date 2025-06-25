// Criar um programa em Java que verifica o valor de uma variável representando um mês do ano e exibe o nome desse mês.

public class VerificadorDeMes {
    public static void main(String[] args) {
        var mes = 12;

        switch (mes) {
            case 1 -> System.out.println("Mês escolhido: " + mes + " - Janeiro");
            case 2 -> System.out.println("Mês escolhido: " + mes + " - Fevereiro");
            case 3 -> System.out.println("Mês escolhido: " + mes + " - Março");
            case 4 -> System.out.println("Mês escolhido: " + mes + " - Abril");
            case 5 -> System.out.println("Mês escolhido: " + mes + " - Maio");
            case 6 -> System.out.println("Mês escolhido: " + mes + " - Junho");
            case 7 -> System.out.println("Mês escolhido: " + mes + " - Julho");
            case 8 -> System.out.println("Mês escolhido: " + mes + " - Agosto");
            case 9 -> System.out.println("Mês escolhido: " + mes + " - Setembro");
            case 10 -> System.out.println("Mês escolhido: " + mes + " - Outubro");
            case 11 -> System.out.println("Mês escolhido: " + mes + " - Novembro");
            case 12 -> System.out.println("Mês escolhido: " + mes + " - Dezembro");
                default -> System.out.println("Mês desconhecido");
        }
    }
}
