import java.lang.Math;
import java.util.Scanner;

/**
 * Circle
 */
public class Circle {

    double radius;
    double square;

    public void calSquare() {
        this.square = Math.PI * Math.pow(radius, 2);
    }

    public double getSquare() {
        return this.square;
    }

    public Circle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of this circle:");
        this.radius = scan.nextDouble();
        scan.close();
        calSquare();
    }
}