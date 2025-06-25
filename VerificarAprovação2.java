// Você está desenvolvendo um sistema de notas para uma escola. O sistema deve verificar se um aluno foi aprovado em uma disciplina com base em suas notas e presença. Implemente um programa que utilize operadores lógicos para determinar se um aluno foi aprovado ou não.

public class VerificarAprovação2 {
    public static void main(String[] args) {
        var nota1 = 8;
        var nota2 = 7.3;
        var presenca = 73; // percentual;

        var media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
        System.out.println("Taxa de presença(%): " + presenca);

        var resultado = media >= 7 && presenca >= 75 ? "Aluno aprovado" : "Aluno reprovado";
        System.out.println(resultado);
    }
}
