package b1_restaurant_SimpleFactory.clase;

public abstract class Supa {
    private String denumire;

    public Supa(String denumire) {
        this.denumire = denumire;
    }

    public abstract void afisareDetalii();

    public String getDenumire() {
        return denumire;
    }
}