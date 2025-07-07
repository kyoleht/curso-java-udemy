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

    public void aplicarDesconto(double percentual) {
        if(percentual < 0 || percentual >= 100) {
            throw new IllegalArgumentException("ERRO: Desconto não pôde ser aplicado");
        }
        this.preco = this.preco * (1 - (percentual / 100));
        System.out.println("Desconto de " + percentual + "% aplicado ao item " + nome + "!");
    }
}

    class Main {
    public static void main(String[] args) {

            // testar com try e catch o erro do commit passado
            Produto product1 = null;
            try {
                product1 = new Produto("Espada ", 350, 15);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: Espada -> " + e.getMessage());
            }
            
            Produto product2 = null;
            try {
                product2 = new Produto("Armadura de Ferro ", 750, 10);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: Armadura de Ferro -> " + e.getMessage());
            }

            Produto invalidProduct = null;
            try {
                invalidProduct = new Produto("Poção de Cura ", -50, 30);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: Poção de Cura -> " + e.getMessage());
            }

            if(product1 != null) {
                System.out.println(product1.obterInfo());
            } 
            if(product2 != null) {
                System.out.println(product2.obterInfo());
            }
            if(invalidProduct != null) {
                System.out.println(invalidProduct.obterInfo());
            }

            // é uma forma bem "arcaica" de se lidar com isso, mas pretendo refatorar e deixar mais limpo quando tiver mais conhecimento. 
    }
}

