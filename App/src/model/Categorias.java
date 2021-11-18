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
public class Categorias {
    private int id_categoria;
    private String tipo_contenido;

    public Categorias(int id_categoria, String tipo_contenido) {
        this.id_categoria = id_categoria;
        this.tipo_contenido = tipo_contenido;
    }
    
    public Categorias(){
        
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getTipo_contenido() {
        return tipo_contenido;
    }

    public void setTipo_contenido(String tipo_contenido) {
        this.tipo_contenido = tipo_contenido;
    }
    
    
}
