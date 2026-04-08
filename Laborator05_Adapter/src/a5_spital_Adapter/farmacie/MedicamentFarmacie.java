package a5_spital_Adapter.farmacie;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String numeMedicament;

    public MedicamentFarmacie(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Farmacie: medicamentul " + numeMedicament + " a fost cumparat la liber.");
    }
}