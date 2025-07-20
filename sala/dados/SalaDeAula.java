package sala.dados;

public class SalaDeAula {
    static int Totalalunos = 0;

    public static void addAlunos() {
        Totalalunos++;
    }

    public static String exibirAlunos() {
        return String.format("Número total de alunos: " + Totalalunos);
    }
}
