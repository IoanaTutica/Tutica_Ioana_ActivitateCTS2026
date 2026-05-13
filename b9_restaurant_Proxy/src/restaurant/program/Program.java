package restaurant.program;

import restaurant.clase.IRezervare;
import restaurant.clase.ProxyRezervare;
import restaurant.clase.Restaurant;

public class Program {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        System.out.println("Fara Proxy:");
        restaurant.rezerva("Popescu", 2);
        restaurant.rezerva("Ionescu", 5);

        System.out.println();
        System.out.println("Cu Proxy:");

        IRezervare proxy = new ProxyRezervare(restaurant);
        proxy.rezerva("Vasilescu", 2);
        proxy.rezerva("Anton", 4);
        proxy.rezerva("Popa", 6);
    }
}