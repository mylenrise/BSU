package Model;
/**
 * This is the class of Circle with some basic functions
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Circle {

    private double r;
    private double x;
    private double y;

    /**
     * R component Circle
     */

    /**
     * @return r
     */
    public double getR() {
        return r;
    }

    public void setR(double r){
        this.r=r;
    }
    /**
     * X component of Circle
     */

    /**
     * @return x
     */
    public double getX() {
        return x;
    }

    public void setX(double x){
        this.x=x;
    }
    /**
     * Y component of Circle
     */

    /**
     * @return y
     */
    public double getY() {
        return y;
    }

    public void setY(double y){
        this.y=y;
    }

    /**
     * Constructor of Circle with given (X, Y, R)
     * @param x X component of Circle
     * @param y Y component of Circle
     * @param r R component of Circle
     */

    public Circle (double x, double y, double r) {
        setR(r);
        setX(x);
        setY(y);
        if(r <=0){
            throw new IllegalArgumentException ("Radius must be a positive number");
        }
    }

    /**
     * Default constructor, creates (0, 0, 1) Circle
     */

    public Circle(){
        setX(0);
        setY(0);
        setR(1);
    }

    /**
     * Counts Circle square
     * @return value of Circle square
     */
    public double square(){
        return Math.pow(this.r,2)*Math.PI;
    }

    /**
     * Counts Circle perimeter
     * @return value of Circle perimeter
     */
    public double perimeter(){
        return this.r*Math.PI;
    }


    /**
     * Converts Circle to string
     * @return x, y, r as string
     */
    @Override
    public String toString(){
        return "(X: "+x + ", Y: " + y + ", R: " + r+")";
    }

  }