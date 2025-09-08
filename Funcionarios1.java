// Você foi contratado como programador júnior e, em seu primeiro trabalho, seu gerente pediu para você criar um programa em Java para gerenciar dados de funcionários. Como você é iniciante, ele solicitou que você fizesse um programa simplificado que imprima o nome, cargo e idade dos funcionários.

public class Funcionarios1 {
    String nome;
    String cargo;
    int idade;

    Funcionarios1(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
    }
    public static void main(String[] args) {
        Funcionarios1 f1 = new Funcionarios1("Rafael", "Dev", 20);

            System.out.println(f1.nome); 
            System.out.println(f1.cargo); 
            System.out.println(f1.idade); 
    }
} 