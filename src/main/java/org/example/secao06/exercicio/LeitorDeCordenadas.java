package org.example.secao06.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class LeitorDeCordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        while (true) {
            System.out.println("Digite as coordenadas X e Y (ou 0 0 para encerrar):");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }
        sc.close();
    }
}