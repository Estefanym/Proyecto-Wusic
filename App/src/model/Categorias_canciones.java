/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class Categorias_canciones {

    private int id_cc;
    private int id_categoria;
    private int id_cancion;

    public Categorias_canciones(int id_cc, int id_categoria, int id_cancion) {
        this.id_cc = id_cc;
        this.id_categoria = id_categoria;
        this.id_cancion = id_cancion;
    }

    public Categorias_canciones() {
       
    }

    public int getId_cc() {
        return id_cc;
    }

    public void setId_cc(int id_cc) {
        this.id_cc = id_cc;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

}
