package Elemento;

import java.util.Random;

public  class Demonios extends Incorporeo implements Espiritual {
    public Demonios(double fe, double maldad, double bondad) {
        super(fe, maldad, bondad);
    }

    @Override
    public double enganar(Humano h) {

        return (h.getFe() / this.fe) * (this.bondad - this.maldad) / this.fe;

    }
    public void getStats(){
        System.out.println("Fe:"+fe);
        System.out.println("Maldad:"+maldad);
        System.out.println("Bondad:"+bondad);

    }

    @Override
    public double guiar(Humano h) {
        return 0;
    }

    @Override
    public double luchar(Humano h) {
        Random random = new Random();
        return random.nextInt(6);
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

        return (Math.pow(h.getBondad(), 2) - Math.pow(h.getMaldad(), 2) - h.getInteligencia())
                / (Math.pow(this.fe, 2) - this.bondad);
    }

    @Override
    public double tentar(Humano h) {

        return (-h.getFe() + h.getMaldad() / h.getInteligencia())
                / (Math.pow(this.bondad, 2) - Math.pow(this.maldad, 2));
    }

    @Override
    public boolean rezar() {
        return false; // Lógica de oración
    }
}