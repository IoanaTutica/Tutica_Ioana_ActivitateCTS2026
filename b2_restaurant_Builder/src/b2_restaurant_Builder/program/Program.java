package b2_restaurant_Builder.program;

import b2_restaurant_Builder.clase.Rezervare;
import b2_restaurant_Builder.clase.RezervareBuilder;

public class Program {
    public static void main(String[] args) {
        RezervareBuilder builder1 = new RezervareBuilder();
        Rezervare rezervare1 = builder1.build();
        System.out.println(rezervare1);

        RezervareBuilder builder2 = new RezervareBuilder();
        Rezervare rezervare2 = builder2
                .setAsezareGeam(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("Jazz")
                .build();
        System.out.println(rezervare2);

        RezervareBuilder builder3 = new RezervareBuilder();
        Rezervare rezervare3 = builder3
                .setScauneErgonomice(true)
                .setDecorareMasa(true)
                .build();
        System.out.println(rezervare3);
    }
}