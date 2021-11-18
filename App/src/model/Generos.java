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
public class Generos {

    private int id_genero;
    private int no_oyentes;
    private String nombre_genero; //VARCHAR(20)

    public Generos(int id_genero, int no_oyentes, String nombre_genero) {
        this.id_genero = id_genero;
        this.no_oyentes = no_oyentes;
        this.nombre_genero = nombre_genero;
    }
    
    public Generos(){
        
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getNo_oyentes() {
        return no_oyentes;
    }

    public void setNo_oyentes(int no_oyentes) {
        this.no_oyentes = no_oyentes;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

}
