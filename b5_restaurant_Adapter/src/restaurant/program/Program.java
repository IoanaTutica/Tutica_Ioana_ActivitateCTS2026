package restaurant.program;

import restaurant.adapterclase.AdapterBarClase;
import restaurant.adapterobiect.AdapterBarObiect;
import restaurant.bar.SoftBar;
import restaurant.clase.IPrintareFactura;
import restaurant.clase.SoftBucatarie;

public class Program {

    private static void printeazaFactura(IPrintareFactura soft, String produs, double pret) {
        soft.printeazaFactura(produs, pret);
    }

    public static void main(String[] args) {
        IPrintareFactura softBucatarie = new SoftBucatarie();
        printeazaFactura(softBucatarie, "Ciorba de burta", 25.0);

        System.out.println();
        System.out.println("Se doreste utilizarea softului de bar");

        System.out.println();
        System.out.println("Utilizarea in modul clasic:");
        SoftBar softBar = new SoftBar();
        softBar.proceseazaComandaBar("Whiskey", 35.0);

        System.out.println();
        System.out.println("Se utilizeaza Adapter prin Clase:");
        IPrintareFactura adapterClase = new AdapterBarClase();
        printeazaFactura(adapterClase, "Martini", 30.0);

        System.out.println();
        System.out.println("Se utilizeaza Adapter prin Obiect:");
        SoftBar softBar2 = new SoftBar();
        IPrintareFactura adapterObiect = new AdapterBarObiect(softBar2);
        printeazaFactura(adapterObiect, "Gin tonic", 28.0);
    }
}