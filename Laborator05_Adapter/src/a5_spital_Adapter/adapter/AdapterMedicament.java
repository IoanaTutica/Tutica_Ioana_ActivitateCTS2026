package a5_spital_Adapter.adapter;

import a5_spital_Adapter.farmacie.IMedicamentFarmacie;
import a5_spital_Adapter.spital.MedicamentSpital;

public class AdapterMedicament implements IMedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}