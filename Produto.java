// Este exercício tem como objetivo testar seu entendimento sobre encapsulamento em Java, utilizando os modificadores de acesso public e private. Você criará uma classe Produto com atributos que representam as características de um produto, utilizando apenas construtores para inicializar os atributos.

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirLoja() {
        System.out.println("Item: " + nome + " | ");
        System.out.println("Preço: " + preco + " | ");
        System.out.println("Em estoque: " + quantidadeEmEstoque + " | ");
    }
}

    class Main {
        public static void main(String[] args) {
            Produto product1 = new Produto("Espada", 350, 15);
            Produto product2 = new Produto("Armadura de Ferro", 600, 10);

            product1.exibirLoja();
            System.out.println("_________________");
            product2.exibirLoja();
            System.out.println("_________________");
    }
}

