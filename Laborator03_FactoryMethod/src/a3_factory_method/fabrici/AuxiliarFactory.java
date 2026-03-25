package a3_factory_method.fabrici;

import a3_factory_method.clase.Brancardier;
import a3_factory_method.clase.PersonalSpital;
import a3_factory_method.clase.Registrator;
import a3_factory_method.clase.Secretar;

public class AuxiliarFactory implements PersonalFactory {
    @Override
    public PersonalSpital crearePersonal(TipPersonalSpital tip) {
        return switch (tip) {
            case TipPersonalAuxiliar.Brancardier -> new Brancardier();
            case TipPersonalAuxiliar.Secretar -> new Secretar();
            case TipPersonalAuxiliar.Registrator -> new Registrator();
            default -> null;
        };
    }
}