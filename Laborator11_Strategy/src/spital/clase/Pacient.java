package spital.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private IModPlata modPlata;

    public Pacient(String nume, int varsta, IModPlata modPlata) {
        this.nume = nume;
        this.varsta = varsta;
        this.modPlata = modPlata;
    }

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.modPlata = new Cash();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double sumaDePlata) {
        modPlata.plateste(this.nume, sumaDePlata);
    }
}