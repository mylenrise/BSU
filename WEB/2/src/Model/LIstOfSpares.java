package Model;
import java.util.ArrayList;
import java.util.Collections;

public class LIstOfSpares implements StoreSpare {
    ArrayList<StoreSpare> store=new ArrayList<StoreSpare>();


    /**
     * Increase price of each spare
     * @param val value for increasing in percents
     */
    private Memento undo;

    private class Memento {
        ArrayList<StoreSpare> mStore;

        Memento() {
            mStore = store;
        }

        ArrayList<StoreSpare> getStore() {
            return mStore;
        }

    }

    public void preview() {
        undo = new Memento();
    }

    public void undoChanges() {
        store = undo.getStore();

    }
    public void increasePrice(float val){
        for (StoreSpare spare :
                store) {
            spare.increasePrice(val);
        }

    }

    public LIstOfSpares(){

    }


    public void add(StoreSpare sp) {
        store.add(sp);
    }


    public void remove(StoreSpare sp) {
        store.remove(sp);
    }

    public void getSpare(){
        for (StoreSpare spare :
                store) {
            spare.getSpare();
        }
    }
    public double getPrice(){
        return 0;
    }

    public void print() {
        for (StoreSpare spare :
                store) {
            System.out.println(spare);
        }
    }
    public void sort(){
        Collections.sort(store,new SpareComparator());
    }


}
