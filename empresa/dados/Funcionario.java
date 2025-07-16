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
        double porcentagemAumento = (aumento / salario) * 100;
        System.out.printf("Aumento aplicado: %.2f%%\n", porcentagemAumento);
    }

    public void alterarSalario(Funcionario func, double novoSalario) {
        func.salario = novoSalario;
    }

    public double calcularPorcentagemAumento(double aumento) {
        return (aumento / salario) * 100;
    }
}
