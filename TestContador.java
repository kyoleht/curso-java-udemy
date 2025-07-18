class Contador {
    static int contagem = 0;

    public Contador() {
        contagem++;
    }
}

public class TestContador {
    public static void main(String[] args) {
        Contador cont1 = new Contador();

        Contador cont2 = new Contador();

        System.out.println("Valor do contador 1: " + cont1);
        System.out.println("Valor do contador 2: " + cont2);
    }
}