package Model;

/**
 * Basic class of automobile engine
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Engine extends Spare {

    /**
     * cylinders component of Engine
     */

    private int cylinders;

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

    public Engine(String name, float price, String company, int cylinders){
        setName(name);
        setPrice(price);
        setCompany(company);
        setCylinders(cylinders);
    }

    /**
     * Get copy of object
     * @return new object with same fields
     */
    public StoreSpare getCopy(){
        return new Engine(name,price,company,cylinders);
    }
    /**
     * Defines spare type
     */
    public void getSpare(){
        System.out.println("You've added engine");
    }

    /**
     * Converts Engine object to string
     * @return the engine as string
     */


    @Override
    public String toString(){
        return "(Name: "+name + ", Company: " + company + ", Amount of cylindres: "+cylinders+", Price: "+price+")";
    }



}
