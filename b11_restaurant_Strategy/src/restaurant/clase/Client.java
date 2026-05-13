package restaurant.clase;

public class Client {
    private String nume;
    private IModPlata modPlata;

    public Client(String nume, IModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Cash();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
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