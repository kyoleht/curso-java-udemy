public class ExemploMetodoFinal {
    final int VALOR_FIXO = 10; // final é uma const em Java )obs: deve ser nomeada em maiúsculas)

    final void metodoFinal() {
        System.out.println("Este é um método final.");
    }

    public static void main(String[] args) {
       ExemploMetodoFinal ex1 = new ExemploMetodoFinal();
        System.out.println("Valor fixo: " + ex1.VALOR_FIXO);
        ex1.metodoFinal();
    }
}
