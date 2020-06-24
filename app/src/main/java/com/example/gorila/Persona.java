package com.example.gorila;

public class Persona {

    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.edad = 0;
        this.sexo = 'N';
        this.peso = 0.0;
        this.altura = 0;
    }

    public Persona(int edad, char sexo, double peso, int altura) {
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public String ClasificarIMC(){

        double calc_imc = this.peso / (this.altura * this.altura);

        String nivel_imc = "";

        if (calc_imc < 18.5) {
            nivel_imc = "BAJO PESO";
        } else if (calc_imc >= 18.5 && calc_imc <= 25) {
            nivel_imc = "NORMAL";
        } else if (calc_imc > 25 && calc_imc < 30) {
            nivel_imc = "SOBREPESO";
        } else {
            nivel_imc = "OBESIDAD";
        }

        return "Tu IMC es: " + String.format("%.1f", calc_imc) + ", por tanto tu nivel indica " + nivel_imc;

    }


}
