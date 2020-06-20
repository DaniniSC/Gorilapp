package com.example.gorila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
// Problemática abordada
public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void IrMenu(View view) {
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }
}
