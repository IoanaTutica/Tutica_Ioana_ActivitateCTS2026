package b1_restaurant_SimpleFactory.clase;

public class SupaLegume extends Supa {
    public SupaLegume() {
        super("supa de legume");
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Se serveste " + getDenumire() + " preparata din legume proaspete.");
    }
}