package restaurant.clase;

public class Card implements IModPlata {

    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println(numeClient + " plateste cu cardul suma de " + sumaDePlata + " RON");
    }
}