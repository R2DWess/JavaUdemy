package org.example.operacoes;

import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da maior Base do trapezio");
        double B = sc.nextDouble();

        System.out.println("Digite o valor da menor Base do trapezio");
        double b = sc.nextDouble();

        System.out.println("Digite o valor da altura do trapezio");
        double h = sc.nextDouble();

        double area;

        area = (B + b) * h /2;

        System.out.println("A area do trapezio é: " + area);

    }
}
