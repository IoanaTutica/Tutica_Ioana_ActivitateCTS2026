package restaurant.adapterobiect;

import restaurant.bar.SoftBar;
import restaurant.clase.IPrintareFactura;

public class AdapterBarObiect implements IPrintareFactura {

    private SoftBar softBar;

    public AdapterBarObiect(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura(String produs, double pret) {
        this.softBar.proceseazaComandaBar(produs, pret);
    }
}