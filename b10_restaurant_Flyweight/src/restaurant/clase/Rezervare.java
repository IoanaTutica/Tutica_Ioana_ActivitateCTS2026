package restaurant.clase;

public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Rezervare(int numarMasa, int numarPersoane, String oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        return "masa " + numarMasa + ", " + numarPersoane + " persoane, ora " + oraRezervare;
    }
}