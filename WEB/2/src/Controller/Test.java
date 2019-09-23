package Controller;

import Model.*;

import java.util.ArrayList;

/**
 * Testing classes
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Test {

    /**
     * Testing method
     */
    public static void test() {
        LIstOfSpares store=new LIstOfSpares();
       // ArrayList<StoreSpare> store = new ArrayList<StoreSpare>();
        store.add(SpareFactory.createSpare(SpareFactory.SpareTypes.ENGINE));
        store.add(SpareFactory.createSpare(SpareFactory.SpareTypes.BUS));
        store.add(SpareFactory.createSpare(SpareFactory.SpareTypes.BRAKE_PADS));

        store.add(new Engine("Engine VN T7XO",134,"Honda",4));
        store.add(new Bus("Winter bus YY56",42,"Ford",true));
        store.add(new BrakePads("Brake pads EW ii897y ",64,"Citroen",54,42,23));

        store.print();
        store.preview();
        System.out.println("********************************");
        store.increasePrice(10);
        store.sort();
        store.print();
        System.out.println("********************************");
        store.undoChanges();
        store.print();
        System.out.println("********************************");


    }
}
