package challenge;

import java.util.ArrayList;

public class Carrinho  {

    private static double frete = 15;
    private double subtotal;
    private int quantidade;
    private boolean idExistente = false;
    private ArrayList<Produto> carrinho = new ArrayList<>(Produto.produtos);
    Produto produto;

    //É OBRIGATORIO UMA CLASSE TER CONSTRUTOR???
    public Carrinho() {
        this.carrinho = new ArrayList<Produto>();
    }
    public void adicionarProdutoAoCarrinho(int id, int quantidade)  {

        for (Produto p : produto.getProdutos()) {
            if (p.getId() == id) {
                setQuantidade(getQuantidade() + quantidade);
                carrinho.add(p);
                System.out.println("Produto adicionado ao carrinho.");
                setIdExistente(true);
                break;
            }
            if (!getIdExistente()) {
                System.out.println("Produto não localizado.");
            }
        }
    }

    @Override
    public String toString() {
        return "Confira seu carrinho: \n" +
                "frete:" + Carrinho.getFrete() + '\n' +
                ", subtotal:" + getSubtotal() + '\n' +
                ", produtos:" + getCarrinho()
                ;
    }
    public void calcularFrete() {
    }
    public void removerDoCarrinho() {

    }
    public boolean getIdExistente() {
        return idExistente;
    }
    public void setIdExistente(boolean idExistente) {
        this.idExistente = idExistente;
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
    public boolean isIdExistente() {
        return idExistente;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

}
