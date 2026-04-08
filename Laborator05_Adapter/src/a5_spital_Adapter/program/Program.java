package a5_spital_Adapter.program;

import a5_spital_Adapter.adapter.AdapterMedicament;
import a5_spital_Adapter.farmacie.IMedicamentFarmacie;
import a5_spital_Adapter.farmacie.MedicamentFarmacie;
import a5_spital_Adapter.spital.MedicamentSpital;

public class Program {

    public static void scaneazaLaCasaDeMarcat(IMedicamentFarmacie medicament) {
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        IMedicamentFarmacie paracetamol = new MedicamentFarmacie("Paracetamol");
        scaneazaLaCasaDeMarcat(paracetamol);

        MedicamentSpital morfinaSpital = new MedicamentSpital("Morfina");
        IMedicamentFarmacie morfinaAdaptata = new AdapterMedicament(morfinaSpital);
        scaneazaLaCasaDeMarcat(morfinaAdaptata);
    }
}