@FunctionalInterface
interface OperacaoMatematica {
    double executar(double a, double b);
}

public class FuncionalInterfaces {
    public static void main(String[] args) {
        OperacaoMatematica soma = (a, b) -> a + b;
        System.out.println("Soma " + soma.executar(10, 5));

        OperacaoMatematica subtracao = (a, b) -> a - b;
        System.out.println("Subtração: " + subtracao.executar(10, 5));

        OperacaoMatematica multiplicacao = (a , b) -> a * b;
        System.out.println("Multiplicação: " + multiplicacao.executar(10 ,5));

        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Divisor não pode ser zero.");
            }
            return a / b;
        };
        System.out.println("Divisão: " + divisao.executar(10,5 ));
    }
}
