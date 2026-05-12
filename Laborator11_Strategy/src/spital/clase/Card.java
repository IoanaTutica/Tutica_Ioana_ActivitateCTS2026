package spital.clase;

public class Card implements IModPlata {

    @Override
    public void plateste(String numePacient, double sumaDePlata) {
        System.out.println(numePacient + " plateste cu cardul suma de " + sumaDePlata + " RON");
    }
}