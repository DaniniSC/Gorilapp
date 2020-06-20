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
        startActivity(new Intent(this, MainActivity2.class));
    }

    public void IrPreview(View view) {
        startActivity(new Intent(this, MainActivity3.class));
//        Intent obj_intent = new Intent(this, MainActivity3.class);
//        startActivity(obj_intent);
    }

    public void IrDiagrama(View view) {
        startActivity(new Intent(this, MainActivity4.class));
    }

    public void IrCalculo(View view) {
        startActivity(new Intent(this, MainActivity5.class));
    }

    public void IrProblematica(View view) {
        startActivity(new Intent(this, MainActivity6.class));
    }

    public void IrIMC(View view) {
        startActivity(new Intent(this, MainActivity7.class));
    }
}
