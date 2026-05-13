package restaurant.program;

import restaurant.clase.IComponentaMeniu;
import restaurant.clase.ItemMeniu;
import restaurant.clase.Sectiune;

public class Program {

    public static void main(String[] args) {
        IComponentaMeniu sStartere = new Sectiune("Startere");
        IComponentaMeniu sBauturi = new Sectiune("Bauturi");
        IComponentaMeniu sDesert = new Sectiune("Desert");

        IComponentaMeniu sSucuri = new Sectiune("Sucuri");
        IComponentaMeniu sCafea = new Sectiune("Cafea");

        IComponentaMeniu iSalata = new ItemMeniu("Salata de sezon");
        IComponentaMeniu iBruschete = new ItemMeniu("Bruschete");
        IComponentaMeniu iApaMinerala = new ItemMeniu("Apa minerala");
        IComponentaMeniu iApaPlata = new ItemMeniu("Apa plata");
        IComponentaMeniu iCafeaNegra = new ItemMeniu("Cafea neagra");
        IComponentaMeniu iCafeaLatte = new ItemMeniu("Cafea latte");
        IComponentaMeniu iPapanasi = new ItemMeniu("Papanasi");
        IComponentaMeniu iClatite = new ItemMeniu("Clatite");

        try {
            sStartere.adaugaNod(iSalata);
            sStartere.adaugaNod(iBruschete);

            sSucuri.adaugaNod(iApaMinerala);
            sSucuri.adaugaNod(iApaPlata);

            sCafea.adaugaNod(iCafeaNegra);
            sCafea.adaugaNod(iCafeaLatte);

            sBauturi.adaugaNod(sSucuri);
            sBauturi.adaugaNod(sCafea);

            sDesert.adaugaNod(iPapanasi);
            sDesert.adaugaNod(iClatite);

            System.out.println("Meniul restaurantului:");
            sStartere.descriere();
            sBauturi.descriere();
            sDesert.descriere();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}