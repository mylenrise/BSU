package Model;

import Model.Circle;

/**
 * This is the class of Ball with some basic functions
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Ball extends Circle {

    private double z;

    /**
     * Z component of Ball
     */

    /**
     * @return z
     */
    public double getZ() {
        return z;
    }

    public void setZ(double r){
        this.z=z;
    }

    /**
     * Constructor of Ball with given (X, Y, Z, R)
     * @param x X component of Ball
     * @param y Y component of Ball
     * @param z Z component of Ball
     * @param r R component of Ball
     */
    public Ball (double x, double y,double z, double r) {
        super(x,y,r);
        setZ(z);
    }

    /**
     * Default constructor, creates (0, 0, 0, 1) Ball
     */
    public Ball(){
        super();
        setZ(0);
    }

    /**
     * Counts Ball square
     * @return value of Ball square
     */
    public double square(){
        return Math.pow(super.getR(),2)*Math.PI*4;
    }

    /**
     * Counts Ball volume
     * @return value of Ball volume
     */
    public double volume(){
        return Math.pow(super.getR(),3)*Math.PI*4/3;
    }

    /**
     * Converts Ball to string
     * @return x, y, z, r as string
     */
    @Override
    public String toString(){
        return "(X: "+super.getX() + ", Y: " + super.getY() + ", Z: "+z+ ", R: " + super.getR()+")";
    }

}
