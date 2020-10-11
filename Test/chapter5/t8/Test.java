package test.chapter5.t8;

public class Test {
    static int x=5;

    static { x+=10; }

    public static void main(String args[ ]){

        System.out.println("x="+x);

    }

    static { x=x-5; }
}
