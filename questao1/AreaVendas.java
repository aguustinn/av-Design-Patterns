import java.util.HashMap;
import java.util.Map;

public class AreaVendas implements ObservadorEstoque {

    private final Map<String, Boolean> estavaZerado = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {

        boolean zeradoAntes =
                estavaZerado.getOrDefault(nomeProduto, false);

        if (zeradoAntes && novaQuantidade > 0) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto
                    + " voltou a ter estoque (" + novaQuantidade + ").");
        }

        estavaZerado.put(nomeProduto, novaQuantidade == 0);
    }
}