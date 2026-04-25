package a6_spital_facade.program;

import a6_spital_facade.clase.Medic;
import a6_spital_facade.clase.Pacient;
import a6_spital_facade.clase.Salon;
import a6_spital_facade.facade.FacadeInternare;

public class Program {
    public static void main(String[] args) {
        Medic medic = new Medic("Popescu");
        Salon salon = new Salon();
        FacadeInternare facade = new FacadeInternare(medic, salon);

        Pacient pacient1 = new Pacient("Ion", 7);
        Pacient pacient2 = new Pacient("Maria", 3);

        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
    }
}