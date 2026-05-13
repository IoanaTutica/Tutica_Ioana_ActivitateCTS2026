package restaurant.clase;

public class Client implements IClient {
    private String nume;
    private String numarTelefon;
    private String adresaMail;

    public Client(String nume, String numarTelefon, String adresaMail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaMail = adresaMail;
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

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }

    @Override
    public void afisareRezervare(Rezervare rezervare) {
        System.out.println("Clientul " + nume + ", tel: " + numarTelefon + ", mail: " + adresaMail
                + " a rezervat " + rezervare.toString());
    }

    @Override
    public String toString() {
        return "Client [nume=" + nume + ", numarTelefon=" + numarTelefon + ", adresaMail=" + adresaMail + "]";
    }
}