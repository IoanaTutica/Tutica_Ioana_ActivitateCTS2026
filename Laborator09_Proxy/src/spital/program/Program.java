package spital.program;

import spital.clase.IInternare;
import spital.clase.Pacient;
import spital.clase.ProxyInternare;
import spital.clase.Spital;

public class Program {

    public static void main(String[] args) {
        Pacient pacientPopescu = new Pacient("Popescu", 50, true);
        Pacient pacientIonescu = new Pacient("Ionescu", 35, false);

        Spital spital = new Spital();

        System.out.println("Fara Proxy:");
        spital.interneazaPacient(pacientPopescu);
        spital.interneazaPacient(pacientIonescu);

        System.out.println();
        System.out.println("Cu Proxy:");

        IInternare proxy = new ProxyInternare(spital);
        proxy.interneazaPacient(pacientPopescu);
        proxy.interneazaPacient(pacientIonescu);
    }
}