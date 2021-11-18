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
public class Pagos {

    private int id_pago;
    private int id_usuario;
    private double costo;
    private String metodo_pago; //VARCHAR (25)
    private String fecha_facturacion;
    private String detalle_pago;//VARCHAR (40)

    public Pagos(int id_pago, int id_usuario, double costo, String metodo_pago, String fecha_facturacion, String detalle_pago) {
        this.id_pago = id_pago;
        this.id_usuario = id_usuario;
        this.costo = costo;
        this.metodo_pago = metodo_pago;
        this.fecha_facturacion = fecha_facturacion;
        this.detalle_pago = detalle_pago;
    }
    
    public Pagos(){
        
    }
    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getFecha_facturacion() {
        return fecha_facturacion;
    }

    public void setFecha_facturacion(String fecha_facturacion) {
        this.fecha_facturacion = fecha_facturacion;
    }

    public String getDetalle_pago() {
        return detalle_pago;
    }

    public void setDetalle_pago(String detalle_pago) {
        this.detalle_pago = detalle_pago;
    }

}
