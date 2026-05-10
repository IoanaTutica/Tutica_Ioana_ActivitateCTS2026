package restaurant.adapterclase;

import restaurant.bar.SoftBar;
import restaurant.clase.IPrintareFactura;

public class AdapterBarClase extends SoftBar implements IPrintareFactura {

    @Override
    public void printeazaFactura(String produs, double pret) {
        super.proceseazaComandaBar(produs, pret);
    }
}