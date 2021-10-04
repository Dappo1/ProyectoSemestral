package com.example.proyectosemestral;

public class PersonajeVO {
   private String Nombre, descripcion, representante;
   private int foto;

    public PersonajeVO(String nombre, String descripcion, String representante, int foto) {
        Nombre = nombre;
        this.descripcion = descripcion;
        this.representante = representante;
        this.foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
