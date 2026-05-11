package restaurant.decorator;

import restaurant.clase.INotaDePlata;

public class NotaCuFelicitare extends NotaDecorator {

    public NotaCuFelicitare(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        printeazaFelicitare();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani si An Nou fericit!");
    }
}