import java.lang.Math;
import java.util.Scanner;

public class Yuan {
    public static void main(String[] args) {
        Round round = new Round();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of this round:");
        round.r = scan.nextDouble();
        scan.close();
        round.calS();
        System.out.printf("%.2f", round.getS());
    }
}

class Round {

    double r;
    double s;

    public void calS() {
        s = Math.PI * Math.pow(r, 2);
    }

    public double getS() {
        return s;
    }
}