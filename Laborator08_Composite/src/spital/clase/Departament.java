package spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ComponentaSpital {

    List<ComponentaSpital> lista;
    String nume;

    public Departament(String nume) {
        lista = new ArrayList<ComponentaSpital>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(ComponentaSpital componenta) {
        lista.add(componenta);
    }

    @Override
    public void stergeNod(ComponentaSpital componenta) {
        lista.remove(componenta);
    }

    @Override
    public ComponentaSpital getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Departamentul " + nume);
        for (ComponentaSpital componenta : lista) {
            componenta.descriere();
        }
    }
}