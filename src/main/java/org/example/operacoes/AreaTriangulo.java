package org.example.operacoes;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double b = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double h = sc.nextDouble();
        double area = (b * h) /2;

        System.out.println("A área do triângulo é: " + area);
    }
}
