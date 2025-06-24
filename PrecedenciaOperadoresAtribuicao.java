// Neste exercício você praticará o comportamento de precedência de operadores.

public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args) {
        var numero = 10;
        var numero2 = ++numero;
        var numero3 = numero2++;
        var numero4 = --numero3;
        var numero5 = numero4--;

        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
    }
}
