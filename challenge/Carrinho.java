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

    //É OBRIGATORIO UMA CLASSE TER CONSTRUTOR???
    public Carrinho() {
        this.carrinho = new ArrayList<Produto>();
    }
    public void adicionarProdutoAoCarrinho(int id, int quantidade) {
        boolean produtoExistente = getProdutoByIdBoolean(id);

        if (produtoExistente) {
            setQuantidade(getQuantidade() + quantidade);
            Produto produto = getProdutoById(id);
            setCarrinho(produto);
            System.out.println("Produto adicionado ao carrinho.");
        } else {
            System.out.println("Produto não localizado.");
        }
    }

    @Override
    public String toString() {
        return "Confira seu carrinho: \n" +
                "Frete:" + Carrinho.getFrete() + '\n' +
                "Subtotal:" + getSubtotal() + '\n' +
                "Produtos:" + getCarrinho()
                ;
    }
    public void calcularFrete() {
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
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
