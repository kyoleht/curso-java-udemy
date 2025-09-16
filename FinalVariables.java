public class FinalVariables {
    final int numeroMaximo = 100;
    final String mensagem = "Bem-vindo ao mundo da programação!";

    public static void main(String[] args) {
        FinalVariables imprimirValoresFinais = new FinalVariables();
        // erro1.numeroMaximo = 500; -> The final field FinalVariables.numeroMaximo cannot be assigned
        // erro1.mensagem = "Curso de JAVA"; -> The final field FinalVariables.mensagem cannot be assigned
        System.out.println("Número máximo: " + imprimirValoresFinais.numeroMaximo);
        System.out.println(imprimirValoresFinais.mensagem);
    }
}
