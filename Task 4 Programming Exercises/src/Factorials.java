public class Factorials {

    public static void main(String[] args) {
        int total;

        for (int i = 1; i <= 10; i++) {
            total = i;

            for (int j = i - 1 ; j > 0; j--) {
                total = total * j;
            }
            System.out.println(i + " factorial is " + total);
        }
    }
}
