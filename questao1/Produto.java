import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade;

    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {

        if (novaQuantidade == quantidade) {
            System.out.println("Quantidade não mudou.");
            return;
        }

        quantidade = novaQuantidade;

        for (ObservadorEstoque observador : observadores) {
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