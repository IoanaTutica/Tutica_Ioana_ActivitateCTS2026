package restaurant.clase;

import restaurant.clienti.IObserver;

public interface ISubject {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void trimiteNotificare(String mesaj);
}