package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pagamento {
    private String cupom;
    private double desconto;
    private double valorTotal;
    private String meioPagamento;
    List<String> cuponsDisponiveis = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();
    Produto produto;
    public String adicionarCupom() {
        System.out.print("Deseja inserir um cupom?");
        String cupom = scanner.next();
        validarCupom(cupom);
        return cupom;
    }

    public void validarCupom(String cupom) {

    }

    public String formatacaoTaxonomia(String s) {
        if (s.length() >= 3) {
            String desc10 = s.substring(0, 3) + "10";
            String desc20 = s.substring(0, 3) + "20";
            String desc30 = s.substring(0, 3) + "30";

            cuponsDisponiveis.add(desc10);
            cuponsDisponiveis.add(desc20);
            cuponsDisponiveis.add(desc30);
        }
        return s;
    }

    public void catalogoCupons() {
        cuponsDisponiveis.add("PrimeiraCompra");

    }

    public void descontoPix() {
        setValorTotal(getValorTotal() - (getValorTotal() * 0.05));
    }

    public void descontoBoleto() {
        setValorTotal(getValorTotal() - (getValorTotal() * 0.05));
    }

    public double calcularValorTotal() {
        double totalCarrinho = carrinho.getSubtotal();

        //DO MAIOR PARA O MENOR
         if (totalCarrinho > 1.999) {
            double percentualDesconto = totalCarrinho * 0.10;
            double subTotalAtualizado = carrinho.setSubtotal(percentualDesconto);
            setValorTotal(subTotalAtualizado);
         }
         else if (totalCarrinho > 999) {
            double percentualDesconto = totalCarrinho * 0.05;
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
