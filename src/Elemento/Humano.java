package Elemento;

import java.util.Random;

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
        Random random = new Random();


        int habilidad = random.nextInt(6);


        double puntuacionAngel = a.luchar(this);
        double puntuacionDemonio = d.luchar(this);


        if (puntuacionAngel > puntuacionDemonio) {
            this.bondad += 1;
            this.maldad -= 1;
        } else if (puntuacionDemonio > puntuacionAngel) {
            this.bondad -= 1;
            this.maldad += 1;
        }

        double efecto = golpear(puntuacionAngel > puntuacionDemonio ? a : d, habilidad);
        if (efecto > 0) {
            this.fe += 1;
        } else {
            this.fe -= 1;
        }
    }

    public double golpear(Incorporeo s, int habilidad) {
        switch (habilidad) {
            case 0:
                return s.enganar(this);
            case 1:
                return s.guiar(this);
            case 2:
                return s.proteger(this);
            case 3:
                return s.tentar(this);
            case 4:
                return s.seducir(this);
            case 5:
                return s.probar(this);
            default:
                return 0;
        }
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