package spital.program;

import spital.clase.Spital;
import spital.pacienti.Pacient;

public class Program {

    public static void main(String[] args) {
        Pacient pacientPopescu = new Pacient("Popescu");
        Pacient pacientIonescu = new Pacient("Ionescu");
        Pacient pacientPopa = new Pacient("Popa");

        Spital spital = new Spital("Spital Central");

        spital.adaugaObserver(pacientPopescu);
        spital.adaugaObserver(pacientIonescu);
        spital.notificareVirusNou("Hantavirus");

        System.out.println();

        spital.adaugaObserver(pacientPopa);
        spital.notificareEpidemie("gripa");
    }
}