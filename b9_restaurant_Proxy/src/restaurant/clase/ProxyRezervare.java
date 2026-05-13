package restaurant.clase;

public class ProxyRezervare implements IRezervare {

    private Restaurant restaurant;

    public ProxyRezervare(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane) {
        if (numarPersoane >= 4) {
            restaurant.rezerva(numeClient, numarPersoane);
        } else {
            System.out.println("Rezervarea pentru " + numeClient + " nu poate fi realizata. "
                    + "Va rugam sa va prezentati la restaurant, sunt suficiente locuri pentru mese de doua persoane.");
        }
    }
}