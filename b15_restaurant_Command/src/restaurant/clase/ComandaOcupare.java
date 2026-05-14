package restaurant.clase;

public class ComandaOcupare implements IComanda {

    private Masa masa;

    public ComandaOcupare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupa();
    }
}