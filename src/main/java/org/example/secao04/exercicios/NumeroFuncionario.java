package org.example.secao04.exercicios;

import java.util.Scanner;

public class NumeroFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o valor da hora de trabalho:");
        double valorHora = sc.nextDouble();

        System.out.println("Digite o número de horas trabalhdas:");
        int horasTrabalhadas = sc.nextInt();
        double salario;

        salario = valorHora * horasTrabalhadas;

        System.out.println("O número do funcionário é: " + numeroFuncionario);
        System.out.println("O valor do sálario do funcionário, de acordo com seu número" +
                "de horas trabalhadas é de: U$  " + salario);
    }
}
