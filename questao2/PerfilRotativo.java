public class PerfilRotativo implements EstrategiaCobranca {

    @Override
    public double calcularValor(int minutos) {

        int horasIniciadas = minutos / 60;

        if (minutos % 60 != 0) {
            horasIniciadas++;
        }

        return horasIniciadas * Tarifas.VALOR_HORA_ROTATIVO;
    }

    @Override
    public String getNomePerfil() {
        return "Rotativo";
    }
}