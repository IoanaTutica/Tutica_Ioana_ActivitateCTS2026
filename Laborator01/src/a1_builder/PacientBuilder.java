package a1_builder;

public class PacientBuilder implements Builder{
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatInterior;

    public PacientBuilder(String nume) {
        this.nume = nume;
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halatInterior = false;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume, patRabatabil, micDejunInclus, papuciDeCamera, halatInterior);
    }
}
