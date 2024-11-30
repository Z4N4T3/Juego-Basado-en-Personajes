package Elemento;

public class Dios extends Incorporeo implements Espiritual {
    private int numAngeles;
    private int numDemonios;

    public Dios(double fe, double maldad, double bondad, int numAngeles, int numDemonios) {
        super(fe, maldad, bondad);
        this.numAngeles = numAngeles;
        this.numDemonios = numDemonios;
    }

    @Override
    public boolean rezar() {
        return true;
    }

    @Override
    public double enganar(Humano h) {
        return 0;
    }

    @Override
    public double guiar(Humano h) {
        return 0;
    }

    @Override
    public double luchar(Humano h) {
        return 0;
    }

    @Override
    public double probar(Humano h) {
        return 0;
    }

    @Override
    public double proteger(Humano h) {
        return 0;
    }

    @Override
    public double seducir(Humano h) {
        return 0;
    }

    @Override
    public double tentar(Humano h) {
        return 0;
    }
}

