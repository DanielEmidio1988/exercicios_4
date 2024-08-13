import br.com.alura.calculo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();
        double valorMoedaDolar = 3.99;
        double valor = moeda.converterDolarParaReal(valorMoedaDolar);
        System.out.println("Valor do dolar de  U$ " + valorMoedaDolar + " convertido em reais será para R$ " + valor);

        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        double areaSalaRetangular = calculadoraSalaRetangular.calcularArea(2.5, 5);
        double perimetroSalaRetangular = calculadoraSalaRetangular.calcularPerimetro(3.9, 7.8);
        System.out.println("Á area da sala retangular é de " + areaSalaRetangular);
        System.out.println("O perimetro da sala retangular é de " + perimetroSalaRetangular);

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(2);

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();
        conversorTemperaturaPadrao.celsiusParaFahrenheit(17);
        conversorTemperaturaPadrao.farenheitParaCelsius(12.5);


        System.out.println("");
        System.out.println("");
        Livro livro = new Livro();
        livro.setNome("Harry Potter e a Ordem da Fenix");
        livro.setPreco(50.99);
        double valorFinalLivro = livro.calcularPrecoFinal();
        System.out.println("Produto Final: " + livro.getNome());
        System.out.println("Preço: R$ " + livro.getPreco());
        System.out.println("Preço Final: R$" + valorFinalLivro);


        System.out.println("");
        System.out.println("");
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setNome("Notebook");
        produtoFisico.setPreco(2500.99);
        produtoFisico.setQuantidadeComprada(15);
        double precoFinalProdutoFisico = produtoFisico.calcularPrecoFinal();
        double precoTotal = produtoFisico.precoTotal();
        System.out.println("Produto Final: " + produtoFisico.getNome());
        System.out.println("Preço: R$ " + produtoFisico.getPreco());
        System.out.println("Preço Final: R$" + precoFinalProdutoFisico);
        System.out.println("Preço Total: R$" + precoTotal);

        System.out.println("");
        System.out.println("");
        Servico servico = new Servico();
        servico.setServico("Manutenção de maquinas");
        servico.setPreco(1500);
        double precoFinalServico = servico.precoTotal();
        System.out.println("Servico " + servico.getServico());
        System.out.println("Valor: R$ " + servico.getPreco());
        System.out.println("Preço Total: R$ " + precoFinalServico);


    }
}