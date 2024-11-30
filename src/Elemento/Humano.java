package Elemento;

public class Humano extends Fisico implements Espiritual {
    private double inteligencia;
    private double fe;
    private double maldad;
    private double bondad;
    private double alma;

    public Humano(double inteligencia, double fe, double maldad, double bondad, double alma) {
        this.inteligencia = inteligencia;
        this.fe = fe;
        this.maldad = maldad;
        this.bondad = bondad;
        this.alma = alma;
    }
    public double getInteligencia() {
        return inteligencia;
    }
    public double getFe() { return fe;}
    public double getBondad() {
        return bondad;
    }

    public double getMaldad() {
        return maldad;
    }

    public void conflictoMoral(Angeles a, Demonios d) {
        // Lógica de conflicto moral
    }

    public double golpear(Incorporeo s, int habilidad) {
        return habilidad * 1.5; // Lógica de golpe
    }

    @Override
    public boolean rezar() {
        if (fe>50 || bondad >60){
            return true;
        }
        else{
            return false;
        }
    }
}