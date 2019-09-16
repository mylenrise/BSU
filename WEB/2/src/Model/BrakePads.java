package Model;

/**
 * Basic class of automobile brake pads
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class BrakePads extends Spare {

    /**
     * length component of BrakePads
     */

    private int length;

    private void setLength(int length){
        this.length=length;
    }

    /**
     * width component of BrakePads
     */

    private int width;

    private void setWidth(int width){
        this.width=width;
    }

    /**
     * length component of BrakePads
     */

    private int height;

    private void setHeight(int height){
        this.height=height;
    }
    /**
     * Default constructor of BrakePads
     */
    public BrakePads(){
        setName(DEFAULT_STR);
        setPrice(0);
        setCompany(DEFAULT_STR);
        setLength(0);
        setHeight(0);
        setWidth(0);
    }

    /**
     * Constructor of BrakePads with parameters
     * @param name name component of BrakePads
     * @param price price component of BrakePads
     * @param company company component of BrakePads
     * @param length component of BrakePads
     * @param height component of BrakePads
     * @param width component of BrakePads
     */

    public BrakePads(String name, int price, String company, int length, int width, int height){
        setName(name);
        setPrice(price);
        setCompany(company);
        setLength(length);
        setHeight(height);
        setWidth(width);
    }
    /**
     * Defines spare type
     */
    public void getSpare(){
        System.out.println("You've added brake pads");
    }
    /**
     * Converts BrakePads object to string
     * @return the brake pads as string
     */
    @Override
    public String toString(){
        return "(Name: "+name + ", Company: " + company + ", Length: "+length+", Width: "+width+", Height: "+height+", Price: "+price+")";
    }





}
