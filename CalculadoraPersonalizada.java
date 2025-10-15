@FunctionalInterface
interface OperacaoMatematica {
    double executar(double a, double b);
}

public class CalculadoraPersonalizada {
    public static void main(String[] args) {
        OperacaoMatematica potencia1 = (a, b) -> Math.pow(a, b);
        System.out.println("Potência de A e B: " + potencia1.executar(10, 3));

        OperacaoMatematica raizQuadrada1 = (a, b) -> Math.sqrt(a);
        OperacaoMatematica raizQuadrada2 = (a, b) -> Math.sqrt(b);
        System.out.println("Raiz Quadrada de A: " + raizQuadrada1.executar(10, 0));
        System.out.println("Raiz Quadrada de B: " + raizQuadrada2.executar(0, 5));
    }
}
