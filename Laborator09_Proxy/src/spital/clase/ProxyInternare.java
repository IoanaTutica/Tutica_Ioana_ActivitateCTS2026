package spital.clase;

public class ProxyInternare implements IInternare {

    private Spital spital;

    public ProxyInternare(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if (pacient.isAreAsigurare()) {
            spital.interneazaPacient(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat deoarece nu are asigurare de sanatate");
        }
    }
}