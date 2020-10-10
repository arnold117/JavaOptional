package classeg.chapter5.exp1;

public class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Point p1 = new Point();
        System.out.println(p1);
        p1.x = 12;
        System.out.println(p1);
        Point p2 = new Point();
        p2.setY(8);
        System.out.println(p2);
        Point p3 = p2;
        System.out.println(p3);
        p2.setX(5);
        System.out.println(p2);
        System.out.println(p3);
    }
}
