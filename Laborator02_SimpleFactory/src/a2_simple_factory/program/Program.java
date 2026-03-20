package a2_simple_factory.program;

import a2_simple_factory.clase.FabricaPersonal;
import a2_simple_factory.clase.PersonalSpital;
import a2_simple_factory.clase.TipPersonal;

public class Program {

    public static void main(String[] args) {
        FabricaPersonal fabrica = FabricaPersonal.getInstanta();
        PersonalSpital personal = null;

        try {
            personal = fabrica.createPersonal(TipPersonal.medic);
            personal.descriere();

            personal = fabrica.createPersonal(TipPersonal.brancardier);
            personal.descriere();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}