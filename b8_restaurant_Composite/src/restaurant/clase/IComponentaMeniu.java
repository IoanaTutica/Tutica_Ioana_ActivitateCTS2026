package restaurant.clase;

public interface IComponentaMeniu {
    void adaugaNod(IComponentaMeniu componenta) throws Exception;
    void stergeNod(IComponentaMeniu componenta) throws Exception;
    IComponentaMeniu getNod(int index) throws Exception;
    void descriere();
}