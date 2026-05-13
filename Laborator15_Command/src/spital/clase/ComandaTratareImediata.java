package spital.clase;

public class ComandaTratareImediata implements IComanda {

    private Medic medic;
    private Pacient pacient;

    public ComandaTratareImediata(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.trateazaImediat(pacient);
    }
}