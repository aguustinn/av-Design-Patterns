public class Main {

    public static void main(String[] args) {

        System.out.println("=== Pedidos de Café ===");

        Bebida pedido1 = new Espresso();

        pedido1 = new Leite(pedido1);
        pedido1 = new Chantilly(pedido1);


        Bebida pedido2 = new Cha();

        pedido2 = new Calda(pedido2);

        Bebida pedido3 = new Espresso();

        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Calda(pedido3);

        imprimirPedido(1, pedido1);
        imprimirPedido(2, pedido2);
        imprimirPedido(3, pedido3);
    }

    private static void imprimirPedido(int numero, Bebida bebida) {

        System.out.printf(
                "Pedido %d: %s | Total: R$ %.2f%n",
                numero,
                bebida.getDescricao(),
                bebida.getPreco()
        );
    }
}