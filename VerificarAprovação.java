// Você está desenvolvendo um sistema de notas para uma escola. O sistema deve verificar se um aluno foi aprovado em uma disciplina com base em suas notas. Implemente um programa que utilize operadores lógicos para determinar se um aluno foi aprovado ou não.

public class VerificarAprovação {
    public static void main(String[] args) {
        var nota1 = 8;
        var nota2 = 6.4;
        var media = (nota1 + nota2) / 2;

        var resultado = media >= 6 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}
