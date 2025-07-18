public class TestStatic {
        public static void exibirValor(int a) {
            System.out.println("O valor de a é: " + a);
        }
        public static void main(String[] args) {
            TestStatic.exibirValor(100);
        }

        // outra forma de se realizar isso, mas chamando um objeto

        // exclui o static
        public void exibirString(String str) {
            System.out.println("O nome desta String é: " + str);
        }

        // tenho que chamar dessa forma se o método acima não for 'static'
        public static void voidMain(String[] args) { // faz de conta que o nome do método é 'main'
            TestStatic str = new TestStatic();

            str.exibirString("oi");
        }
}
