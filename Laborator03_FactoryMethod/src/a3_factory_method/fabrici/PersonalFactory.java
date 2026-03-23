package a3_factory_method.fabrici;

import a3_factory_method.clase.PersonalSpital;

public interface PersonalFactory {
    PersonalSpital crearePersonal(TipPersonalSpital tip);
}