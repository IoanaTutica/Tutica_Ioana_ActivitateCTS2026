package restaurant.program;

import restaurant.clase.ComandaOcupare;
import restaurant.clase.ComandaRezervare;
import restaurant.clase.IComanda;
import restaurant.clase.Masa;
import restaurant.clase.Operator;

public class Program {

    public static void main(String[] args) {
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);
        Masa masa3 = new Masa(3);

        Operator operator = new Operator();

        IComanda rezervare1 = new ComandaRezervare(masa1);
        IComanda ocupare1 = new ComandaOcupare(masa2);
        IComanda rezervare2 = new ComandaRezervare(masa3);

        operator.invoca(rezervare1);
        operator.invoca(ocupare1);
        operator.invoca(rezervare2);
    }
}