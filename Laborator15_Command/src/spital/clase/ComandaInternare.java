package spital.clase;

public class ComandaInternare implements IComanda {

    private Medic medic;
    private Pacient pacient;

    public ComandaInternare(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.interneazaPacient(pacient);
    }
}