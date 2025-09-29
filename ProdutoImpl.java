interface Product {
    void infoProduto();
}

public class ProdutoImpl implements Product {
    public String item;
    private int quantidade;

    public ProdutoImpl(String item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    @Override
    public void infoProduto() {
        System.out.println("Item: " + item + ", Quantidade: " + quantidade);
    }

    public class adicionarQuantidade {
        public int quantidade;
        public void adicionar(int quantidadeAtualizada) {
            quantidadeAtualizada += quantidade;
            System.out.println("Quantidade atualizada: " + quantidadeAtualizada);
        }
    }

    public void removerQuantidade(int quantidadeRemover) {
        if (quantidade >= quantidadeRemover) {
            quantidade -= quantidadeRemover;
            System.out.println("Quantidade vendida: " + quantidadeRemover);
        } else {
            System.out.println("Quantidade insuficiente para remover.");
        }
    }

    public static void main(String[] args) {
            ProdutoImpl item1 = new ProdutoImpl("Computador", 10);
            ProdutoImpl item2 = new ProdutoImpl("Notebook", 12);
            ProdutoImpl item3 = new ProdutoImpl("Cafeteira", 15);

            item1.infoProduto();
            item1.removerQuantidade(3);
            item1.infoProduto();

            item2.infoProduto();
            item2.removerQuantidade(9);
            item2.infoProduto();

            item3.infoProduto();
            item3.removerQuantidade(5);
            item3.infoProduto();
        }
    }