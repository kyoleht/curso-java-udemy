public class MinhaClasse {
    public int calcularSoma(int a, int b) {
        return a + b;
    }

    @Deprecated
    public int calcularProduto(int a, int b) {
        return a * b;
    }
}

class Principal {
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        int soma = obj.calcularSoma(1, 2);
        int produto = obj.calcularProduto(3, 4);

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);
    }
}