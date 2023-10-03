import java.util.Random;
import java.util.Scanner;

public class MeanMediaVersion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite A: ");
        int a = scanner.nextInt();
        System.out.println("Digite B: ");
        int b = scanner.nextInt();

        while (a != 0 && b !=0) {
            int c = rand.nextInt(2 * a + 1) - a;
            int media = (c + a + b) / 3;

            while (c != media && c != a) {
                c = rand.nextInt(2 * a + 1) - a;

            }

            System.out.println(c);
            System.out.println("Digite A: ");
            a = scanner.nextInt();
            System.out.println("Digite B: ");
            b = scanner.nextInt();

        }
    }
}
