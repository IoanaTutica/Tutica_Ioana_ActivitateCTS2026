package a5_spital_Adapter.spital;

public class MedicamentSpital {
    private String numeMedicament;

    public MedicamentSpital(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void prezintaReteta() {
        System.out.println("Se verifica reteta pentru medicamentul: " + numeMedicament);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Spital: medicamentul " + numeMedicament + " a fost eliberat.");
    }
}