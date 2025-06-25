public class VerificacaoNumeroPar {
    public static void main(String[] args) {
        var numero = 5;

        var resultado = numero % 2 == 0 ? "Número digitado é PAR" : "Número digitado é ÍMPAR";

        System.out.println(resultado);
    }
}
