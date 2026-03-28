package b1_restaurant_SimpleFactory.fabrici;

import b1_restaurant_SimpleFactory.clase.*;

public class SupaFactory {
    public Supa createObject(TipSupa tip) {
        switch (tip) {
            case LEGUME: return new SupaLegume();
            case CIUPERCI: return new SupaCiuperci();
            case VITA: return new SupaVita();
            default: return null;
        }
    }
}