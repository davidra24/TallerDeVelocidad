package com.example.david.tallerdevelocidad;

/**
 * Created by davic on 16/11/2017.
 */

public class ItemR {
    private int imagen;
    private String titulo;
    private String descripcion;
    private int stars;
    private String precio;
    private String info;

    public ItemR(int imagen, String titulo, String descripcion, int stars, String precio, String info){
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.stars = stars;
        this.precio = precio;
        this.info = info;
    }
    public int getImagen(){
        return this.imagen;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getStars(){return this.stars;}
    public String getPrecio(){return this.precio;}
    public String getInfo(){
        return this.info;
    }
}
