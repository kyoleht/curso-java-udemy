public class PessoaHerança {
    String nome;
    int idade;
}

class Estudante extends PessoaHerança {
    int matricula;
    
    public Estudante(String nome, int idade, int matricula) {
        super.nome = nome;
        super.idade = idade;
        this.matricula = matricula;
    }
    public static void main(String args[]) {
        Estudante aluno1 = new Estudante("Clara", 17, 20254321);
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Matrícula: " + aluno1.matricula);
    }
}