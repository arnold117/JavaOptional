package test.chapter5.t2;

public class Test {
    int x = 5;

    public static void main(String[] args) {
        Test t = new Test();
        t.x++;
        change(t);
        System.out.println(t.x);
    }

    static void change(Test m){
        m.x += 2;
    }
}
