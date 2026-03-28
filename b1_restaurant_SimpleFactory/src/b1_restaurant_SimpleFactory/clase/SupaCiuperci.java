package b1_restaurant_SimpleFactory.clase;

public class SupaCiuperci extends Supa {
    public SupaCiuperci() {
        super("supa de ciuperci");
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Se serveste " + getDenumire() + " cu smantana si crutoane.");
    }
}