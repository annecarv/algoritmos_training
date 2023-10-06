package challenge;

import java.util.ArrayList;

public class Produto {

    private String nomeProduto, taxonomia;
    private double precoUnitario;
    private int quantidade;

    private static int nextId = 1;
    private int id;

    private static ArrayList<Produto> produtos = new ArrayList<>();

    public Produto(String nomeProduto, String taxonomia, double precoUnitario) {
        this.id = nextId;
        nextId++;
        this.nomeProduto = nomeProduto;
        this.taxonomia = taxonomia;
        this.precoUnitario = precoUnitario;
        produtos.add(this);
    }

    @Override
    public String toString() {
        return this.nomeProduto  + " " +
                "Setor: " + this.taxonomia + " " +
                "R$ " + this.precoUnitario + " " +
                "ID: " + this.id ;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Produto.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Produto getProdutoById(int id) {
        for (Produto p : produtos) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public void setTaxonomia(String taxonomia) {
        this.taxonomia = taxonomia;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(ArrayList<Produto> produtos) {
        Produto.produtos = produtos;
    }
}
