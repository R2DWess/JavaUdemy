package org.example.secao05.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IdentificadorDePositividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número:");
        int valorInteiro = sc.nextInt();

        if (valorInteiro >= 0){
            System.out.println("POSITIVO");
        } else {
            System.out.printf("NEGATIVO");
        }
    }
}
