package empresa.dados;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Richard", 2500);
        System.out.println(func1.nome);
        System.out.println(func1.salario);
    }
}
