package b2_restaurant_Builder.clase;

public class RezervareBuilder implements IBuilder {
    private Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false, false, false, false, "Nespecificat");
    }

    public RezervareBuilder setAsezareGeam(boolean asezare) {
        this.rezervare.setAsezareGeam(asezare);
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scaune) {
        this.rezervare.setScauneErgonomice(scaune);
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decor) {
        this.rezervare.setDecorareMasa(decor);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzica) {
        this.rezervare.setMuzicaAmbientala(muzica);
        return this;
    }

    public RezervareBuilder setGenMuzica(String gen) {
        this.rezervare.setGenMuzica(gen);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}