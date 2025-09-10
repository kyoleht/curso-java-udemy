public class SuperClasse {
    public void imprime() { // <- método sobrescrito na classe filha
        System.out.println("Imprime");
    }
}

class MinhaClasse extends SuperClasse {
    @Override
    public void imprime() {
        System.out.println("Imprime diferente");
    }
    public static void main(String[] args) {
        MinhaClasse teste = new MinhaClasse();
        teste.imprime();
    }
}

