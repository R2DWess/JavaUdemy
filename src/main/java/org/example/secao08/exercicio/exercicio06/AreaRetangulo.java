package org.example.secao08.exercicio.exercicio06;

public class AreaRetangulo {

    public double b;
    public double h;
    public double area;

    public AreaRetangulo(){
        this.b = 0;
        this.h = 0;
        this.area = 0;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double operacao(){
        return area = b * h;
    }

    public String toString(){
        return String.format("Area [b=%.2f, h=%.2f, area=%.2f]", b, h,area);
    }

}
