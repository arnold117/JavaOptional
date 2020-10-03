import java.util.ArrayList;

public class Home2_2 {
    public static void main(String[] args) {
        Prime1 prime = new Prime1();
        int count = 0;

        // 循环寻找双胞胎素数对
        for (int i = 3; i < 50; i++) {
            // 判断是否是双胞胎素数对
            if (prime.isPrime(i) && prime.isPrime(i + 2)) {
                // 是，保存数据至数组
                prime.setA(i, i + 2);
                count++;
            }
        }
        // 打印表格
        prime.printTableofA(count);
    }
}

class Prime1 {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    // 判断是否是素数
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 保存数据至数组
    public void setA(int z1, int z2) {
        list1.add(z1);
        list2.add(z2);
    }

    // 打印表格
    public void printTableofA(int count) {
        System.out.println("双胞胎素数对:");
        for (int i = 0; i < count; i++) {
            System.out.println("{"+list1.get(i)+", "+list2.get(i)+"}");
        }
    }
}