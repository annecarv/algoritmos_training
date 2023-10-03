package challenge;

import java.util.ArrayList;

public class Carrinho  {
    public double desconto;
    public static double frete = 15;
    public static double subtotal;
    public static double total;
    static public int quantidade;
    public String cupom;
    public static boolean idExistente = false;
    Produto produto;
    public static ArrayList<Carrinho> carrinho = new ArrayList<Carrinho>();

    public Carrinho(int id, Produto produto) {
        carrinho.add(this);
    }

    public static void adicionarProdutoAoCarrinho(int id, int quantidade)  {

        for (Produto p : Produto.produtos) {
            if (p.getId() == id) {
                setQuantidade(getQuantidade() + quantidade);
                System.out.println("Produto adicionado ao carrinho.");
                Carrinho.setIdExistente(true);
                carrinho.add(Produto.produtos.get(id));
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
                ", subtotal:" + Carrinho.getSubtotal() + '\n' +
                ", total:" + Carrinho.getTotal() + '\n' +
                ", produtos:" + carrinho
                ;
    }

    public static void adicionarCupom() {
    }

    public static void verificarCupom() {
    }

    public static void calcularFrete() {
    }

    public static void calcularValorTotal() { //double, editar depois
    }

    public static void removerDoCarrinho() {

    }

    public static boolean getIdExistente() {
        return idExistente;
    }

    public static void setIdExistente(boolean idExistente) {
        Carrinho.idExistente = idExistente;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public static double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public static double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public static double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Carrinho.quantidade = quantidade;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public static ArrayList<Carrinho> getCarrinho() {
        return carrinho;
    }

    public static void setCarrinho(ArrayList<Carrinho> carrinho) {
        Carrinho.carrinho = carrinho;
    }

}
