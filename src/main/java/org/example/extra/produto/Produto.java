package org.example.extra.produto;

import java.util.Locale;
import java.util.Scanner;

public class Produto {

    String nome;
    String marca;
    float velor;

    public Produto(){
    }

    public Produto(String nome){
        this.nome = nome;
    }

    public Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    public Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.velor = velor;
    }
}
