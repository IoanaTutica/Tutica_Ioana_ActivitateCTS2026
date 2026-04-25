package a6_spital_facade.facade;

import a6_spital_facade.clase.Medic;
import a6_spital_facade.clase.Pacient;
import a6_spital_facade.clase.Salon;

public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if (pacient.verificaStare()) {
            if (medic.confirmaInternare(pacient)) {
                if (salon.verificaDisponibilitatePat()) {
                    salon.ocupaPat();
                    System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
                } else {
                    System.out.println("Nu sunt paturi libere pentru " + pacient.getNume());
                }
            } else {
                System.out.println("Medicul nu a confirmat internarea pentru " + pacient.getNume());
            }
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu necesita internare");
        }
    }
}