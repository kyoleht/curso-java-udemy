// Você foi contratado como programador júnior e, em seu primeiro trabalho, seu gerente pediu para você criar um programa em Java para gerenciar dados de funcionários. Como você é iniciante, ele solicitou que você fizesse um programa simplificado que imprima o nome, cargo e idade dos funcionários.

public class Funcionarios {
    String nome;
    String cargo;
    int idade;

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.nome = "Rafael";
        funcionario.cargo = "Desenvolvedor";
        funcionario.idade = 20;

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
    }
} 
