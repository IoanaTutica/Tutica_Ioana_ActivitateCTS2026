package a6_spital_facade.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean confirmaInternare(Pacient pacient) {
        return true;
    }
}
