package a3_factory_method.fabrici;

import a3_factory_method.clase.Asistent;
import a3_factory_method.clase.Medic;
import a3_factory_method.clase.PersonalSpital;

public class MedicalFactory implements PersonalFactory {
    @Override
    public PersonalSpital crearePersonal(TipPersonalSpital tip) {
        return switch (tip) {
            case TipPersonalMedical.Medic -> new Medic();
            case TipPersonalMedical.Asistent -> new Asistent();
            default -> null;
        };
    }
}