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
public class Canciones_playlists {

    private int id_cp;
    private int id_playlist;
    private int id_cancion;

    public Canciones_playlists(int id_cp, int id_playlist, int id_cancion) {
        this.id_cp = id_cp;
        this.id_playlist = id_playlist;
        this.id_cancion = id_cancion;
    }

    public Canciones_playlists() {
        
    }

    public int getId_cp() {
        return id_cp;
    }

    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }

    public int getId_playlist() {
        return id_playlist;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

}
