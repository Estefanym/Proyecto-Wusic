/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lolyc
 */
public class Canciones {
    private int id_cancion;
    private int id_genero;
    private String nombre;
    private String explicita;
    private int duracion_cancion;
    private int num_oyentes;
    private String estatus_legal;
    private String discografia;

    public Canciones(int id_cancion, int id_genero, String nombre, String explicita, int duracion_cancion, int num_oyentes, String estatus_legal, String discografia) {
        this.id_cancion = id_cancion;
        this.id_genero = id_genero;
        this.nombre = nombre;
        this.explicita = explicita;
        this.duracion_cancion = duracion_cancion;
        this.num_oyentes = num_oyentes;
        this.estatus_legal = estatus_legal;
        this.discografia = discografia;
    }
    
    public Canciones(){
        
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExplicita() {
        return explicita;
    }

    public void setExplicita(String explicita) {
        this.explicita = explicita;
    }

    public int getDuracion_cancion() {
        return duracion_cancion;
    }

    public void setDuracion_cancion(int duracion_cancion) {
        this.duracion_cancion = duracion_cancion;
    }

    public int getNum_Oyentes() {
        return num_oyentes;
    }

    public void setNum_Oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
    }

    public String getEstatus_legal() {
        return estatus_legal;
    }

    public void setEstatus_legal(String estatus_legal) {
        this.estatus_legal = estatus_legal;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }
}
