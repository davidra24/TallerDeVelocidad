package com.example.david.tallerdevelocidad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Resultado extends AppCompatActivity {

    ListView listaR;
    List<ItemR> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        this.fillList();
    }
    private void fillList(){
        listaR = (ListView) findViewById(R.id.listaBusqueda);
        items = new ArrayList<ItemR>();
        items.add(new ItemR(R.drawable.noimage,"Libertadores","sale 10:00 llega 14:00",R.drawable.stars,"$20000","Más info"));
        items.add(new ItemR(R.drawable.noimage,"Coflonorte","sale 10:30 llega 14:30",R.drawable.stars,"$15000","Más info"));
        items.add(new ItemR(R.drawable.noimage,"Rápido Duitama","sale 10:30 llega 14:30",R.drawable.stars,"$15000","Más info"));
        items.add(new ItemR(R.drawable.noimage,"Libertadores","sale 10:10 llega 14:10",R.drawable.stars,"$15000","Más info"));
        items.add(new ItemR(R.drawable.noimage,"Coflonorte","sale 11:00 llega 15:00",R.drawable.stars,"$20000","Más info"));
        items.add(new ItemR(R.drawable.noimage,"Rápido Duitama","sale 13:00 llega 16:00",R.drawable.stars,"$18000","Más info"));
        listaR.setAdapter(new ItemAdapterR(this, items));
    }
}