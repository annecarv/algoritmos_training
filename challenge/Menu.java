package challenge;

import java.util.Scanner;


public class Menu {
    Scanner scanner = new Scanner(System.in);
    Produto produtos;
    Pagamento pagamento = new Pagamento();
    Carrinho carrinho = new Carrinho();

    public Menu() {
        while (true) {
            System.out.println("---- Bem Vindo ao Desconto Combado ----");
            System.out.println("CONFIRA NOSSOS PRODUTOS!");
            //System.out.println(produtos.toString());
            //System.out.println(Produto.getProdutos());
            for(Produto p : Produto.getProdutos()) {
                System.out.println(p.toString());
            }
            System.out.println("---- Compre Agora! ----");
            System.out.println("1. Adicionar Produto ao Carrinho");
            System.out.println("2. Ver Carrinho ");
            System.out.println("3. Finalizar Pagamento ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do produto:  ");
                    int id = scanner.nextInt();
                    System.out.print("Digite a quantidade:  ");
                    int quantidade = scanner.nextInt();
                    carrinho.adicionarProdutoAoCarrinho(id, quantidade);
                    System.out.println(carrinho.toString());
                    //DÚVIDA PQ PARA INSTANCIAR O MÉTODO ESTATICO DO GET CARRINHO EU USO Carrinho.getFrete() e metodos nao estaticos uso arrinho.getSubtotal()
                    continue;
                case 2:
                    System.out.println(carrinho.toString());
                    continue;
                case 3:
                    pagamento.calcularValorTotal();
                    pagamento.menuPagamento();
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