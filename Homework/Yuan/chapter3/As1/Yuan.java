package homework.Yuan.chapter3.As1;

/**
 * Yuan
 */
public class Yuan {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {
                    if (i > j && j > j2) {
                        count++;
                    }
                }
            }
        }

        System.out.println("一共有" + count + "个分机号码");
    }
}