package br.com.alura.calculo;

public class Produto implements Vendavel {
    protected String nome;
    protected double preco;
    protected int quantidadeComprada;

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double precoTotal() {
        double precoFinal = quantidadeComprada < 10 ? preco * quantidadeComprada : (preco * quantidadeComprada) - ((preco * quantidadeComprada)*0.10);
        return precoFinal;
    }
}
