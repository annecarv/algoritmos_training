package challenge;

import java.util.Scanner;

import static challenge.Produto.produtos;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public Menu() {
        while (true) {
            System.out.println("---- Bem Vindo ao Desconto Combado ----");
            System.out.println("CONFIRA NOSSOS PRODUTOS!");
            System.out.println(produtos.toString());
            System.out.println("---- Compre Agora! ----");
            System.out.println("1. Adicionar Produto ao Carrinho");
            System.out.println("2. : ");
            System.out.println("3. Ver Carrinho ");
            System.out.println("4. Finalizar Pagamento ");
            System.out.println("5. Finalizar Compra");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do produto:  ");
                    int id = scanner.nextInt();
                    System.out.print("Digite a quantidade:  ");
                    int quantidade = scanner.nextInt();
                    Carrinho.adicionarProdutoAoCarrinho(id, quantidade);
                    System.out.println("Confira seu carrinho: \n" +
                            "frete:" + Carrinho.getFrete() + '\n' +
                            ", subtotal:" + Carrinho.getSubtotal() + '\n' +
                            ", total:" + Carrinho.getTotal() + '\n' +
                            ", produtos:" + Carrinho.getCarrinho());
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 4:
                    continue;
                case 5:
                    System.out.println("Obrigado por visitar nossa loja!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
}