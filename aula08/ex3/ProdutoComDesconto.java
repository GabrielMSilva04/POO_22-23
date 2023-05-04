package aula08.ex3;

public class ProdutoComDesconto implements Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private int desconto;

    public ProdutoComDesconto(String nome, double preco, int quantidade, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco * (1 - desconto / 100.0);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }  

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome + ", preco " + preco + ", quantidade " + quantidade + ", desconto " + desconto+"%";
    }
}
