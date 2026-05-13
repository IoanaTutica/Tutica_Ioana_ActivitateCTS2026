package restaurant.program;

import restaurant.clase.FabricaClienti;
import restaurant.clase.IClient;
import restaurant.clase.Rezervare;

public class Program {

    public static void main(String[] args) {
        FabricaClienti fabricaClienti = new FabricaClienti();

        Rezervare rezervare1 = new Rezervare(3, 4, "19:00");
        Rezervare rezervare2 = new Rezervare(7, 6, "20:30");
        Rezervare rezervare3 = new Rezervare(1, 4, "21:00");

        fabricaClienti.getClient("Popescu", "0723456789", "popescu@mail.com").afisareRezervare(rezervare1);
        fabricaClienti.getClient("Ionescu", "0733334455", "ionescu@mail.com").afisareRezervare(rezervare2);
        fabricaClienti.getClient("Popescu", "0723456789", "popescu@mail.com").afisareRezervare(rezervare3);

        System.out.println("Numar clienti creati in memorie: " + fabricaClienti.getNumarClienti());
    }
}