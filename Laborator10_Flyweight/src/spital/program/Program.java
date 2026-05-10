package spital.program;

import spital.clase.FabricaPacienti;
import spital.clase.IPacient;
import spital.clase.Internare;

public class Program {

    public static void main(String[] args) {
        FabricaPacienti fabricaPacienti = new FabricaPacienti();

        Internare internare1 = new Internare(3, 2, 5);
        Internare internare2 = new Internare(7, 1, 10);
        Internare internare3 = new Internare(1, 4, 3);

        fabricaPacienti.getPacient("Popescu", "0723456789", "Str. Castanilor nr. 5").afisareInternare(internare1);
        fabricaPacienti.getPacient("Ionescu", "0734567890", "Str. Campului nr. 10").afisareInternare(internare2);
        fabricaPacienti.getPacient("Popescu", "0723456789", "Str. Castanilor nr. 5").afisareInternare(internare3);

        System.out.println("Numar pacienti creati in memorie: " + fabricaPacienti.getNumarPacienti());
    }
}