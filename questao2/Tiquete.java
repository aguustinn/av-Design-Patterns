public class Tiquete {

    private String placa;
    private int minutosPermanencia;
    private EstrategiaCobranca estrategia;

    public Tiquete(String placa, int minutosPermanencia,
                   EstrategiaCobranca estrategia) {

        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.estrategia = estrategia;
    }

    public void alterarPerfil(EstrategiaCobranca novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    public double calcularValor() {
        return estrategia.calcularValor(minutosPermanencia);
    }

    public void imprimirResumo() {

        System.out.printf(
            "Placa: %s | Permanência: %d min | Perfil: %s | Valor: R$ %.2f%n",
            placa,
            minutosPermanencia,
            estrategia.getNomePerfil(),
            calcularValor()
        );
    }
}