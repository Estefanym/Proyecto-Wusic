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
public class Planes {
    private int id_plan;
    private String nombre_plan; //VARCHAR (20)
    private String descripcion_plan; //TipoText
    private String costo_plan; //Tipo Real

    public Planes(int id_plan, String nombre_plan, String descripcion_plan, String costo_plan) {
        this.id_plan = id_plan;
        this.nombre_plan = nombre_plan;
        this.descripcion_plan = descripcion_plan;
        this.costo_plan = costo_plan;
        
    }
    
    public Planes(){
        
    }

    public int getId_plan() {
        return id_plan;
    }

    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }

    public String getNombre_plan() {
        return nombre_plan;
    }

    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public String getDescripcion_plan() {
        return descripcion_plan;
    }

    public void setDescripcion_plan(String descripcion_plan) {
        this.descripcion_plan = descripcion_plan;
    }

    public String getCosto_plan() {
        return costo_plan;
    }

    public void setCosto_plan(String costo_plan) {
        this.costo_plan = costo_plan;
    }

    
}
