package challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                //Pq fica duplicando os produtos???? Dúvida
                Produto produto1 = new Produto("Teste", "Vestuário", 300);
                Produto.getProdutos().add(produto1);

                Produto.getProdutos().add(new Produto("Calça Jeans", "Vestuário", 300));
                Produto.getProdutos().add(new Produto("Blusinha", "Vestuário", 50));
                Produto.getProdutos().add(new Produto("Celular Xaiane", "Eletrônicos", 1999));
                Produto.getProdutos().add(new Produto("Notebook Azer", "Eletrônicos", 2750));
                Produto.getProdutos().add(new Produto("Raspberry", "Eletrônicos", 999));
                Produto.getProdutos().add(new Produto("Quadro Decorativo", "Casa", 39.9));
                Produto.getProdutos().add(new Produto("Prendedor de Roupa", "Casa", 9.99));
                Produto.getProdutos().add(new Produto("Cabide", "Casa", 1.99));
                Produto.getProdutos().add(new Produto("Cerveja", "Bebidas", 5.49));
                Produto.getProdutos().add(new Produto("Vinho", "Bebidas", 79));
                Produto.getProdutos().add(new Produto("Dixit", "Jogos", 179.9));
                Produto.getProdutos().add(new Produto("Coup", "Jogos", 99.90));

                Menu menu = new Menu();


            }
        }
