package br.com.alura.calculo;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double resultado = (temperatura * 9 / 5) + 32;
        System.out.println("O valor de " + temperatura + " celsius será de " + resultado + " fahrenheit");
    }

    @Override
    public void farenheitParaCelsius(double temperatura) {
        double resultado = (temperatura - 32) * 5 / 9;
        System.out.println("O valor de " + temperatura + " fahrenheit será de " + resultado + " celsius");
    }
}
