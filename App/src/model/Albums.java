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
public class Albums {

    private int id_album;
    private int id_artista;
    private String nombre;
    private String fecha_estreno;
    private String explicita; //requiere un IF 
    private int num_oyentes;
    private String discografia;

    public Albums(int id_album, int id_artista, String nombre, String fecha_estreno, String explicita, int num_oyentes, String discografia) {
        this.id_album = id_album;
        this.id_artista = id_artista;
        this.nombre = nombre;
        this.fecha_estreno = fecha_estreno;
        this.explicita = explicita;
        this.num_oyentes = num_oyentes;
        this.discografia = discografia;
    }
    
    public Albums(){
        
    }

    public int getId_album() {
        return id_album;
    }

    public void setId_album(int id_album) {
        this.id_album = id_album;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String getExplicita() {
        return explicita;
    }

    public void setExplicita(String explicita) {
        this.explicita = explicita;
    }

    public int getNum_Oyentes() {
        return num_oyentes;
    }

    public void setNum_Oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }
}
