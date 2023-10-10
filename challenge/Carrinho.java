package challenge;

import java.util.ArrayList;

import static challenge.Produto.getProdutoById;
import static challenge.Produto.getProdutoByIdBoolean;

public class Carrinho  {

    private static double frete = 15;
    private double subtotal;
    private int quantidade;
    //private boolean idExistente = false;
    private ArrayList<Produto> carrinho = new ArrayList<>(Produto.getProdutos());
    Produto produto;

    //É OBRIGATORIO UMA CLASSE TER CONSTRUTOR??? DUVIDA

    public Carrinho() {
        this.carrinho = new ArrayList<Produto>();
    }
    public void adicionarProdutoAoCarrinho(int id, int quantidade) {

        boolean produtoExistente = getProdutoByIdBoolean(id);

        if (produtoExistente) {

            Produto produto = getProdutoById(id);

            setQuantidade(getQuantidade() + quantidade);

            if (quantidade > 100) {
                double percentualDesconto = produto.getPrecoUnitario() * 0.02;
                produto.setPrecoUnitario(produto.getPrecoUnitario() - percentualDesconto);
                System.out.println("Obaaaa! Você ganhou um desconto de R$ " + percentualDesconto + " por produto. ");
            }

            System.out.println("Produto adicionado ao carrinho.");

            setSubtotal(produto.getPrecoUnitario() * quantidade);
            setCarrinho(produto);
            calcularFrete();
        } else {
            System.out.println("Produto não localizado.");
        }
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------- \n" +
                "Confira seu carrinho \n" +
                "Frete R$:" + Carrinho.getFrete() + '\n' +
                "Subtotal R$:" + getSubtotal() + '\n' +
                "Produtos: " + getCarrinho().toString() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "-------------------------------------------------------------- \n"
                ;
    }

    //Caso o valor ANTES dos descontos seja acima de 299 o frete é grátis - O CORRETO SERIA DEPOIS??? ENFIM, PEGADINHA SERÁ ? DUVIDAS
    public double calcularFrete() {
        if (getSubtotal() > 299.0) {
            setFrete(0);
            double freteAtualizado = getFrete();
            System.out.println("FRETE GRÁTIS, APROVEITE.");
            return freteAtualizado;
        }
       return getFrete();
    }
    public void removerDoCarrinho() {

    }
    public static double getFrete() {
        return frete;
    }

    public static void setFrete(double frete) {
        Carrinho.frete = frete;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public double setSubtotal(double subtotal) {
        this.subtotal = subtotal;
        return subtotal;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Produto produto) {
        this.carrinho.add(produto);
    }

}
