package b3_restaurant_AbstractFactory.fabrici;

import b3_restaurant_AbstractFactory.clase.Clatite;
import b3_restaurant_AbstractFactory.clase.Desert;
import b3_restaurant_AbstractFactory.clase.Supa;
import b3_restaurant_AbstractFactory.clase.SupaLegume;

public class FactoryMeniuVegan implements IFactoryMeniu {
    @Override
    public Supa creareSupa() {
        return new SupaLegume();
    }

    @Override
    public Desert creareDesert() {
        return new Clatite();
    }
}