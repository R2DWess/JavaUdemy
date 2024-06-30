package org.example.secao08.exercicio05;

public class AreaQuadrado {

    public double lado;
    public double area;

    public AreaQuadrado(){
        this.lado = 0;
        this.area = 0;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double area(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double operacao(){
        return area = lado * lado;
    }

    public String toString(){
        return String.format("Area [lado=%.2f, area=%.2f]", lado, area);
    }
}
