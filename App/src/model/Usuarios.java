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
public class Usuarios {

    private int id_usuario;
    private int id_plan;
    private String nombre;//VARCHAR (50)
    private String email; //VARCHAR (30)
    private String password; //VARCHAR (20)
    private String telefono; //VARCHAR(14)
    private int no_seguidores;
    private String fecha_inicio; //Tipo DATE

    public Usuarios(int id_usuario, int id_plan, String nombre, String email, String password, String telefono, int no_seguidores, String fecha_inicio) {
        this.id_usuario = id_usuario;
        this.id_plan = id_plan;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.no_seguidores = no_seguidores;
        this.fecha_inicio=fecha_inicio;
    }
    
    public Usuarios(){
        
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_plan() {
        return id_plan;
    }

    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNo_seguidores() {
        return no_seguidores;
    }

    public void setNo_seguidores(int no_seguidores) {
        this.no_seguidores = no_seguidores;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    
    
}
