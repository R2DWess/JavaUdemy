package org.example.secao07.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class IdentificadorMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero:");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        int segundoNumero = sc.nextInt();

        System.out.println("Digite o terceiro numero:");
        int terceiroNumero = sc.nextInt();

        int higher = max(primeiroNumero, segundoNumero, terceiroNumero);

        showResult(higher);

        sc.close();
    }

        public static int max ( int x, int y, int z){
            int aux;
            if (x > y && x > z) {
                aux = x;
            } else if (x > y) {
                aux = y;
            } else {
                aux = z;
            }
            return aux;
        }

        public static void showResult ( int value){
            System.out.println("Higher = " + value);
        }
    }
