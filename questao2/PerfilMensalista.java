public class PerfilMensalista implements EstrategiaCobranca {

    @Override
    public double calcularValor(int minutos) {
        return Tarifas.VALOR_FIXO_MENSALISTA;
    }

    @Override
    public String getNomePerfil() {
        return "Mensalista";
    }
}