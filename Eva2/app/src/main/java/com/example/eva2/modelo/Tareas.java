package com.example.eva2.modelo;

public class Tarea {
    private String nombre;
    private int hora;
    private String descripcion;
    private boolean estado;
    public static final boolean PENDIENTE=true;

    public static final Tarea[] tareas = {
            new Tarea("Hacer la cama", "11:00", "hacer la cama antes de las 11:00")
            new Tarea("Tocar guitarra", "15:00", "Aprender nuevos acordes")
            new Tarea("Hacer la cena", "20:00", "Hacer tacos")
    };


    public Tarea(String nombre, int hora, String descripcion) {
        this.nombre = nombre;
        this.hora = hora;
        this.descripcion = descripcion;
        this.estado=PENDIENTE;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String hecho;
        if (estado==PENDIENTE) hecho="pendiente";
        else hecho="hecho";
        return  nombre;
    }
}

    public Tarea(String hacer_la_cama, String s, String descripcion) {
    }

    public int get() {
    }

    public int getNombre() {
    }

    public int getHora() {
    }

    public boolean isEstado() {
    }

    public void setEstado(boolean b) {
    }
