package test.chapter5.t9;

public class Ex1 {
    static int m=2;

    public static void main(String args[ ]) {

        Ex1 obj1 = new Ex1();

        Ex1 obj2 = new Ex1();

        obj1.m = m + 1;

        System.out.println("m="+obj2.m);

    }
}
