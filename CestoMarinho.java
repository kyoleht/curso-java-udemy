class Peixes {
    private String nome;
    private double tamanho;

    public Peixes(String nome, double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }
}

class Polvos {
    private String nome;
    private int tentaculos;

    public Polvos(String nome, int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    public String getEspecie() {
        return nome;
    }
}

public class CestoMarinho<T> {
    private T conteudo;

    public CestoMarinho(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() { // pegar conteudo
        return conteudo;
    }

    public void setConteudo(T conteudo) { // guardar conteudo
        this.conteudo = conteudo;
    }

    public static void main(String[] args) {
        Peixes Carpa = new Peixes("Carpa", 0.80);
        CestoMarinho<Peixes> caixaDePeixes = new CestoMarinho<>(Carpa);

        System.out.println("Conteúdo do cesto: " + caixaDePeixes.getConteudo().getNome());

        Polvos Octopus = new Polvos("Octopus", 30);
        CestoMarinho<Polvos> caixaDePolvos = new CestoMarinho<>(Octopus);

        System.out.println("Conteúdo do cesto: " + caixaDePolvos.getConteudo().getEspecie());
    }
}