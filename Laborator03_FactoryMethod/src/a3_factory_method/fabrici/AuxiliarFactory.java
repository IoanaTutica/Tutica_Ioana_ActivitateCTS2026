package a3_factory_method.fabrici;

import a3_factory_method.clase.Brancardier;
import a3_factory_method.clase.PersonalSpital;

public class AuxiliarFactory implements PersonalFactory {
    @Override
    public PersonalSpital crearePersonal(TipPersonalSpital tip) {
        return switch (tip) {
            case TipPersonalAuxiliar.Brancardier -> new Brancardier();
            default -> null;
        };
    }
}