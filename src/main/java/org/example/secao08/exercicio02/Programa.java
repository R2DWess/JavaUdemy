package org.example.secao08.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Aluno aluno = new Aluno();
        System.out.println("Insira os dados do aluno:");
        System.out.println("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.println("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("NOTA FINAL = %.2f%n", aluno.notaFinal());
        if (aluno.isAprovado()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.pontosParaAprovacao());
        }
    }

}
