package restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Debarasare {
    private List<Boolean> listaMeseDebarasate;

    public Debarasare() {
        listaMeseDebarasate = new ArrayList<Boolean>();
        for (int i = 0; i < 7; i++)
            listaMeseDebarasate.add(true);
        for (int i = 7; i < 15; i++)
            listaMeseDebarasate.add(false);
    }

    public boolean esteMasaDebarasata(int numarMasa) {
        return listaMeseDebarasate.get(numarMasa);
    }
}