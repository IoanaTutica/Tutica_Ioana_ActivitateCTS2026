package b3_restaurant_AbstractFactory.fabrici;

import b3_restaurant_AbstractFactory.clase.Desert;
import b3_restaurant_AbstractFactory.clase.Supa;

public interface IFactoryMeniu {
    Supa creareSupa();
    Desert creareDesert();
}