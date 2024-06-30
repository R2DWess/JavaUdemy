package org.example.secao08.exercicio.exercicio09;

public class CurrencyConverter {
    public static final double IOF = 0.06; // Criando constante

    public static double calculateAmountInReais(double precoDolar,
                                                double dolarComprado) { // Método que possui dollarPrice e dollarsBought como argumento

        double valorSemIOF = precoDolar * dolarComprado;
        double montateTotal = valorSemIOF * (1 + IOF);
        return montateTotal;
    }
}