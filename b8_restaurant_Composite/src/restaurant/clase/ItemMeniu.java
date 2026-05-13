package restaurant.clase;

public class ItemMeniu implements IComponentaMeniu {

    private String nume;

    public ItemMeniu(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(IComponentaMeniu componenta) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeNod(IComponentaMeniu componenta) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public IComponentaMeniu getNod(int index) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("   Item: " + nume);
    }
}