package org.example.secao04.operacoes;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado: ");
        double l = sc.nextDouble();

        double area = l * l;

        System.out.println("O valor da área de um quadrado é: " + area);
    }
}
