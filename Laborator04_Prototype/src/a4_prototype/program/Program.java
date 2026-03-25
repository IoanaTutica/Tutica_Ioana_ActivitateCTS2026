package a4_prototype.program;

import a4_prototype.clase.IReteta;
import a4_prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, Double> ingredienteParacetamol = new HashMap<>();
        ingredienteParacetamol.put("Paracetamol substanta (mg)", 500.0);
        ingredienteParacetamol.put("Apa purificata (ml)", 100.0);

        Reteta retetaPrototip = new Reteta("Paracetamol", ingredienteParacetamol);
        System.out.println("Reteta 1: " + retetaPrototip.toString());
        System.out.println("--------------------------------------------------");

        IReteta reteta2 = retetaPrototip.copiaza();
        IReteta reteta3 = retetaPrototip.copiaza();

        System.out.println("Reteta 2 :  " + reteta2.toString());
        System.out.println("Reteta 3 :  " + reteta3.toString());
    }
}