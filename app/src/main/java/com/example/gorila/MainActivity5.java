package com.example.gorila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

// Cálculo relacionado
public class MainActivity5 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner opciones;
    double price = 0;
    TextView tv16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Button generar = (Button)findViewById(R.id.btn_dcto);

        opciones = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.opciones, android.R.layout.simple_spinner_item);        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        opciones.setAdapter(adapter);
        opciones.setOnItemSelectedListener(this);
        tv16 = findViewById(R.id.textView16);

    }
    public void IrMenu(View view) {
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }

    public void generar(View view) {
        TextView tv8 = (TextView)findViewById(R.id.textView8);
        EditText codigo = findViewById(R.id.editText);
        EditText dcto = findViewById(R.id.editText2);
        double monto_dcto = Double.parseDouble(dcto.getText().toString());
        String precio_final = String.format("%.2f", price*(1-monto_dcto/100));

        Toast toast = Toast.makeText(this, "Código " + codigo.getText().toString() + " generado con " + dcto.getText().toString() + "% de descuento", Toast.LENGTH_LONG);
        toast.show();

        tv8.setText("Nuevo Precio + IVA: " + precio_final);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();

        if(i == 0){price = 50000;}
        else if(i==1){price = 10000;}
        else if(i==2){price = 100000;}
        else if(i==3){price=1000;}

        tv16.setText("Precio + IVA: " + price);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
