package spital.clase;

import spital.pacienti.IObserver;

public interface ISubject {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void trimiteNotificare(String mesaj);
}