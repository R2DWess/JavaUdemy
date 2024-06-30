package org.example.secao08.exercicio.exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AreaParalelogramo areaParalelogramo = new AreaParalelogramo();
        System.out.println("Digite o valor da base: ");
        areaParalelogramo.b = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        areaParalelogramo.h = sc.nextDouble();


        System.out.println();
        System.out.printf("O valor da área do trapézio é: %.2f%n", areaParalelogramo.operacao());
    }
}
