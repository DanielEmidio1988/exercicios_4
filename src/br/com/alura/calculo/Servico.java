package br.com.alura.calculo;

public class Servico implements Vendavel{
    private String servico;
    private double preco;
    private double taxaServico = 0.10;

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public double precoTotal() {
        double precoFinal = preco > 1000 ? preco : preco + (preco * taxaServico);
        return precoFinal;
    }
}
