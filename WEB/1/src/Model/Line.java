package Model;
/**
 * This is the class of Line function with some basic functions
 * @author Kravchenya Darya
 * @version 1.0.0
 */
import  java.util.*;


public class Line {

    /**
     * k component of Line
     */
    private double k;
    public double getK() {
        return k;
    }

    public void setK(double k){
        this.k=k;
    }
    /**
     * b component of Line
     */
    private double b;
    public double getB() {
        return b;
    }

    public void setB(double b){
        this.b=b;
    }

    public boolean isUsed=false;
    /**
     * circles component of Line
     */
    public Set<Circle> circles;


    /**
     * Default constructor, creates (1,0) Line and initializes set of circles
     */
    public Line(){
        setK(1);
        setB(0);
        circles=new HashSet<Circle>();

    }
    /**
     * Constructor of Line with given (X, Y, Z, R, H)
     * @param k X component of Cylinder
     * @param b Y component of Cylinder
     */
    public Line(double k, double b){
        setK(k);
        setB(b);
        circles=new HashSet<Circle>();
    }

    /**
     * Converts Line to string
     * @return k, b, circles as string
     */
    @Override
    public String toString(){
        String tmp= "(K: "+k + ", B: " + b + ")\n";
        if(circles.size()>2) {
            Iterator<Circle> iterator = circles.iterator();
            while (iterator.hasNext()) {
                tmp += iterator.next();
            }
            return tmp;
        }
        return "";

    }
}
