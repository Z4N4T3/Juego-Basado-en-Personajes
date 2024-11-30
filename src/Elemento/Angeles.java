package Elemento;

import java.util.Random;

public  class Angeles extends Incorporeo implements Espiritual {
    public Angeles(double fe, double maldad, double bondad) {
        super(fe, maldad, bondad);
    }

    @Override
    public double enganar(Humano h) {
        return 0;
    }

    @Override
    public double guiar(Humano h) {
        return Math.sqrt(Math.pow(h.getBondad(), 2) - Math.pow(h.getMaldad(), 2) - h.getInteligencia())
                / (this.fe - this.maldad);
    }
    public void getStats(){
        System.out.println("Fe: "+ fe);
        System.out.println("Maldad: "+ maldad);
        System.out.println("Bondad: "+ bondad);
    }

    @Override
    public double luchar(Humano h) {
        Random random = new Random();
        return random.nextInt(6);
    }

    @Override
    public double probar(Humano h) {
        return (h.getFe() - (Math.pow(h.getMaldad(), 2) / h.getInteligencia()))
                / (Math.pow(this.bondad, 2) - this.maldad);
    }

    @Override
    public double proteger(Humano h) {
        return h.getFe() * (h.getBondad() - h.getMaldad()) / this.fe;

    }

    @Override
    public double seducir(Humano h) {
        return 0;
    }

    @Override
    public double tentar(Humano h) {
        return 0;
    }

    @Override
    public boolean rezar() {
        return true;
    }
}