package restaurant.clase;

public class ComandaRezervare implements IComanda {

    private Masa masa;

    public ComandaRezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezerva();
    }
}