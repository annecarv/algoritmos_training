package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static challenge.Produto.getProdutos;
public class Pagamento {
    private String cupom;
    private double desconto;
    private double valorTotal;
    private String meioPagamento;
    List<String> cuponsDisponiveis = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();
    Produto produto = new Produto();

    public String adicionarCupom() {
        System.out.println("Deseja inserir um cupom?");
        String cupom = scanner.next();

        if (!validarCupomDigitado(cupom)) {
            System.out.println("Cupom inválido.");
            return null;
        }
        return cupom;
    }

    public Boolean validarCupomDigitado(String cupom) {

        catalogoCupons(); //Cria a lista de cupons.

        for (String c : cuponsDisponiveis) {
            if (cupom.equalsIgnoreCase(c)) {
                validacaoDescontoCupons();
                return true;
            }
            System.err.println(c);
        }
        return false;
    }
    public void catalogoCupons() {

        cuponsDisponiveis.add("PrimeiraCompra");

        for (Produto p : getProdutos()) {
            String desc10 = p.getTaxonomia().substring(0, 3) + "10";
            String desc20 = p.getTaxonomia().substring(0, 3) + "20";
            String desc30 = p.getTaxonomia().substring(0, 3) + "30";

            cuponsDisponiveis.add(desc10);
            cuponsDisponiveis.add(desc20);
            cuponsDisponiveis.add(desc30);
        }

    }

    public void validacaoDescontoCupons() {
        for (String c : cuponsDisponiveis) {
            if (c.endsWith("10")) {
                setValorTotal(getValorTotal() - (getValorTotal() * 0.10));
                System.out.println("Cupom " + c +" adicionado.");
                System.out.println("WOW! DESCONTO DE 10%");
                break;
            } else if (c.endsWith("20")) {
                setValorTotal(getValorTotal() - (getValorTotal() * 0.20));
                System.out.println("Cupom " + c +" adicionado.");
                System.out.println("WOW! DESCONTO DE 20%");
                break;
            } else if (c.endsWith("30")) {
                setValorTotal(getValorTotal() - (getValorTotal() * 0.30));
                System.out.println("Cupom " + c +" adicionado.");
                System.out.println("WOW! DESCONTO DE 30%");

                break;
            } else if (c.contentEquals("PrimeiraCompra")) {
                setValorTotal(getValorTotal() - (getValorTotal() * 0.10));
                System.out.println("Cupom " + c +" adicionado.");
                System.out.println("WOW, DESCONTO DE 10% NA PRIMEIRA COMPRA!");
                break;
            }
        }
    }

    public void descontoPix() {
        setValorTotal(getValorTotal() - (getValorTotal() * 0.05));
    }

    public void descontoBoleto() {
        setValorTotal(getValorTotal() - (getValorTotal() * 0.05));
    }

    public void finalizarPagamento() {
        System.out.println("Pagamento Finalizado");
    }

    public double calcularValorTotal() {
        double totalCarrinho = carrinho.getSubtotal();

        if (totalCarrinho > 1.999) {
            double percentualDesconto = totalCarrinho * 0.10;
            double subTotalAtualizado = carrinho.setSubtotal(percentualDesconto);
            setValorTotal(subTotalAtualizado);
        } else if (totalCarrinho > 999) {
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
                    descontoPix();
                    adicionarCupom();
                    finalizarPagamento();
                    continue;
                case 2:
                    descontoBoleto();
                    adicionarCupom();
                    finalizarPagamento();
                    continue;
                case 3:
                    adicionarCupom();
                    finalizarPagamento();
                    continue;
                case 4:
                    adicionarCupom();
                    finalizarPagamento();
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
    public double setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
        return valorTotal;
    }
}
