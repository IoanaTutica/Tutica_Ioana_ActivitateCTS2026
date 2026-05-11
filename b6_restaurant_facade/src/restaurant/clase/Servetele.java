package restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Servetele {
    private List<Boolean> listaMeseCuServetele;

    public Servetele() {
        listaMeseCuServetele = new ArrayList<Boolean>();
        for (int i = 0; i < 6; i++)
            listaMeseCuServetele.add(true);
        for (int i = 6; i < 15; i++)
            listaMeseCuServetele.add(false);
    }

    public boolean areServetele(int numarMasa) {
        return listaMeseCuServetele.get(numarMasa);
    }
}