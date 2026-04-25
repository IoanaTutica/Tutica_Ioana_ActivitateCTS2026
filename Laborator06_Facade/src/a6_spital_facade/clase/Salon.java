package a6_spital_facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere;
    private List<Integer> paturiOcupate;

    public Salon() {
        paturiLibere = new ArrayList<>();
        paturiOcupate = new ArrayList<>();
        paturiLibere.add(1);
        paturiLibere.add(2);
        paturiLibere.add(3);
    }

    public boolean verificaDisponibilitatePat() {
        return paturiLibere.size() > 0;
    }

    public void ocupaPat() {
        if (verificaDisponibilitatePat()) {
            int pat = paturiLibere.get(0);
            paturiLibere.remove(0);
            paturiOcupate.add(pat);
        }
    }
}
