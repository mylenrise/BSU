package Model;

import java.util.Comparator;

/**
 * Basic abstract class of automobile spares
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public abstract class Spare implements StoreSpare {

    /**
     * value for not defined string
     */

    final String DEFAULT_STR = "Not defined";
    /**
     * name component of Spare
     */
    protected String name;

    protected void setName(String name) {
        this.name = name;
    }

    /**
     * price component of Spare
     */
    protected float price;

    protected void setPrice(float price) {
        this.price = price;
    }

    /**
     * component component of Spare
     */
    protected String company;

    protected void setCompany(String company) {
        this.company = company;
    }

    /**
     * Increase price of the spare
     *
     * @param val value for increasing in percents
     */
    public void increasePrice(float val) {
        this.price *= (1 + val / 100);
    }

    /**
     * Get price
     * @return price
     */
    public double getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : 2);
        result = prime * result + 23; result = prime * result +
                ((price == 0) ? 0 : 4); return result;
    }





}


