package empresa.dados;

public class Funcionario {
    public String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
