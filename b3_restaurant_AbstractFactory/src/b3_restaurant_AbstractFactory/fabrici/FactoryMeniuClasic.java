package b3_restaurant_AbstractFactory.fabrici;

import b3_restaurant_AbstractFactory.clase.Desert;
import b3_restaurant_AbstractFactory.clase.Papanasi;
import b3_restaurant_AbstractFactory.clase.Supa;
import b3_restaurant_AbstractFactory.clase.SupaVita;

public class FactoryMeniuClasic implements IFactoryMeniu {
    @Override
    public Supa creareSupa() {
        return new SupaVita();
    }

    @Override
    public Desert creareDesert() {
        return new Papanasi();
    }
}