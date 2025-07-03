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
        System.out.println("Item: " + nome + " | " + "Preço: " + preco + " | " + "Em estoque: " + quantidadeEmEstoque);
    }

    // acrescentado para futuramente criar um carrinho de compra
    public void vender(int carrinho) {
        if (carrinho <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= carrinho;
            System.out.println(carrinho + " itens adicionado ao carrinho.");
        } else {
            System.out.println("Não há tantos itens em estoque");
        }
    }
}

    class Main {
        public static void main(String[] args) {
            Produto product1 = new Produto("Espada", 350, 15);
            Produto product2 = new Produto("Armadura de Ferro", 600, 10);

            product1.exibirLoja();
            product1.vender(5);
    }
}

