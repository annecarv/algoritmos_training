import java.util.Scanner;

public class Gangorra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            // Código que pode lançar uma exceção
            System.out.println("Insira o peso da criança do lado esquerdo: ");
            int p1Value = scan.nextInt();

            System.out.println("Insira o comprimento do lado esquerdo da gangorra: ");
            int c1Value = scan.nextInt();

            System.out.println("Insira o peso da criança do lado direito: ");
            int p2Value = scan.nextInt();

            System.out.println("Insira o comprimento do lado direito da gangorra: ");
            int c2Value = scan.nextInt();

            if( p1Value < 10 || c1Value < 10|| p2Value < 10 || c2Value < 10) {
                if (p1Value > 100 || c1Value > 100 || p2Value > 100 || c2Value> 100) {
                    System.out.println("Peso ou comprimento fora do ideal.");
                }
            }

            int multiplicacaoPrimeiroTermo = p1Value * c1Value;
            int multiplicacaoSegundoTermo = p2Value * c2Value;

            if (multiplicacaoPrimeiroTermo == multiplicacaoSegundoTermo) {
                System.out.println("0");
            }

            else if (multiplicacaoPrimeiroTermo > multiplicacaoSegundoTermo) {
                System.out.println("-1");
            }

            else if (multiplicacaoPrimeiroTermo < multiplicacaoSegundoTermo) {
                System.out.println("1");
            }

        } catch (ArithmeticException e) {
            // Trata a exceção, neste caso uma divisão por zero
            System.out.println("Peso ou comprimento abaixo do ideal.");
        }

    }
}
