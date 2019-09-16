package Controller;
import Model.*;
import java.util.*;

/**
 * Basic class demonstrates functions of Triangle and Point classes
 * @author Kravchenya Darya
 * @version 1.0.0
 */

public class Controller {

    /**
     * finds equation of the line function between centres of two circles
     * @param c1 1st circle
     * @param c2 2nd circle
     * @return Line object
     */

    public static Line findLine(Circle c1, Circle c2){
        double k=0;
        double b=c1.getY();
        if((c1.getY()-c2.getY())/(c1.getX()-c2.getX())!=0) {
            k = (c1.getY() - c2.getY()) / (c1.getX() - c2.getX());
            b = c1.getY() - c1.getX() * k;
        }
        Line line = new Line(k,b);
        line.circles.add(c1);
        line.circles.add(c2);
        return line;
    }

    /**
     * finds circle with maximal square
     * @param data circle array
     * @return index of circle with maximal square in array
     */

    public static int findMax(Circle[] data){
        int maxSind=0;
        double maxS=0;
        for(int i=0;i<7;i++){
            if(data[i].square()>maxS) {
                maxS = data[i].square();
                maxSind = i;
            }
        }
        return maxSind;
    }

    /**
     * finds circle with minimal square
     * @param data circle array
     * @return index of circle with minimal square in array
     */

    public static int findMin(Circle[] data){
        int minSind=0;
        double minS=Double.MAX_VALUE;

        for(int i=0;i<7;i++){
            if(data[i].square()<minS) {
                minS = data[i].square();
                minSind = i;
            }
        }
        return minSind;
    }

    /**
     * finds circles with centres on one line
     * @param lines list of all equations of the line
     */

    public static void findCircles(ArrayList<Line> lines) {
        for (int i = 0; i < lines.size(); i++) {
            for (int j = 1 + i; j < lines.size(); j++) {
                if (lines.get(i).getK() == lines.get(j).getK() && lines.get(i).getB() == lines.get(j).getB() && !lines.get(j).isUsed) {
                    lines.get(i).circles.addAll(lines.get(j).circles);
                    lines.get(j).isUsed = true;
                }

            }
        }
    }

    /**
     * Testing of program classes
     */
    public static void program()  {

        Circle[] data = new Circle[7];

        try {
            data[0] = new Circle(1, 4, 4);
            data[1] = new Circle(2, 5, 7);
            data[2] = new Circle(11, 1, 3);
            data[3] = new Circle(12, 6, 23);
            data[4] = new Circle(-2, -3, 5);
            data[5] = new Circle(-1, 2, 4);
            data[6] = new Circle(0, -4, 2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Line> lines = new ArrayList<Line>();

        System.out.println("Circles array: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(i+". "+data[i].toString());
            for (int j = i+1; j < 7; j++) {
                lines.add(findLine(data[i], data[j]));
            }

        }
        findCircles(lines);

        System.out.println("\nIndex of circle with maximal square: "+findMax(data));
        System.out.println("Index of circle with minimal square: "+findMin(data));

        HashSet linesSet=new HashSet(lines);
        Iterator<Line> l_iterator = linesSet.iterator();

        System.out.println("\nCenters are on the same lines: ");
        while (l_iterator.hasNext()) {
            System.out.print(l_iterator.next());
        }

        Ball ball=new Ball(4,3,22,5);
        Ball cylinder=new Cylinder(4,3,22,5,3);

        System.out.println("\n\nBall");
        System.out.println(ball.toString());
        System.out.println("Square: "+ball.square());
        System.out.println("Volume: "+ball.volume());
        System.out.println("\nCylinder");
        System.out.println(cylinder.toString());
        System.out.println("Square: "+cylinder.square());
        System.out.println("Volume: "+cylinder.volume());
        }
    }
