package org.example.secao08.pratica.pratica3;

public class Calculator {

    public static final double PI = 3.14159;

    public static double circunferencia(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume (double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
