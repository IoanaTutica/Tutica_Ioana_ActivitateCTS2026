package restaurant.clase;

public class NotaDePlata implements INotaDePlata {
    private int numarMasa;
    private double totalDePlata;

    public NotaDePlata(int numarMasa, double totalDePlata) {
        this.numarMasa = numarMasa;
        this.totalDePlata = totalDePlata;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public double getTotalDePlata() {
        return totalDePlata;
    }

    public void setTotalDePlata(double totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata pentru masa " + numarMasa + ": " + totalDePlata + " RON.");
    }
}