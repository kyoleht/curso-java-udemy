final class ExemploClasseFinal {
    final void FINAL_METHOD() {
        System.out.println("Esse é um método final em uma classe final.");
    }

    /* class TentativaDeExtensao extends ExemploClasseFinal {
           --- Isso causará um erro de compilação ---
            void FINAL_METHOD() {
            System.out.println("Tentativa de sobrescrever um método final.");
         }
    } */

    public static void main(String[] args) {
        ExemploClasseFinal ex2 = new ExemploClasseFinal();
        ex2.FINAL_METHOD();
    }
}
