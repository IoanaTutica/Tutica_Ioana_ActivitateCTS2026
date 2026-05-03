package spital.program;

import spital.clase.IRezultat;
import spital.clase.RezultatPrintat;
import spital.decorator.RezultatDecorator;
import spital.decorator.RezultatOnline;

public class Program {

    public static void main(String[] args) {
        IRezultat rezultat = new RezultatPrintat();
        rezultat.publicaRezultat();

        System.out.println();
        System.out.println("Se adauga publicarea online");

        RezultatDecorator rezultatOnline = new RezultatOnline(rezultat);
        rezultatOnline.publicaRezultat();

        System.out.println();
        System.out.println("Se revine la forma initiala");

        rezultat.publicaRezultat();
    }

}