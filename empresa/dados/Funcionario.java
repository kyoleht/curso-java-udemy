package empresa.dados;

public class Funcionario {
    public String nome;
    private double salario;

    private Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public Funcionario() {
        Funcionario func1 = new Funcionario("David", 7400);
    }
}
