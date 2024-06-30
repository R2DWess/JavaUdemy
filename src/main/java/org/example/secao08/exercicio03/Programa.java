package org.example.secao08.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Insira o valor do raio: ");
        Double raio = sc.nextDouble();

        AreaCirculo areaCirculo = new AreaCirculo(raio);

        System.out.println();
        System.out.println("Dados do círculo: " + areaCirculo);
        System.out.printf("Resultado da operação: %.2f%n", areaCirculo.operacao());
        sc.close();
    }
}
