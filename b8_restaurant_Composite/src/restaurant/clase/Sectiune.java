package restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IComponentaMeniu {

    List<IComponentaMeniu> lista;
    String nume;

    public Sectiune(String nume) {
        lista = new ArrayList<IComponentaMeniu>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(IComponentaMeniu componenta) {
        lista.add(componenta);
    }

    @Override
    public void stergeNod(IComponentaMeniu componenta) {
        lista.remove(componenta);
    }

    @Override
    public IComponentaMeniu getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiunea: " + nume);
        for (IComponentaMeniu componenta : lista) {
            componenta.descriere();
        }
    }
}