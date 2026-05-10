package spital.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, IPacient> pacienti;

    public FabricaPacienti() {
        pacienti = new HashMap<String, IPacient>();
    }

    public IPacient getPacient(String nume, String numarTelefon, String adresa) {
        if (!pacienti.containsKey(nume)) {
            pacienti.put(nume, new Pacient(nume, numarTelefon, adresa));
        }
        return pacienti.get(nume);
    }

    public int getNumarPacienti() {
        return pacienti.size();
    }
}