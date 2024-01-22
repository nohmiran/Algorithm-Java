import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        for (long i = 0; n >= Math.pow(2, i); i++) {
            if (Math.pow(2, i) == n) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
