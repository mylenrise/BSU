package Model;

/**
 * Basic abstract class of automobile spares
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public abstract class Spare implements StoreSpare {

    /**
     * value for not defined string
     */

    final String DEFAULT_STR="Not defined";
    /**
     * name component of Spare
     */
    protected String name;

    protected void setName(String name){
        this.name=name;
    }
    /**
     * price component of Spare
     */
    protected int price;

    protected void setPrice(int price){
        this.price=price;
    }
    /**
     * component component of Spare
     */
    protected String company;

    protected void setCompany(String company){
        this.company=company;
    }





}
