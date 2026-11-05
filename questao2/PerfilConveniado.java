public class PerfilConveniado implements EstrategiaCobranca {

    @Override
    public double calcularValor(int minutos) {

        int minutosCobrados = minutos - Tarifas.MINUTOS_GRATUITOS_CONVENIADO;

        if (minutosCobrados < 0) {
            minutosCobrados = 0;
        }

        int horasIniciadas = minutosCobrados / 60;

        if (minutosCobrados % 60 != 0) {
            horasIniciadas++;
        }

        double valorBruto = horasIniciadas * Tarifas.VALOR_HORA_CONVENIADO;

        return valorBruto * (1 - Tarifas.DESCONTO_CONVENIADO);
    }

    @Override
    public String getNomePerfil() {
        return "Conveniado";
    }
}