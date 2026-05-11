package restaurant.program;

import restaurant.clase.Facade;

public class Program {

    public static void main(String[] args) {
        int numarMasa = 5;
        System.out.println(Facade.verificareDisponibilitateMasa(numarMasa));

        numarMasa = 7;
        System.out.println(Facade.verificareDisponibilitateMasa(numarMasa));

        numarMasa = 15;
        System.out.println(Facade.verificareDisponibilitateMasa(numarMasa));
    }
}