package br.com.alura.calculo;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        int index = 0;
        while(index <= 10){
            int resultado = index * numero;
            System.out.println(numero + " * " + index + " = " + resultado);
            index++;
        }
    }
}
