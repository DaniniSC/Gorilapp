package com.example.gorila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
// IMC
public class MainActivity7 extends AppCompatActivity {
    Persona persona = new Persona();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void CalcularIMC(View view) {
        TextView imc = findViewById(R.id.imc);
        EditText altura = findViewById(R.id.altura);
        EditText peso = findViewById(R.id.peso);

        double calc_peso = Double.parseDouble(peso.getText().toString());
        double calc_altura = Double.parseDouble(altura.getText().toString()) / 100;

        persona.setPeso(calc_peso);
        persona.setAltura(calc_altura);

        String msj = persona.ClasificarIMC();

        imc.setText(msj);
    }

    public void IrMenu(View view) {
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }
}
