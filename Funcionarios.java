// Você foi contratado como programador júnior e, em seu primeiro trabalho, seu gerente pediu para você criar um programa em Java para gerenciar dados de funcionários. Como você é iniciante, ele solicitou que você fizesse um programa simplificado que imprima o nome, cargo e idade dos funcionários.

public class Funcionarios {
    String nome;
    String cargo;
    int idade;

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios();

        funcionario1.nome = "Rafael";
        funcionario1.cargo = "Desenvolvedor";
        funcionario1.idade = 20;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);
        
        // adicionando um segundo funcionário
        Funcionarios funcionario2 = new Funcionarios();

        funcionario2.nome = "Jessica";
        funcionario2.cargo = "Social Media";
        funcionario2.idade = 21;


        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
} 
