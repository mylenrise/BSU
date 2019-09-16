package Controller;
import java.util.ArrayList;
import Model.*;

/**
 * Fabric pattern realization
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class SpareFactory {

    /**
     * Types of spares
     */
    public enum SpareTypes {
        ENGINE,
        BUS,
        BRAKE_PADS
    }

    /**
     * Fabric method
     * @param type type of spare
     * @return spare of defined type
     */
    public static StoreSpare createSpare(SpareTypes type) {
        StoreSpare toReturn = null;
        switch (type) {
            case ENGINE:
                toReturn = new Engine();
                break;
            case BUS:
                toReturn = new Bus();
                break;
            case BRAKE_PADS:
                toReturn = new BrakePads();
                break;
            default:
                throw new IllegalArgumentException("Wrong spare type:" + type);
        }
        return toReturn;
    }



}
