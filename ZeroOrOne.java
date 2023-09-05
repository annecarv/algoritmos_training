import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Alice, 0 ou 1: ");
        int aValue = scan.nextInt();

        System.out.println("Beto, 0 ou 1: ");
        int bValue = scan.nextInt();

        System.out.println("Clara, 0 ou 1: ");
        int cValue = scan.nextInt();

        if (aValue == bValue && bValue == cValue) {
            System.out.println("*");
        } else if (aValue == 1 && bValue == 0 && cValue == 0) {
            System.out.println("A");
        } else if (aValue == 0 && bValue == 1 && cValue == 0) {
            System.out.println("B");
        } else if (aValue == 0 && bValue == 0 && cValue == 1) {
            System.out.println("C");
        } else if (aValue == 0 && bValue == 1 && cValue == 1) {
            System.out.println("A");
        } else if (aValue == 1 && bValue == 0 && cValue == 1) {
            System.out.println("B");
        } else if (aValue == 1 && bValue == 1 && cValue == 0) {
            System.out.println("C");
        }

    }
}
