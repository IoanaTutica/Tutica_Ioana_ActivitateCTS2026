package restaurant.clienti;

public class ClientFidel implements IObserver {

    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println(numeClient + " a primit notificarea- " + mesaj);
    }
}