package com.example.gorila;

public class Persona {
    private int edad;
    private char sexo;
    private double peso;
    private int altura;

    public Persona() {
        edad = 0;
        sexo = 'N';
        peso = 0.0;
        altura = 0;
    }

    public Persona(int edad, char sexo, double peso, int altura) {
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


}
