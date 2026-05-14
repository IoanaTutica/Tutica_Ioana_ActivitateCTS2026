package restaurant.clase;

public class Masa {
    private int numarMasa;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void rezerva() {
        System.out.println("Masa " + numarMasa + " a fost rezervata");
    }

    public void ocupa() {
        System.out.println("Masa " + numarMasa + " a fost ocupata");
    }
}