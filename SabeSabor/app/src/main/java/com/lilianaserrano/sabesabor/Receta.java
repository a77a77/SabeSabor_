package com.lilianaserrano.sabesabor;

/**
 * Created by mp on 21/02/2015.
 */
public class Receta {
    private String nombre;
    private String nombeFoto;
    private String ingrediente_cantidad;
    private String preparacion;
    private String tiempoEstimado;
    private int rating;

    public Receta(String nombre, String ingrediente_cantidad, String preparacion) {
        this.nombre = nombre;
        this.ingrediente_cantidad = ingrediente_cantidad;
        this.preparacion = preparacion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombeFoto() {
        return nombeFoto;
    }

    public void setNombeFoto(String nombeFoto) {
        this.nombeFoto = nombeFoto;
    }

    public String getIngrediente_cantidad() {
        return ingrediente_cantidad;
    }

    public void setIngrediente_cantidad(String ingrediente_cantidad) {
        this.ingrediente_cantidad = ingrediente_cantidad;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
}
