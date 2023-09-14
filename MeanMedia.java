
import java.util.Scanner;

public class MeanMedia {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                int A = scanner.nextInt();
                int B = scanner.nextInt();

                if (A == 0 && B == 0) {
                    break;
                }

                int C = 3 * B - A;

                System.out.println(C);
            }
        }
    }
