package a1_builder;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatInterior;

    Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatInterior = halatInterior;
    }

    public String getNume() {
        return nume;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

    public boolean isHalatInterior() {
        return halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
                + ", papuciDeCamera=" + papuciDeCamera + ", halatInterior=" + halatInterior + "]";
    }
}
