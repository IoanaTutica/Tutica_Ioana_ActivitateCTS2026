package spital.clase;

public class Pacient implements IPacient {
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void afisareInternare(Internare internare) {
        System.out.println("Pacientul " + nume + ", nr. tel: " + numarTelefon + ", adresa: " + adresa
                + " a fost internat in " + internare.toString() + ".");
    }

    @Override
    public String toString() {
        return "Pacient [nume=" + nume + ", numarTelefon=" + numarTelefon + ", adresa=" + adresa + "]";
    }
}