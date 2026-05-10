package spital.clase;

public class Spital implements IInternare {

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
    }
}