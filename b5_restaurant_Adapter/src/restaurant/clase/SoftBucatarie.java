package restaurant.clase;

public class SoftBucatarie implements IPrintareFactura {

    @Override
    public void printeazaFactura(String produs, double pret) {
        System.out.println("Bucatarie-factura: " + produs + " | Pret: " + pret + " RON");
    }
}