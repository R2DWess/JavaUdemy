package org.example.secao05.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IdentificadorParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
