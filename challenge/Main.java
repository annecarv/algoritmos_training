package challenge;

public class Main {
        public static void main(String[] args) {
                Produto produto;
                Produto.produtos.add(new Produto("Calça Jeans", "Vestuário", 300));
                Produto.produtos.add(new Produto("Blusinha", "Vestuário", 50));
                Produto.produtos.add(new Produto("Notebook Azer", "Eletrônicos", 2750));
                Produto.produtos.add(new Produto("Celular Xaiane", "Eletrônicos", 1999));
                Produto.produtos.add(new Produto("Raspberry", "Eletrônicos", 999));
                Produto.produtos.add(new Produto("Quadro Decorativo", "Casa", 39.9));
                Produto.produtos.add(new Produto("Prendedor de Roupa", "Casa", 9.99));
                Produto.produtos.add(new Produto("Cabide", "Casa", 1.99));
                Produto.produtos.add(new Produto( "Cerveja", "Bebidas", 5.49));
                Produto.produtos.add(new Produto( "Vinho", "Bebidas", 79));
                Produto.produtos.add(new Produto( "Dixit", "Jogos", 179.9));
                Produto.produtos.add(new Produto( "Coup", "Jogos", 99.90));

                Menu menu = new Menu();
            }
        }
