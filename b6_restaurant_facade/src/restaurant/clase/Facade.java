package restaurant.clase;

public class Facade {
    public static String verificareDisponibilitateMasa(int numarMasa) {
        MeseLibere meseLibere = new MeseLibere();
        if (meseLibere.esteMasaLibera(numarMasa)) {
            Debarasare debarasare = new Debarasare();
            if (debarasare.esteMasaDebarasata(numarMasa)) {
                Servetele servetele = new Servetele();
                if (servetele.areServetele(numarMasa)) {
                    return "Masa " + numarMasa + " este pregatita pentru client.";
                } else {
                    return "Masa " + numarMasa + " nu are servetele. Asteptati putin.";
                }
            } else {
                return "Masa " + numarMasa + " nu a fost debarasata. Asteptati putin.";
            }
        } else {
            return "Masa " + numarMasa + " nu este libera. Asteptati pana se elibereaza.";
        }
    }
}