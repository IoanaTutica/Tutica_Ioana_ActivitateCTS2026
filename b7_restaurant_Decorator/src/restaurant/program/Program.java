package restaurant.program;

import restaurant.clase.INotaDePlata;
import restaurant.clase.NotaDePlata;
import restaurant.decorator.NotaDecorator;
import restaurant.decorator.NotaCuFelicitare;

public class Program {

    public static void main(String[] args) {
        INotaDePlata nota = new NotaDePlata(5, 150.0);
        nota.printeazaNota();

        System.out.println();
        System.out.println("Se adauga felicitarea de sfarsit de an:");

        NotaDecorator notaDecorata = new NotaCuFelicitare(nota);
        notaDecorata.printeazaNota();

        System.out.println();
        System.out.println("Revenire la forma initiala:");

        nota.printeazaNota();
    }
}