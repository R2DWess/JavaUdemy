package org.example.secao08.exercicio.exercicio07;

public class AreaTrapezio {

    public double baseMaior;
    public double baseMenor;

    public double altura;
    public double area;

    public void AreaRetangulo(){
        this.altura = 0;
        this.area = 0;
        this.baseMaior =0;
        this.baseMenor = 0;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double operacao(){
        return area = (baseMaior + baseMenor) * altura / 2;
    }

    public String toString(){
        return String.format("Area [baseMaior=%.2f, baseMenor=%.2f, altura=%.2f, area=%.2f]",
                baseMaior,
                baseMenor,
                altura,
                area);
    }
}
