package org.example.secao08.exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AreaTrapezio areaTrapezio = new AreaTrapezio();
        System.out.println("Digite o valor da base maior: ");
        areaTrapezio.baseMaior = sc.nextDouble();

        System.out.println("Digite o valor da base menor: ");
        areaTrapezio.baseMenor = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        areaTrapezio.altura = sc.nextDouble();

        System.out.println();
        System.out.printf("O valor da área do Trapézio é: %.2f%n", areaTrapezio.operacao());

    }
}
