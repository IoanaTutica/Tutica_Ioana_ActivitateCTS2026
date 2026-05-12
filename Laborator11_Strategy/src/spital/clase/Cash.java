package spital.clase;

public class Cash implements IModPlata {

    @Override
    public void plateste(String numePacient, double sumaDePlata) {
        System.out.println(numePacient + " plateste cash suma de " + sumaDePlata + " RON");
    }
}