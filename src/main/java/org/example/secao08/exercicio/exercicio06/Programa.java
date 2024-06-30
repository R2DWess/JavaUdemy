package org.example.secao08.exercicio.exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AreaRetangulo areaRetangulo = new AreaRetangulo();
        System.out.println("Digite o valor da base: ");
        areaRetangulo.b = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        areaRetangulo.h = sc.nextDouble();

        System.out.println();
        System.out.printf("O valor da área do Retangulo é: %.2f%n", areaRetangulo.operacao());
    }
}
