package spital.clase;

public class Sectie implements ComponentaSpital {

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(ComponentaSpital componenta) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeNod(ComponentaSpital componenta) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public ComponentaSpital getNod(int index) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("   Sectia: " + nume);
    }
}