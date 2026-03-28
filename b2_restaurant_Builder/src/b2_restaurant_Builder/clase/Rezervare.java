package b2_restaurant_Builder.clase;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorareMasa, boolean muzicaAmbientala, String genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setAsezareGeam(boolean asezareGeam) { this.asezareGeam = asezareGeam; }
    public void setScauneErgonomice(boolean scauneErgonomice) { this.scauneErgonomice = scauneErgonomice; }
    public void setDecorareMasa(boolean decorareMasa) { this.decorareMasa = decorareMasa; }
    public void setMuzicaAmbientala(boolean muzicaAmbientala) { this.muzicaAmbientala = muzicaAmbientala; }
    public void setGenMuzica(String genMuzica) { this.genMuzica = genMuzica; }

    @Override
    public String toString() {
        return "Rezervare: geam=" + asezareGeam + ", scaune=" + scauneErgonomice +
                ", decor=" + decorareMasa + ", muzica=" + muzicaAmbientala +
                ", gen=" + genMuzica;
    }
}