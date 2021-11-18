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
public class Artistas {
    private int id_artista;
    private String nombre_artista;
    private int seguidores_artista;
    private String discografia;
    private String redes_sociales;

    public Artistas(int id_artista, String nombre_artista, int seguidores_artista, String discografia, String redes_sociales) {
        this.id_artista = id_artista;
        this.nombre_artista = nombre_artista;
        this.seguidores_artista = seguidores_artista;
        this.discografia = discografia;
        this.redes_sociales = redes_sociales;
    }
    
    public Artistas(){
        
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getNombre_artista() {
        return nombre_artista;
    }

    public void setNombre_artista(String nombre_artista) {
        this.nombre_artista = nombre_artista;
    }

    public int getSeguidores_artista() {
        return seguidores_artista;
    }

    public void setSeguidores_artista(int seguidores_artista) {
        this.seguidores_artista = seguidores_artista;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public String getRedes_sociales() {
        return redes_sociales;
    }

    public void setRedes_sociales(String redes_sociales) {
        this.redes_sociales = redes_sociales;
    }
}
