package org.example.extra.carro;

public class CarroTestar {
    public static void main(String[] args) {

        org.example.extra.carro.Carro c1 = new org.example.extra.carro.Carro();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        c1.acelerar(10);
        System.out.println("Iniciando com velocidade em: " + c1.vel + "km/h");

        c1.freiar(30);
        System.out.println("E agora a velocidade é: " + c1.vel + "km/h");
    }
}
