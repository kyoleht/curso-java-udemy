public class Caixa<T> {
    private T coisaNaCaixa;

    public void guardar(T coisa) {
        this.coisaNaCaixa = coisa;
    }

    public T pegar() {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        Caixa<String> caixaDeStrings = new Caixa<>();
        caixaDeStrings.guardar("Olá, Mundo!");
        System.out.println(caixaDeStrings.pegar());

        Caixa<Integer> caixaDeNumeros = new Caixa<>();
        caixaDeNumeros.guardar(123);
        System.out.println(caixaDeNumeros.pegar());
    }
}
