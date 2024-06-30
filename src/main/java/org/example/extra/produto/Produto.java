package org.example.extra.produto;

import java.util.Locale;
import java.util.Scanner;

public class Produto {

    // Atributos
    String nome;
    String marca;
    float velor;

    // O construtor deve ter o mesmo nome da classe
    public Produto(){
    }

    // Criando Objetos
    public Produto(String nome){
        this.nome = nome; // Usando o 'this' para especificar que o atributo recebe a variável que setamos por parâmetro
    }

    public Produto(String nome, String marca){ // Criando construtor que recebe 2 parâmetros
        this.nome = nome;
        this.marca = marca;
    }

    public Produto(String nome, String marca, float valor){
        this.nome = nome; // Valor recebido por parâmetro
        this.marca = marca; // Valor recebido por parâmetro
        this.velor = velor; // Valor recebido por parâmetro
    }
}
