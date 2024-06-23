package org.example.secao04.operacoes;

import java.util.Scanner;

public class AreaHexagonoRegular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do hexágono:");
        double lado = sc.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);

        System.out.println("A área do hexágono é: " + area);
    }
}

