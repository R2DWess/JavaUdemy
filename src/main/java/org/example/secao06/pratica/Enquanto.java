package org.example.secao06.pratica;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma = soma + x;

            System.out.println("Continue digitando");
            x = sc.nextInt();
        }

        System.out.println("A soma dos valores digitados é: " + soma);

        sc.close();
    }
}
