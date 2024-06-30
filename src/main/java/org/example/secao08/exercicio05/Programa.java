package org.example.secao08.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AreaQuadrado areaQuadrado = new AreaQuadrado();
        System.out.println("Digite o valor do lado: ");
        areaQuadrado.lado = sc.nextDouble();

        System.out.println();
        System.out.printf("O valor da area do quadrado é: %.2f%n", areaQuadrado.operacao());

        sc.close();
    }
}
