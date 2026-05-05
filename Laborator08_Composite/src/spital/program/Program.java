package spital.program;

import spital.clase.ComponentaSpital;
import spital.clase.Departament;
import spital.clase.Sectie;

public class Program {

    public static void main(String[] args) {
        ComponentaSpital dChirurgie = new Departament("Chirurgie");
        ComponentaSpital dCardiologie = new Departament("Cardiologie");
        ComponentaSpital dUrgente = new Departament("Urgente");

        ComponentaSpital sChirurgieGenerala = new Sectie("Chirurgie generala");
        ComponentaSpital sChirurgiePediatrica = new Sectie("Chirurgie pediatrica");
        ComponentaSpital sCardiologieAdulti = new Sectie("Cardiologie adulti");
        ComponentaSpital sTerapieIntensiva = new Sectie("Terapie intensiva");
        ComponentaSpital sUPU = new Sectie("UPU");

        try {
            dChirurgie.adaugaNod(sChirurgieGenerala);
            dChirurgie.adaugaNod(sChirurgiePediatrica);

            dCardiologie.adaugaNod(sCardiologieAdulti);
            dCardiologie.adaugaNod(sTerapieIntensiva);

            dUrgente.adaugaNod(sUPU);

            System.out.println("Spital Central");
            dChirurgie.descriere();
            dCardiologie.descriere();
            dUrgente.descriere();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}