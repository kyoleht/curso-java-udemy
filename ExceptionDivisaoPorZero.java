public class ExceptionDivisaoPorZero {
    public static void main(String[] args) {
        var quantidadeAlunos = 0;
        var quantidadeCadeiras = 0;

        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
        System.out.println("Quantidade de cadeiras: " + quantidadeCadeiras);

        try {
            var media = quantidadeCadeiras / quantidadeAlunos;
            System.out.println("Média de alunos por cadeira: " + media);
        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            System.out.println("O programa terminou.");
        }
    }
}
