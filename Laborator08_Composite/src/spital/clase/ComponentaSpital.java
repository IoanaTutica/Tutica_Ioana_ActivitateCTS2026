package spital.clase;

public interface ComponentaSpital {
    void adaugaNod(ComponentaSpital componenta) throws Exception;
    void stergeNod(ComponentaSpital componenta) throws Exception;
    ComponentaSpital getNod(int index) throws Exception;
    void descriere();
}