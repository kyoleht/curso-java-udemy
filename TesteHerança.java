public class TesteHerança {
    public static void main(String[] args) {
        Assistente funcionario1 = new Assistente();
        funcionario1.nome = "João";
        funcionario1.salario = 3000;
        funcionario1.addAumento(500);
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Salário com aumento: " + funcionario1.salario);
    }
}