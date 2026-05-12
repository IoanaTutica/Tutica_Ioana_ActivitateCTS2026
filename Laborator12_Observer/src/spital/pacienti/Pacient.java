package spital.pacienti;

public class Pacient implements IObserver {

    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println(numePacient + " a primit notificarea: " + mesaj);
    }
}