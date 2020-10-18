package homework.Yuan.chapter4.AS4;

/**
 * Yuan
 */
public class Yuan {

    public static void main(String[] args) {
        Prime prime = new Prime();
        System.out.println("双胞胎素数对:");
        for (int i = 3; i < 50; i++) {
            if (prime.isPrime(i) && prime.isPrime(i + 2)) {
                System.out.println("{" + i + ", " + (i + 2) + "}");
            }
        }
    }
}

/**
 * Prime
 */
class Prime {

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}