package org.example.secao05.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IdentificarImpostoDeRenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor do salário:");
        double salario = sc.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
        }

        System.out.printf("O valor do imposto a ser pago é: R$ %.2f%n", imposto);

        sc.close();
    }
}
