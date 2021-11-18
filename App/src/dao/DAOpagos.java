/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pagos;
import idao.IftPagos;

/**
 *
 * @author lolyc
 */
public class DAOpagos {
    private static final String SQL_UPDATE = "UPDATE pagos SET id_usuario=?,costo=?,metodo_pago=?,fecha_facturacion=?, detalle_pago=? WHERE id_pago=?";
    private static final String SQL_INSERT = "INSERT INTO pagos (id_usuario,costo,metodo_pago,fecha_facturacion,detalle_pago) VALUES(?, ?,? , ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM pagos";
    private static final String SQL_DELETE = "DELETE FROM pagos WHERE id_pago=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Pagos> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Pagos pago=null;
        ArrayList<Pagos> pagos = new ArrayList<Pagos>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_pago = res.getInt("id_pago");
                int id_usuario = res.getInt("id_usuario");
                double costo = res.getDouble("costo");
                String metodo_pago = res.getString("metodo_pago");
                String fecha_facturacion = res.getString("fecha_facturacion");
                String detalle_pago = res.getString("detalle_pago");
                
                pago = new Pagos();
                pago.setId_pago(id_pago);
                pago.setId_usuario(id_usuario);
                pago.setCosto(costo);
                pago.setMetodo_pago(metodo_pago);
                pago.setFecha_facturacion(fecha_facturacion);
                pago.setDetalle_pago(detalle_pago);
                
                pagos.add(pago);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return pagos;
    }
    
    //INSERT
    public int insert(Pagos pago) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, pago.getId_usuario());
            stmt.setDouble(2, pago.getCosto());
            stmt.setString(3, pago.getMetodo_pago());
            stmt.setString(4, pago.getFecha_facturacion());
            stmt.setString(5, pago.getDetalle_pago());
            
            rows = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    
    //UPDATE
    public int update(Pagos pago)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setInt(1, pago.getId_usuario());
            stmt.setDouble(2, pago.getCosto());
            stmt.setString(3, pago.getMetodo_pago());
            stmt.setString(4, pago.getFecha_facturacion());
            stmt.setString(5, pago.getDetalle_pago());
            stmt.setInt(6,pago.getId_pago());
            rows = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    //DELETE
    public int delete(Pagos pago)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, pago.getId_pago());
            
            rows = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
