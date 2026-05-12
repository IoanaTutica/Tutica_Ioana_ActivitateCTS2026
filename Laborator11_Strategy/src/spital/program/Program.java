package spital.program;

import spital.clase.Card;
import spital.clase.Cash;
import spital.clase.Pacient;

public class Program {

    public static void main(String[] args) {
        Pacient pacientPopescu = new Pacient("Popescu", 50, new Card());
        pacientPopescu.plateste(500);

        Pacient pacientIonescu = new Pacient("Ionescu", 30);
        pacientIonescu.plateste(300);

        System.out.println();
        System.out.println("Ionescu schimba modul de plata:");

        pacientIonescu.setModPlata(new Card());
        pacientIonescu.plateste(300);
    }
}