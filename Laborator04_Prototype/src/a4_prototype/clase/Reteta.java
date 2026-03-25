package a4_prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta {
    private String numeMedicament;
    private Map<String, Double> cantitatiSolutii;
    public Reteta() {
        this.cantitatiSolutii = new HashMap<>();
    }

    public Reteta(String numeMedicament, Map<String, Double> cantitatiSolutii) {
        System.out.println("Se realizeaza calculele de dozaj si se creeaza reteta pentru: " + numeMedicament + "...");
        this.numeMedicament = numeMedicament;
        this.cantitatiSolutii = cantitatiSolutii;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void setCantitatiSolutii(Map<String, Double> cantitatiSolutii) {
        this.cantitatiSolutii = cantitatiSolutii;
    }

    @Override
    public IReteta copiaza() {
        Reteta retetaNoua = new Reteta();
        retetaNoua.setNumeMedicament(this.numeMedicament);

        Map<String, Double> solutiiClonate = new HashMap<>();
        for (String substanta : this.cantitatiSolutii.keySet()) {
            solutiiClonate.put(substanta, this.cantitatiSolutii.get(substanta));
        }
        retetaNoua.setCantitatiSolutii(solutiiClonate);

        return retetaNoua;
    }

    @Override
    public String toString() {
        return "Reteta [nume=" + numeMedicament + ", solutii=" + cantitatiSolutii + "]";
    }
}