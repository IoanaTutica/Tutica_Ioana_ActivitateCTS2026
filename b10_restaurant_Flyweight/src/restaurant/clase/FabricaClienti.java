package restaurant.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, IClient> clienti;

    public FabricaClienti() {
        clienti = new HashMap<String, IClient>();
    }

    public IClient getClient(String nume, String numarTelefon, String adresaMail) {
        if (!clienti.containsKey(nume)) {
            clienti.put(nume, new Client(nume, numarTelefon, adresaMail));
        }
        return clienti.get(nume);
    }

    public int getNumarClienti() {
        return clienti.size();
    }
}