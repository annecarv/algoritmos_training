import java.util.Random;
import java.util.Scanner;

public class MeanMediaVersion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Digite A: ");
            int a = scanner.nextInt();
            System.out.println("Digite B: ");
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            int c;
            while (true) {
                c = rand.nextInt(2 * a + 1) - a;  // Gera valores entre -a e a
                int media = (c + a + b) / 3;

                if (a == media) {  // Verifica se a média é igual a A
                    System.out.println(c);
                    break;
                }
            }
        }
        scanner.close();
    }
}
