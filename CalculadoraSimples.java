// Criar um programa Java que realiza operações aritméticas básicas usando os operadores mencionados.

public class CalculadoraSimples {
    public static void main(String[] args) {
        var a = 10;
        var b = 10;
        var resultadoSoma = a + b;
        var resultadoSub = a - b;
        var resultadoMulti = a * b;
        var resultadoDivisao = a / b;
        var resultadoResto = a % b;


        System.out.println("A soma dos valores é: " + resultadoSoma);
        System.out.println("A subtração dos valores é: " + resultadoSub);
        System.out.println("A multiplicação dos valores é: " + resultadoMulti);
        System.out.println("A divisão dos valores é: " + resultadoDivisao);
        System.out.println("O resto da divisão dos valores é: " + resultadoResto);
    }
}
