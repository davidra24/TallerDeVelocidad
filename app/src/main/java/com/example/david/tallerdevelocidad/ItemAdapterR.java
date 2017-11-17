package com.example.david.tallerdevelocidad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by davic on 16/11/2017.
 */

public class ItemAdapterR extends BaseAdapter {
    private Context context;
    private List<ItemR> items;
    public ItemAdapterR(Context context, List<ItemR> items){
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
        ImageView imagenResultado = (ImageView) rowView.findViewById(R.id.imagenResultado);
        TextView tituloResultado = (TextView) rowView.findViewById(R.id.tituloResultado);
        TextView descripcionResultado = (TextView) rowView.findViewById(R.id.descripcionResultado);
        ImageView imageStar = (ImageView) rowView.findViewById(R.id.estrellasResultado);
        TextView precioRestultado = (EditText) rowView.findViewById(R.id.preciotext);
        Button infobtn = (Button) rowView.findViewById(R.id.masinfobtn);
        ItemR item = this.items.get(position);
        imagenResultado.setImageResource(item.getImagen());
        tituloResultado.setText(item.getTitulo());
        descripcionResultado.setText(item.getDescripcion());
        imageStar.setImageResource(item.getStars());
        precioRestultado.setText(item.getPrecio());
        infobtn.setText(item.getInfo());
        return rowView;
    }
}