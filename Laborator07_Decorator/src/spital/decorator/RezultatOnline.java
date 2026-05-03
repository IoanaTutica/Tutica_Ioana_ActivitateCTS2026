package spital.decorator;

import spital.clase.IRezultat;

public class RezultatOnline extends RezultatDecorator {

    public RezultatOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void publicaRezultat() {
        super.publicaRezultat();
        publicaOnline();
    }

    @Override
    public void publicaOnline() {
        System.out.println("Rezultatul a fost publicat pe platforma online");
    }
}