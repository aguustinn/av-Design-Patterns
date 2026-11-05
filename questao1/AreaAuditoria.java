public class AreaAuditoria implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("Auditoria - Alteração registrada: "
                + nomeProduto + " - nova quantidade: " + novaQuantidade);
    }
}