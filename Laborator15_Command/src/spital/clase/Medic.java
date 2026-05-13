package spital.clase;

public class Medic {
    private String numeMedic;

    public Medic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void interneazaPacient(Pacient pacient) {
        System.out.println("Dr. " + numeMedic + " interneaza pacientul " + pacient.getNume());
    }

    public void trateazaImediat(Pacient pacient) {
        System.out.println("Dr. " + numeMedic + " trateaza imediat pacientul " + pacient.getNume());
    }
}