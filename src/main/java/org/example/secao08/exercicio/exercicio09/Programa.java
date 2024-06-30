package org.example.secao08.exercicio.exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Qual é o preço do dólar? ");
        double precoDolar = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double dolarComprado = sc.nextDouble();

        double montatantePago = CurrencyConverter.calculateAmountInReais(precoDolar, dolarComprado);

        System.out.printf("Valor a ser pago em reais = %.2f%n", montatantePago);

        sc.close();
    }
}