package com.example.david.tallerdevelocidad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by davic on 16/11/2017.
 */

public class ItemAdapterP extends BaseAdapter {
    private Context context;
    private List<ItemP> items;
    public ItemAdapterP(Context context, List<ItemP> items){
        this.context = context;
        this.items = items;
    }
    @Override
    public int getCount(){
        return this.items.size();
    }
    @Override
    public Object getItem(int position){
        return this.items.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        if(convertView == null){
            //Se crea vista nueva
            //"Infla" el espacio con el contenido que tengamos
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //Se infla la lista
            rowView = layoutInflater.inflate(R.layout.activity_item_paraderos, parent, false);
        }
        //Ingresamos info en la vista
        ImageView imagenPelicula = (ImageView) rowView.findViewById(R.id.imagen);
        TextView tituloPelicula = (TextView) rowView.findViewById(R.id.titulo);
        TextView descripcionPelicula = (TextView) rowView.findViewById(R.id.descripcion);
        Button infobtn = (Button) rowView.findViewById(R.id.infobtn);
        ItemP item = this.items.get(position);
        imagenPelicula.setImageResource(item.getImagen());
        tituloPelicula.setText(item.getTitulo());
        descripcionPelicula.setText(item.getDescripcion());
        infobtn.setText(item.getInfo());
        return rowView;
    }
}
