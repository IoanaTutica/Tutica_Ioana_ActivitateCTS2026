package a6_spital_facade.clase;

public class Pacient {
    private String nume;
    private int stareGravitate;

    public Pacient(String nume, int stareGravitate) {
        this.nume = nume;
        this.stareGravitate = stareGravitate;
    }

    public String getNume() {
        return nume;
    }

    public boolean verificaStare() {
        return stareGravitate > 5;
    }
}
