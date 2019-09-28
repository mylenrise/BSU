package Model;
/**
 * Interface class of store spares
 * @author Kravchenya Darya
 * @version 1.0.0
 */
public interface StoreSpare {
    void getSpare();
    void increasePrice(float val);
    StoreSpare getCopy();
    double getPrice();
}
