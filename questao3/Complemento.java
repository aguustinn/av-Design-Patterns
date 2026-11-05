public abstract class Complemento implements Bebida {

    protected Bebida bebida;

    public Complemento(Bebida bebida) {
        this.bebida = bebida;
    }
}