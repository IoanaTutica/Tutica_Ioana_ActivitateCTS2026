package b1_restaurant_SimpleFactory.clase;

public class SupaVita extends Supa {
    public SupaVita() {
        super("supa de vita");
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Se serveste " + getDenumire() + " cu ardei iute.");
    }
}