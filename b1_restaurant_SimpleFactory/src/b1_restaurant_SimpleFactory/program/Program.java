package b1_restaurant_SimpleFactory.program;

import b1_restaurant_SimpleFactory.clase.Supa;
import b1_restaurant_SimpleFactory.fabrici.SupaFactory;
import b1_restaurant_SimpleFactory.fabrici.TipSupa;

public class Program {
    public static void main(String[] args) {
        SupaFactory fabrica = new SupaFactory();

        Supa supaLegume = fabrica.createObject(TipSupa.LEGUME);
        Supa supaVita = fabrica.createObject(TipSupa.VITA);
        Supa supaCiuperci = fabrica.createObject(TipSupa.CIUPERCI);

        supaLegume.afisareDetalii();
        supaVita.afisareDetalii();
        supaCiuperci.afisareDetalii();
    }
}