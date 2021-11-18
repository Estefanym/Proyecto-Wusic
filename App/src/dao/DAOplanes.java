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
import model.Planes;
import idao.ItfPlanes;

/**
 *
 * @author lolyc
 */
public class DAOplanes {
    private static final String SQL_UPDATE = "UPDATE planes SET nombre_plan=?,descripcion_plan=?,costo_plan=?,fecha_inicio=? WHERE id_plan=?";
    private static final String SQL_INSERT = "INSERT INTO planes (nombre_plan,descripcion_plan,costo_plan,fecha_inicio) VALUES(?, ?,?)";
    private static final String SQL_SELECT = "SELECT * FROM planes";
    private static final String SQL_DELETE = "DELETE FROM planes WHERE id_plan=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Planes> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Planes plan=null;
        ArrayList<Planes> planes = new ArrayList<Planes>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_plan = res.getInt("id_plan");
                String nombre_plan = res.getString("nombre_plan");
                String descripcion_plan = res.getString("descripcion_plan");
                String costo_plan = res.getString("costo_plan");
                
                plan = new Planes();
                plan.setId_plan(id_plan);
                plan.setNombre_plan(nombre_plan);
                plan.setDescripcion_plan(descripcion_plan);
                plan.setCosto_plan(costo_plan);
                
                planes.add(plan);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return planes;
    }
    
    //INSERT
    public int insert(Planes plan) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, plan.getNombre_plan());
            stmt.setString(2, plan.getDescripcion_plan());
            stmt.setString(3, plan.getCosto_plan());
            
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
    public int update(Planes plan)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, plan.getNombre_plan());
            stmt.setString(2, plan.getDescripcion_plan());
            stmt.setString(3, plan.getCosto_plan());
            stmt.setInt(4, plan.getId_plan());
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
    public int delete(Planes plan)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, plan.getId_plan());
            
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