interface PedidoRestaurante {
    void adicionarItem(String item, double valor);
    void calcularTotal();
}

public class Pedido implements PedidoRestaurante {
    private double total = 0;

    @Override
    public void adicionarItem(String item, double valor) {
        total += valor;
        System.out.println("Item adicionado: " + item + " - Valor: " + valor);
    }

    @Override
    public void calcularTotal() {
        System.out.println(total);
    }

    public static void main(String[] args) {
        Pedido novoPedido = new Pedido();
        novoPedido.adicionarItem("Hamburguer", 36.0);
        novoPedido.adicionarItem("Batata Frita", 15.0);
        novoPedido.adicionarItem("Refrigerante", 8.0);

        System.out.println("Valor total do pedido: " + novoPedido.total);
    }
}
