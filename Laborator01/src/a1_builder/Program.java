package a1_builder;

public class Program {
    public static void main(String[] args) {
        PacientBuilder builder = new PacientBuilder("Ion Popescu");
        builder.setMicDejunInclus(true);
        Pacient pacient1 = builder.build();

        System.out.println(pacient1);
    }

}
