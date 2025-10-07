public class Carrinhos {
    private String modelo;

    public Carrinhos(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

class Boneca {
    private String nome;

    public Boneca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Brinquedos {
    public static void main(String[] args) {
        Carrinhos carrinho1 = new Carrinhos("Hot Wheels");
        Boneca boneca1 = new Boneca("Barbie");
        System.out.println("Carrinho: " + carrinho1.getModelo());
        System.out.println("Boneca: " + boneca1.getNome());
    }
}
