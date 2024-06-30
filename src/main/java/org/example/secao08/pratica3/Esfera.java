package org.example.secao08.pratica3;

public class Esfera {

    private double raio;

    public Esfera() {
    }

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
