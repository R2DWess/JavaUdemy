package org.example.operacoes;

import java.util.Scanner;

public class AreaParalelogramo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double b = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double h = sc.nextDouble();

        double area = b * h;

        System.out.println("O valor da área do Paralelogramo é: " + area);
    }
}
