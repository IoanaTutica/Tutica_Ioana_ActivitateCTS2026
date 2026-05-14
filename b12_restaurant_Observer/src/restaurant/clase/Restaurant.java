package restaurant.clase;

import restaurant.clienti.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubject {

    private List<IObserver> clientiAbonati;
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        clientiAbonati = new ArrayList<IObserver>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        clientiAbonati.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        clientiAbonati.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IObserver observer : clientiAbonati) {
            observer.receptioneazaNotificare(numeRestaurant + ": " + mesaj);
        }
    }

    public void notificareOfertaPret(String oferta) {
        trimiteNotificare("Oferta de pret: " + oferta);
    }

    public void notificareMeniuNou(String meniu) {
        trimiteNotificare("Meniu nou disponibil- " + meniu);
    }
}