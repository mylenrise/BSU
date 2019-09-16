/**
 * Basic class of automobile engine
 * @author Kravvchenya Darya
 * @version 1.0.0
 */

public class Engine extends Spare {

    /**
     * cylinders component of Spare
     */

    private int cylinders=0;

    private void setCylinders(int cylinders){
        this.cylinders=cylinders;
    }

    /**
     * Default constructor of Engine
     */
    public Engine(){
        setName(DEFAULT_STR);
        setPrice(0);
        setCompany(DEFAULT_STR);
        setCylinders(0);

    }

    /**
     * Constructor of Engine with parameters
     * @param name name component of Engine
     * @param price price component of Engine
     * @param company company component of Engine
     * @param cylinders cylinders component of Engine             
     */

    public Engine(String name, int price, String company, int cylinders){
        setName(DEFAULT_STR);
        setPrice(0);
        setCompany(DEFAULT_STR);
        setCylinders(0);
    }





}
