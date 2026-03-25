package a3_factory_method.program;

import a3_factory_method.clase.PersonalSpital;
import a3_factory_method.fabrici.*;

public class Program {
    public static void main(String[] args) {
        PersonalFactory fabricaMedicala = new MedicalFactory();
        PersonalFactory fabricaAuxiliara = new AuxiliarFactory();

        PersonalSpital personal = fabricaMedicala.crearePersonal(TipPersonalMedical.Medic);
        personal.afisareDescriere();

        personal = fabricaMedicala.crearePersonal(TipPersonalMedical.Asistent);
        personal.afisareDescriere();

        personal = fabricaAuxiliara.crearePersonal(TipPersonalAuxiliar.Brancardier);
        personal.afisareDescriere();

        personal = fabricaAuxiliara.crearePersonal(TipPersonalAuxiliar.Secretar);
        personal.afisareDescriere();

        personal = fabricaAuxiliara.crearePersonal(TipPersonalAuxiliar.Registrator);
        personal.afisareDescriere();
    }
}