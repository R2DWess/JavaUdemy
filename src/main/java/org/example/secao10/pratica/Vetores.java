package org.example.secao10.pratica;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect [i];
        }

        double avg = sum /n;

        System.out.println("AVERAGE HEIGHT: %.2n%n" + avg);

        sc.close();
    }
}
