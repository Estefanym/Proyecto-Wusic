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
public class Canciones_artistas {
    private int id_ca;
    private int id_cancion;
    private int id_artista;

    public Canciones_artistas(int id_ca, int id_cancion, int id_artista) {
        this.id_ca = id_ca;
        this.id_cancion = id_cancion;
        this.id_artista = id_artista;
    }

    public Canciones_artistas() {
        
    }

    public int getId_ca() {
        return id_ca;
    }

    public void setId_ca(int id_ca) {
        this.id_ca = id_ca;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

}
