package spital.decorator;

import spital.clase.IRezultat;

public abstract class RezultatDecorator implements IRezultat {

    protected IRezultat rezultat;

    public RezultatDecorator(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void publicaRezultat() {
        rezultat.publicaRezultat();
    }

    public abstract void publicaOnline();
}