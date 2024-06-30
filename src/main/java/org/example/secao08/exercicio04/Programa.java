package org.example.secao08.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AreaDoLosango areaDoLosango = new AreaDoLosango();
        System.out.println("Digite o valor da diagonal maior: ");
        areaDoLosango.d = sc.nextDouble();

        System.out.println("Digite o valor da diagonal menor: ");
        areaDoLosango.D = sc.nextDouble();


        System.out.println();
        System.out.printf("O valor da área de um Losango é de: %.2f%n", areaDoLosango.operacao());
        sc.close();
    }
}