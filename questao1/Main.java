public class Main {

    public static void main(String[] args) {

        Produto notebook = new Produto("Notebook", 8);

        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("=== Monitor de Estoque ===");

        notebook.alterarQuantidade(8);
        notebook.alterarQuantidade(4);
        notebook.alterarQuantidade(0);
        notebook.alterarQuantidade(6);

        System.out.println("\nRemovendo a área de Compras...");

        notebook.removerObservador(compras);

        notebook.alterarQuantidade(3);
    }
}