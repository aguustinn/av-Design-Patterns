public class AreaCompras implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < 5) {
            System.out.println("Compras - ALERTA: " + nomeProduto
                    + " está com apenas " + novaQuantidade + " unidade(s).");
        }
    }
}