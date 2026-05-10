package spital.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private boolean areAsigurare;

    public Pacient(String nume, int varsta, boolean areAsigurare) {
        this.nume = nume;
        this.varsta = varsta;
        this.areAsigurare = areAsigurare;
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

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    @Override
    public String toString() {
        return "Pacient [nume=" + nume + ", varsta=" + varsta + ", areAsigurare=" + areAsigurare + "]";
    }
}