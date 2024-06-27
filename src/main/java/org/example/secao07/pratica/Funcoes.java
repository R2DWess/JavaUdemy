package org.example.secao07.pratica;

import org.example.Main;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um valor:");
        double y = sc.nextDouble();
        double x = Math.sqrt(y);

        System.out.printf("O valor da raiz quadrada é %.2f", x);
    }
}
