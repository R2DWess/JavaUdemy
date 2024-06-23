package org.example.operacoes;

import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da diagonal maior: ");
        double D = sc.nextDouble();

        System.out.println("Digite o valor da diagonal menor: ");
        double d = sc.nextDouble();

        double area = (D * d) / 2;

        System.out.println("O valor da área de um Losango é de: " + area);
    }
}
