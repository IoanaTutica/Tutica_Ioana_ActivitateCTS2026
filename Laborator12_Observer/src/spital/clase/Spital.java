package spital.clase;

import spital.pacienti.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISubject {

    private List<IObserver> pacientiAbonati;
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
        pacientiAbonati = new ArrayList<IObserver>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        pacientiAbonati.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        pacientiAbonati.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IObserver observer : pacientiAbonati) {
            observer.receptioneazaNotificare(numeSpital + ": " + mesaj);
        }
    }

    public void notificareVirusNou(String virus) {
        trimiteNotificare("A fost detectat un virus nou: " + virus + "!");
    }

    public void notificareEpidemie(String boala) {
        trimiteNotificare("Atentie! Epidemie de " + boala + " in oras.");
    }
}