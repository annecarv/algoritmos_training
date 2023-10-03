
import java.util.Scanner;

public class MeanMedia {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite A: ");
            int a = scanner.nextInt();
            System.out.println("Digite B: ");
            int b = scanner.nextInt();

            while (a != 0 && b != 0) {

                int c = 2 * a - b;

                System.out.println(c);

                System.out.println("Digite A: ");
                a = scanner.nextInt();
                System.out.println("Digite B: ");
                b = scanner.nextInt();

            }
        }
    }
