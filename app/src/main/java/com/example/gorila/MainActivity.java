package com.example.gorila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrDescripcion(View view) {
        Intent obj_intent = new Intent(this, MainActivity2.class);
        startActivity(obj_intent);
    }

    public void IrPreview(View view) {
        Intent obj_intent = new Intent(this, MainActivity3.class);
        startActivity(obj_intent);
    }

    public void IrDiagrama(View view) {
        Intent obj_intent = new Intent(this, MainActivity4.class);
        startActivity(obj_intent);
    }

    public void IrCalculo(View view) {
        Intent obj_intent = new Intent(this, MainActivity5.class);
        startActivity(obj_intent);
    }

    public void IrProblematica(View view) {
        Intent obj_intent = new Intent(this, MainActivity6.class);
        startActivity(obj_intent);
    }

    public void IrIMC(View view) {
        Intent obj_intent = new Intent(this, MainActivity7.class);
        startActivity(obj_intent);
    }
}
