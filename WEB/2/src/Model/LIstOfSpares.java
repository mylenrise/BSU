package Model;
import java.util.ArrayList;
import java.util.Collections;


/**
 * ListOfSpares class
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class LIstOfSpares implements StoreSpare {
    ArrayList<StoreSpare> store=new ArrayList<StoreSpare>();


    /**
     * Increase price of each spare
     * @param val value for increasing in percents
     */
    private Memento undo;

    /**
     * Memento class
     */

    private class Memento {
        ArrayList<StoreSpare> mStore=new ArrayList<StoreSpare>();

        /**
         * Default constructor of Memento
         */
        Memento() {
            for (StoreSpare spare :
                    store) {
                mStore.add(spare.getCopy());

            }
        }

        ArrayList<StoreSpare> getStore() {
            return mStore;
        }

    }

    /**
     * Preview function
     */
    public void preview() {
        undo = new Memento();
    }
    /**
     * Get copy
     */
    public StoreSpare getCopy(){
        return new LIstOfSpares();
    }

    /**
     * Undo changes
     */
    public void undoChanges() {
        store = undo.getStore();

    }
    /**
     * increase price
     * @param val value to increase in percents
     */
    public void increasePrice(float val){
        for (StoreSpare spare :
                store) {
            spare.increasePrice(val);
        }

    }
    /**
     * Default constructor of ListOfSpares
     */
    public LIstOfSpares(){

    }

    /**
     * increase price
     * @param sp spare to add
     */
    public void add(StoreSpare sp) {
        store.add(sp);
    }

    /**
     * increase price
     * @param sp spare to remove
     */
    public void remove(StoreSpare sp) {
        store.remove(sp);
    }

    /**
     * Get spare
     */
    public void getSpare(){
        for (StoreSpare spare :
                store) {
            spare.getSpare();
        }
    }
    /**
     * Get price
     * @return price
     */
    public double getPrice(){
        return 0;
    }

    /**
     * Print list of spares
     */
    public void print() {
        for (StoreSpare spare :
                store) {
            System.out.println(spare);
        }
    }
    /**
     * Sort list of spares
     */
    public void sort(){
        Collections.sort(store,new SpareComparator());
    }


}
