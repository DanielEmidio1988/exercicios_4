package br.com.alura.calculo;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorDolar = 5.50;


    @Override
    public double converterDolarParaReal(double valor) {
        return valor * valorDolar;
    }
}
