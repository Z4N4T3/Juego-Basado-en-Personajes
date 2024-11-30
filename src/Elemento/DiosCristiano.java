package Elemento;


public class DiosCristiano extends Dios {
    public DiosCristiano(double fe, double maldad, double bondad, int numAngeles, int numDemonios) {
        super(fe, maldad, bondad, numAngeles, numDemonios);
    }

    public boolean esBuenHombre(Humano h) {
        return h.getBondad() > h.getMaldad();
    }
}