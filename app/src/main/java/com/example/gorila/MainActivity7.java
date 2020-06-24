package com.example.gorila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
// IMC
public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void CalcularIMC(View view) {
        TextView imc = (TextView)findViewById(R.id.imc);
        EditText altura = findViewById(R.id.altura);
        EditText peso = findViewById(R.id.peso);

        double calc_peso = Double.parseDouble(peso.getText().toString());
        double calc_altura = Double.parseDouble(altura.getText().toString()) / 100;

        double calc_imc = calc_peso / (calc_altura * calc_altura);

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

        imc.setText("Tu IMC es: " + calc_imc + ", por tanto tu nivel indica " + nivel_imc);
    }

    public void IrMenu(View view) {
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }
}
