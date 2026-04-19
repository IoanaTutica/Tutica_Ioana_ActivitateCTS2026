package b3_restaurant_AbstractFactory.main;

import b3_restaurant_AbstractFactory.clase.Desert;
import b3_restaurant_AbstractFactory.clase.Supa;
import b3_restaurant_AbstractFactory.fabrici.FactoryMeniuClasic;
import b3_restaurant_AbstractFactory.fabrici.FactoryMeniuVegan;
import b3_restaurant_AbstractFactory.fabrici.IFactoryMeniu;

public class Program {
    public static void main(String[] args) {
        IFactoryMeniu fabricaClasica = new FactoryMeniuClasic();
        Supa supa1 = fabricaClasica.creareSupa();
        Desert desert1 = fabricaClasica.creareDesert();

        System.out.println("---- Meniu Clasic ----");
        supa1.afisareDescriere();
        desert1.afisareDescriere();

        System.out.println("\n---- Meniu Vegan ----");
        IFactoryMeniu fabricaVegana = new FactoryMeniuVegan();
        Supa supa2 = fabricaVegana.creareSupa();
        Desert desert2 = fabricaVegana.creareDesert();

        supa2.afisareDescriere();
        desert2.afisareDescriere();
    }
}