package com.example.david.tallerdevelocidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    Spinner origenSpinner;
    Spinner destinoSpinner;
    Spinner empresaSpinner;
    ImageButton paraderosButton;
    ImageButton principalButton;

    EditText editTextFecha;
    EditText editTextHora;
    EditText editTextPasajeros;

    Button buscarBtn;
    Toast t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        init();
    }
    private void init(){

        this.editTextFecha = (EditText) findViewById(R.id.editTextFecha);
        this.editTextHora = (EditText) findViewById(R.id.editTextHora);
        this.editTextPasajeros = (EditText) findViewById(R.id.editTextPasajeros);

        this.origenSpinner = (Spinner) findViewById(R.id.origenSpinner);
        this.destinoSpinner = (Spinner) findViewById(R.id.destinoSpinner);
        this.empresaSpinner = (Spinner) findViewById(R.id.empresaSpinner);
        this.paraderosButton = (ImageButton) findViewById(R.id.paraderosButton);
        this.buscarBtn = (Button) findViewById(R.id.buscarBtn);
        t = Toast.makeText(this, "Rellene los campos vacíos", Toast.LENGTH_SHORT);
        fillSpinners();
        actionButtons();
    }
    private void fillSpinners(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Tunja","Duitama","Sogamoso","Chiquinquirá","Moniquirá","Villa de Leyva"});
        origenSpinner.setAdapter(adapter);
        destinoSpinner.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Libertadores","Gacela","Rápido Duitama"});
        empresaSpinner.setAdapter(adapter);
    }
    private void actionButtons(){
        this.paraderosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Principal.this, Paraderos.class));
            }
        });
        this.buscarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editTextFecha.getText()) || TextUtils.isEmpty(editTextHora.getText()) || TextUtils.isEmpty(editTextPasajeros.getText())){
                    t.show();
                }else{
                    startActivity(new Intent(Principal.this, Resultado.class));
                }
            }
        });

    }
}
