// Criar um programa Java que demonstre a promoção automática de tipos em expressões.

public class PromocaoAutomatica {
    public static void main(String[] args) {

    byte idade = 20;
    short anoDeNasc = 2004;
    char letraInicialNome = 'R';
    int telefone = 829438434;
    long numeroPi = 3141592653589793L;
    float altura = 1.74f;
    double meuCPF = 999.99999999D;

    var resultado1 = anoDeNasc + telefone;
    var resultado2 = idade + altura;
    var resultado3 = numeroPi + meuCPF;
    var resultado4 = letraInicialNome + idade;

    System.out.println("A soma do meu número de telefone e ano de nascimento é: " + resultado1);
    System.out.println("A soma da minha idade com a minha altura é: " + resultado2);
    System.out.println("A soma do numero de PI e do meu CPF é: " + resultado3);
    System.out.println("A soma da minha letra inicial e da minha idade é: " + resultado4); // rodou, nao sei como.

    }
}