package Elemento;
public abstract class Incorporeo extends Ser {
    protected double fe;
    protected double maldad;
    protected double bondad;

    public Incorporeo(double fe, double maldad, double bondad) {
        this.fe = fe;
        this.maldad = maldad;
        this.bondad = bondad;
    }

    public abstract double enganar(Humano h);
    public abstract double guiar(Humano h);
    public abstract double luchar(Humano h);
    public abstract double probar(Humano h);
    public abstract double proteger(Humano h);
    public abstract double seducir(Humano h);
    public abstract double tentar(Humano h);
}

