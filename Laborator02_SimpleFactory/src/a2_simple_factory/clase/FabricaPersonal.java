package a2_simple_factory.clase;

public class FabricaPersonal {
    private static FabricaPersonal instanta = null;

    private FabricaPersonal() {
    }

    public static synchronized FabricaPersonal getInstanta() {
        if(instanta == null) {
            instanta = new FabricaPersonal();
        }
        return instanta;
    }

    public PersonalSpital createPersonal(TipPersonal tipPersonal) throws Exception {
        switch (tipPersonal) {
            case brancardier:
                return new Brancardier();
            case asistent:
                return new Asistent();
            case medic:
                return new Medic();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}