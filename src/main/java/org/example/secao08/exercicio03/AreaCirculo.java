package org.example.secao08.exercicio03;

public class AreaCirculo {

    public double raio;
    public static final double PI = 3.1459;
    public double area;

    public AreaCirculo(double raio){
        this.raio = raio;
        this.area = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double operacao(){
        return area = PI * (raio * raio);
    }

    public String toString(){
        return String.format("Raio [raio=%.2f, pi=%.4f, area=%.2f]", raio, PI, area);
    }
}
