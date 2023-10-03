package challenge;

import java.util.ArrayList;

public class Produto {

    public String nomeProduto, taxonomia;
    public double precoUnitario;
    public int quantidade;
    // nextId é estático pois será compartilhando entre todas as suas instâncias
    private static int nextId = 1;
    private int id;  // ID da instância atual

    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

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
        return
                 this.nomeProduto  +  " " +
                "Setor: " + this.taxonomia +  " " +
                "R$ " + this.precoUnitario +  " " +
                "ID: " + this.id ;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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


