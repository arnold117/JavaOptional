public class Yuan {
    public static void main(String[] args) {
        int cock, hen, chink;

        for (chink = 0; chink < 100; chink += 3) {
            for (hen = 0; hen < 100 - chink; hen++) {
                cock = 100 - hen - chink;
                if (chink / 3 + hen * 5 + cock * 3 == 100.0) {
                    System.out.println("公鸡: " + cock + ", 母鸡: " + hen + ", 小鸡: " + chink);
                }
            }
        }
    }
}
