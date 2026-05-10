package spital.clase;

public class Internare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Internare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public void setNumarSalon(int numarSalon) {
        this.numarSalon = numarSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public void setNumarPat(int numarPat) {
        this.numarPat = numarPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public void setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        return "salonul " + numarSalon + ", patul " + numarPat + ", pentru " + numarZileSpitalizare + " zile";
    }
}