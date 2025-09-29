interface Product {
    void infoProduto(String item, int quantidade);
}

public class ProdutoImpl implements Product {
    @Override
    public void infoProduto(String item, int quantidade) {
        System.out.println("Item: " + item + ", Quantidade: " + quantidade);
    }
    public static void main(String[] args) {
        ProdutoImpl item1 = new ProdutoImpl();
        ProdutoImpl item2 = new ProdutoImpl();
        ProdutoImpl item3 = new ProdutoImpl();
    
        item1.infoProduto("Computador Gamer", 12); 
        item2.infoProduto("Notebook", 8);
        item3.infoProduto("Cafeteira", 6);
    }
}