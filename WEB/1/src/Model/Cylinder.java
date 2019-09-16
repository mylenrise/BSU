package Model;
/**
 * This is the class of Cylinder with some basic functions
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Cylinder extends Ball {

    /**
     * h component of Cylinder
     */
    private double h;

    /**
     * @return h
     */
    public double getH() {
        return h;
    }

    public void setH(double h){
        this.h=h;
    }

    /**
     * Constructor of Ball with given (X, Y, Z, R, H)
     * @param x X component of Cylinder
     * @param y Y component of Cylinder
     * @param z Z component of Cylinder
     * @param r R component of Cylinder
     * @param h H component of Cylinder
     */
    public Cylinder (double x, double y,double z, double r, double h) {
        super(x,y,z,r);
        setH(h);
        if(h <=0){
            throw new IllegalArgumentException ("Height must be a positive number");
        }
    }

    /**
     * Default constructor, creates (0, 0, 0, 1, 1) Cylinder
     */
    public Cylinder(){
        super();
        setH(1);
    }
    /**
     * Counts Cylinder square
     * @return value of Cylinder square
     */
    public double square(){
        return (this.h*super.getR()+Math.pow(super.getR(),2))*Math.PI*2;
    }

    /**
     * Counts Cylinder volume
     * @return value of Cylinder volume
     */
    public double volume(){
        return Math.pow(super.getR(),2)*Math.PI*this.h;
    }

    /**
     * Converts Cylinder to string
     * @return x, y, z, r, h as string
     */
    @Override
    public String toString(){
        return "(X: "+super.getX() + ", Y: " + super.getY() + ", Z: "+super.getZ() + ", R: " + super.getR()+", H: "+h+")";
    }

}
