// Você foi contratado como programador júnior e, em seu primeiro trabalho, seu gerente pediu para você criar um programa em Java para gerenciar dados de funcionários. Como você é iniciante, ele solicitou que você fizesse um programa simplificado que imprima o nome, cargo e idade dos funcionários.

public class Funcionarios {
    String nome;
    String cargo;
    int idade;

    Funcionarios(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("Rafael", "Desenvolvedor", 20);
        Funcionarios funcionario2 = new Funcionarios("Jessica", "Social Media", 21);

        System.out.println(funcionario1.nome);
        System.out.println(funcionario1.cargo);
        System.out.println(funcionario1.idade);
        System.out.println("-----------------");
        System.out.println(funcionario2.nome);
        System.out.println(funcionario2.cargo);
        System.out.println(funcionario2.idade);
    }
} 
