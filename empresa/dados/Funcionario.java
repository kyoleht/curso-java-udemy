package empresa.dados;

class Funcionario {
    public String nome;
    protected double salario;

    private Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    protected Funcionario() { // o TestePackage.java consegue ter acesso, pois estão na mesma pasta
        Funcionario func1 = new Funcionario("Rafael", 20000);
        System.out.println(func1);
    }
}
