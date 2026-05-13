package restaurant.clase;

public class Cash implements IModPlata {

    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println(numeClient + " plateste cash suma de " + sumaDePlata + " RON.");
    }
}