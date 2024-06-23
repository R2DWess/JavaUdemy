package org.example.exercicios;

import java.util.Scanner;

public class SomaComum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Substração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        int alternativa = sc.nextInt();

        switch (alternativa) {
            case 1:
                System.out.println("VOCÊ ESCOLHEU SOMA");
                System.out.println("------------------");

                double soma = primeiroValor + segundoValor;

                System.out.println("A soma dos dois valores digitados é: " + soma);
                break;
             case 2:
                System.out.println("VOCÊ ESCOLHEU SUBTRAÇÃO");
                System.out.println("------------------");

                double subtracao = primeiroValor - segundoValor;
                System.out.println("A soma dos dois valores digitados é: " + subtracao);
                break;
            case 3:
                System.out.println("VOCÊ ESCOLHEU DIVISÃO");

                double divisao = primeiroValor / segundoValor;
                System.out.println("A soma dos dois valores digitados é: " + divisao);
                break;
            case 4:
                System.out.println("VOCÊ ESCOLHEU MULTIPLICAÇÃO");

                double multiplicacao = primeiroValor * segundoValor;
                System.out.println("A soma dos dois valores digitados é: " + multiplicacao);
                break;

            default:
                System.out.println("O valor digitado não corresponde a uma opção");
        }
    }
}
