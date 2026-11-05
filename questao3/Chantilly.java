public class Chantilly extends Complemento {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }
}