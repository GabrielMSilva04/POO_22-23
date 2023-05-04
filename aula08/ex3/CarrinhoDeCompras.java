package aula08.ex3;

public class CarrinhoDeCompras {
    private Produto[] produtos;

    public CarrinhoDeCompras() {
        produtos = new Produto[10];
    }

    public void adicionarProduto(Produto p1, int i) {
        produtos[i] = p1;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            if (produto!=null) {
                System.out.println(produto);
            }
        }
    }

    public Object calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            if (produto!=null) {
                total += produto.getPreco()*produto.getQuantidade();
            }
        }
        return total;
    }

    
}
