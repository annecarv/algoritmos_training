    package challenge;

    import java.util.Scanner;

    public class Pagamento {
        private String cupom;
        private double desconto;
        private double valorTotal;
        private String meioPagamento;
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho;


        //MAIS UMA VEZ, É OBRIGATÓRIO UMA CLASSE TER CONSTRUTOR??? DUVIDAS
        public Pagamento(Carrinho carrinho) {

        }

        public String adicionarCupom() {
            System.out.print("Deseja inserir um cupom?");
            String cupom = scanner.next();
            return cupom;
        }

        public void verificarCupom() {
        }

        public void descontoPix() {
            setValorTotal(getValorTotal() - (getValorTotal() * 0.05));
        }

        public void descontoBoleto() {
            setValorTotal(getValorTotal() - (getValorTotal() * 0.05));
        }

        public double calcularValorTotal() {
            double totalCarrinho = carrinho.getSubtotal();

            if (totalCarrinho > 999) {
                double percentualDesconto = totalCarrinho * 0.05;
                double subTotalAtualizado = carrinho.setSubtotal(percentualDesconto);
                setValorTotal(subTotalAtualizado);
            } else if (totalCarrinho > 1.999) {
                double percentualDesconto = totalCarrinho * 0.10;
                double subTotalAtualizado = carrinho.setSubtotal(percentualDesconto);
                setValorTotal(subTotalAtualizado);
            }

            return setValorTotal(totalCarrinho);
        }

        public void menuPagamento() {
            while (true) {
                System.out.println("---- FINALIZAR PAGAMENTO ----");
                System.out.println("Confira seu carrinho!");
                System.out.println(carrinho.toString());
                System.out.println("1. Pagar com Pix");
                System.out.println("2. Pagar com Boleto ");
                System.out.println("3. Pagar com Cartão de Crédito ");
                System.out.println("4. Pagar com Bitcoin");
                System.out.println("5. Cancelar Compra");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarCupom();
                        continue;
                    case 2:
                        adicionarCupom();
                        continue;
                    case 3:
                        adicionarCupom();
                        continue;
                    case 4:
                        adicionarCupom();
                        continue;
                    case 5:
                        System.out.println("Seu carrinho ficará salvo para quando desejar finalizar a compra.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");

                }
            }

        }

        public double getValorTotal() {
            return valorTotal;
        }

        //DÚVIDA SETTERS PODEM RETORNAR VALORES???
        public double setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
            return valorTotal;
        }
    }
