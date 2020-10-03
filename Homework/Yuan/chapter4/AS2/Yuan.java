import java.util.Arrays;
import java.util.Random;

public class Yuan {
    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[100];
        Arrays.fill(b, -1);
        int count = 0;
        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }

        for (int i = 0; i < a.length; i += 5) {
            for (int j = i; j < i + 5; j++) {
                System.out.print(a[j] + "    ");
            }
            System.out.println();
        }

        for (int i : a) {
            if (i % 3 == 0 || i % 7 == 0) {
                count++;
                b[count] = i;
            }
        }

        System.out.println("有 " + count + "个数可以被3整除或被7整除\n这些数是：");
        count = 0;
        for (int i : b) {
            if (count == 4) {
                System.out.println();
                count = 0;
            }
            if (i != -1) {
                System.out.print(i + "    ");
                count++;
            }
        }
    }
}
