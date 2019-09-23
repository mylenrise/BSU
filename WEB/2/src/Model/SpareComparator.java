package Model;

import java.util.Comparator;

public class SpareComparator implements Comparator<StoreSpare> {
    @Override
    public int compare(StoreSpare s1, StoreSpare s2) {

        if(s1.getPrice()>s2.getPrice()){
            return 1;
        }
        else if (s1.getPrice()<s2.getPrice()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
