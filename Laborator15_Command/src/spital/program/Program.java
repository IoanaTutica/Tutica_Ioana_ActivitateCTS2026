package spital.program;

import spital.clase.ComandaInternare;
import spital.clase.ComandaTratareImediata;
import spital.clase.IComanda;
import spital.clase.Medic;
import spital.clase.Operator;
import spital.clase.Pacient;

public class Program {

    public static void main(String[] args) {
        Medic medicPopescu = new Medic("Popescu");
        Medic medicSarbulescu = new Medic("Sarbulescu");

        Pacient pacient1 = new Pacient("Popa");
        Pacient pacient2 = new Pacient("Gheorghescu");
        Pacient pacient3 = new Pacient("Constantin");

        Operator operator = new Operator();

        IComanda internare1 = new ComandaInternare(medicPopescu, pacient1);
        IComanda tratareImediata1 = new ComandaTratareImediata(medicSarbulescu, pacient2);
        IComanda internare2 = new ComandaInternare(medicSarbulescu, pacient3);

        operator.invoca(internare1);
        operator.invoca(tratareImediata1);
        operator.invoca(internare2);
    }
}