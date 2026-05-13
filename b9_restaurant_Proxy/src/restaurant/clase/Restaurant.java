package restaurant.clase;

public class Restaurant implements IRezervare {

    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        System.out.println("Rezervare confirmata pentru " + numeClient + "-" + numarPersoane + " persoane.");
    }
}