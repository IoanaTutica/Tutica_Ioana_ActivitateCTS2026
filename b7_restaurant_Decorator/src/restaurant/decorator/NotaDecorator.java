package restaurant.decorator;

import restaurant.clase.INotaDePlata;

public abstract class NotaDecorator implements INotaDePlata {

    protected INotaDePlata notaDePlata;

    public NotaDecorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNota() {
        notaDePlata.printeazaNota();
    }

    public abstract void printeazaFelicitare();
}