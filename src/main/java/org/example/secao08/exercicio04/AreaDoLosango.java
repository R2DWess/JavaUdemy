package org.example.secao08.exercicio04;

public class AreaDoLosango {

    public double d;
    public double D;
    public double area;

    public AreaDoLosango(){
        this.d = 0;
        this.D = 0;
        this.area = 0;
    }

    public double getd(){
        return d;
    }

    public void setd(double d){
        this.d = d;
    }

    public double setArea(){
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double operacao(){
        return area = (D * d) / 2;
    }

    public String toString(){
        return String.format("Area [d=%.2f, D=%.2f, area=%.2f]", d, D, area);
    }
}
