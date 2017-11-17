package com.example.david.tallerdevelocidad;
/**
 * Created by david on 16/11/2017.
 */
public class ItemP {
    private int imagen;
    private String titulo;
    private String descripcion;
    private String info;
    public ItemP(int imagen, String titulo, String descripcion, String info){
        this.imagen = imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
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
    public String getInfo(){
        return this.info;
    }
}