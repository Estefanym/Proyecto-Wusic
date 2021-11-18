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
public class Playlists {

    private int id_playlist;
    private int id_usuario;
    private String nombre_playlist;//VARCHAR(30)
    private String estatus; //VARCHAR(7) Requiere: Check(OFFLINE - ONLINE)

    public Playlists(int id_playlist, int id_usuario, String nombre_playlist, String estatus) {
        this.id_playlist = id_playlist;
        this.id_usuario = id_usuario;
        this.nombre_playlist = nombre_playlist;
        this.estatus = estatus;
    }
    
    public Playlists(){
        
    }

    public int getId_playlist() {
        return id_playlist;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_playlist() {
        return nombre_playlist;
    }

    public void setNombre_playlist(String nombre_playlist) {
        this.nombre_playlist = nombre_playlist;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    
}
