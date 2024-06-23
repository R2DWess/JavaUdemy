package org.example.secao04.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ValorPeca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o código da primeira peça: ");
        int codigoPecaUm = sc.nextInt();
        System.out.println("Digite o número da primeira peça: ");
        int numeroPecaUm = sc.nextInt();
        System.out.println("Digite o valor da primeira peça");
        double valorPecaUm = sc.nextDouble();

        System.out.println("Digite o código da segunda peça: ");
        int codigoPecaDois = sc.nextInt();
        System.out.println("Digite o número da segunda peça: ");
        int numeroPecaDois = sc.nextInt();
        System.out.println("Digite o valor da segunda peça");
        double valorPecaDois = sc.nextDouble();

        double pagar = valorPecaUm + valorPecaDois;

        double valorTotalPecaUm = numeroPecaUm * valorPecaUm;
        double valorTotalPecaDois = numeroPecaDois * valorPecaDois;
        double valorTotal = valorTotalPecaUm + valorTotalPecaDois;

        System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
