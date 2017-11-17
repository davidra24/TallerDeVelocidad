package com.example.david.tallerdevelocidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Paraderos extends AppCompatActivity {

    ImageButton principalButton;
    ListView lista;
    Spinner ciudadSpinner;
    List<ItemP> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paraderos);
        init();
    }
    private void init(){
        this.ciudadSpinner = (Spinner) findViewById(R.id.ciudadesSpinner);
        this.principalButton = (ImageButton) findViewById(R.id.principalButton1);
        fillSpinners();
        fillList();
        actionButtons();
    }
    private void fillList(){
        lista = (ListView) findViewById(R.id.listaParaderos);
        items = new ArrayList<ItemP>();
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        items.add(new ItemP(R.drawable.ruta,"Terminal de transporte","Cra 12 #34-55","Más info"));
        lista.setAdapter(new ItemAdapterP(this, items));
    }
    private void fillSpinners(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Tunja","Duitama","Sogamoso","Chiquinquirá","Moniquirá","Villa de Leyva"});
        ciudadSpinner.setAdapter(adapter);
    }
    private void actionButtons(){
        this.principalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Paraderos.this, Principal.class));
            }
        });
    }
}
