package restaurant.program;

import restaurant.clase.Restaurant;
import restaurant.clienti.ClientFidel;

public class Program {

    public static void main(String[] args) {
        ClientFidel clientPopa = new ClientFidel("Popa");
        ClientFidel clientPopescu = new ClientFidel("Popescu");
        ClientFidel clientAnton = new ClientFidel("Anton");
        Restaurant restaurant = new Restaurant("Stadio");

        restaurant.adaugaObserver(clientPopa);
        restaurant.adaugaObserver(clientPopescu);
        restaurant.notificareOfertaPret("50% reducere la toate preparatele");

        System.out.println();
        restaurant.adaugaObserver(clientAnton);
        restaurant.notificareMeniuNou("meniu vegetarian");
    }
}