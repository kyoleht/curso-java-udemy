package empresa.dados;

public class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String obterInfo() {
        return "Nome: " + nome + " - Salário: " + salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }
}
