import sala.dados.SalaDeAula;

public class TesteSalaDeAula {
    public static void main(String[] args) {
        // quebrei a cabeça, pois estava instanciando um método estático :p 
        SalaDeAula.addAlunos();

        SalaDeAula.addAlunos();

        SalaDeAula.addAlunos();

        System.out.println(SalaDeAula.exibirAlunos());
    }
}

