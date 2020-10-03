import java.util.*;

public class Yuan {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int count[] = new int[6];

        for (int i = 0, j = 0; i < 1000; i++) {
            dice.roll();
            j = dice.getResult();
            switch (j) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
                case 6:
                    count[5]++;
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d点出现了%d次。\r\n", i + 1, count[i]);
        }
    }
}

class Dice {

    private int result;

    public void roll() {
        Random rand = new Random();
        result = rand.nextInt(7);
    }

    public int getResult() {
        return result;
    }
}