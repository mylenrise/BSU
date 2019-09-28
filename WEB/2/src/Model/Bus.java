package Model;

/**
 * Basic class of automobile bus
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Bus extends Spare {

    /**
     * isStudded component of Spare
     */

    private boolean isStudded;

    private void setIsStudded(boolean isStudded) {
        this.isStudded = isStudded;
    }

    /**
     * Default constructor of Bus
     */
    public Bus() {
        setName(DEFAULT_STR);
        setPrice(0);
        setCompany(DEFAULT_STR);
        setIsStudded(false);

    }

    /**
     * Constructor of Bus with parameters
     *
     * @param name      name component of Bus
     * @param price     price component of Bus
     * @param company   company component of Bus
     * @param isStudded isStudded component of Bus
     */

    public Bus(String name, float price, String company, boolean isStudded) {
        setName(name);
        setPrice(price);
        setCompany(company);
        setIsStudded(isStudded);
    }
    /**
     * Get copy of object
     * @return new object with same fields
     */
    public StoreSpare getCopy(){
        return new Bus(name,price,company,isStudded);
    }

    /**
     * Defines spare type
     */
    public void getSpare(){
        System.out.println("You've added bus");
    }
    /**
     * Converts Bus object to string
     * @return the Bus as string
     */
    @Override
    public String toString(){
        return "(Name: "+name + ", Company: " + company + ", Studded: "+(isStudded?"Yes":"No")+", Price: "+price+")";
    }




}