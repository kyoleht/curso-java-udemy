// Este exercício tem como objetivo testar seu entendimento sobre encapsulamento em Java, utilizando os modificadores de acesso public e private. Você criará uma classe Produto com atributos que representam as características de um produto, utilizando apenas construtores para inicializar os atributos.

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        if (preco < 0) {
            throw new IllegalArgumentException("ERRO: Preço não pode ser negativo!"); // programa é interrompido com mensagem de erro
        }
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("ERRO: Estoque não pode ser negativo!"); 
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String obterInfo() { // mudei de "class" para "String" para poder o reutilizá-lo melhor
        return "Item: " + nome + " | " + "Preço: " + preco + " | " + "Em estoque: " + quantidadeEmEstoque; // return na classe Main
    }

    // acrescentado para futuramente criar um carrinho de compra
    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= 0) {
            throw new IllegalArgumentException("ERRO: Quantidade inválida para venda!");
        }

        if (quantidadeVendida <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidadeVendida;
            System.out.println(quantidadeVendida + " itens adicionado ao carrinho.");
        } else {
            throw new IllegalArgumentException("ERRO: Não há tantos(as) " + nome + "(s) em estoque."); // utilizando a nova função no false
        }
    }
}

    class Main {
    public static void main(String[] args) {
            Produto product1 = new Produto("Espada", 350, 15);
            Produto product2 = new Produto("Armadura de Ferro", 600, 10);
            Produto invalid1 = new Produto("Capsula de Força", -90, -3);
            

            System.out.println(product1.obterInfo());
            product1.vender(5);
            System.out.println(product1.obterInfo());
            // Está exibindo a mensagem de erro da instância 'invalid1', mesmo eu não a chamando. Preciso arrumar isso depois; 
    }
}

