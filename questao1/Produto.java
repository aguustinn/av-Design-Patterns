import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;

    private final List<ObservadorEstoque> observadores =
            new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");

        if (quantidadeInicial < 0)
            throw new IllegalArgumentException("Estoque inválido.");

        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0)
            throw new IllegalArgumentException("Estoque inválido.");

        if (novaQuantidade == quantidade) {
            System.out.println("Quantidade não mudou. Sem notificações.");
            return;
        }

        quantidade = novaQuantidade;

        for (ObservadorEstoque observador : List.copyOf(observadores)) {
            observador.atualizar(nome, quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}