package org.example.secao07.pratica;

import java.util.Scanner;

public class OperacoesSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
