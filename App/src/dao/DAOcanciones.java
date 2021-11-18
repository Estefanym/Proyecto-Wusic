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
import model.Canciones;
import idao.ItfCanciones;

/**
 *
 * @author lolyc
 */
public class DAOcanciones {
    private static final String SQL_UPDATE = "UPDATE canciones SET id_genero=?,nombre=?,explicita=?,duracion_cancion=?, num_oyentes=?, estatus_legal=?, discografia=? WHERE id_cancion=?";
    private static final String SQL_INSERT = "INSERT INTO canciones (id_genero,nombre,explicita,duracion_cancion, num_oyentes, estatus_legal, discografia) VALUES(?, ?,? , ?, ?,?,?)";
    private static final String SQL_SELECT = "SELECT * FROM canciones";
    private static final String SQL_DELETE = "DELETE FROM canciones WHERE id_canciones=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Canciones> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Canciones cancion=null;
        ArrayList<Canciones> canciones = new ArrayList<Canciones>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_cancion = res.getInt("id_cancion");
                int id_genero = res.getInt("id_genero");
                String nombre = res.getString("nombre");
                String explicita = res.getString("explicita");
                int duracion_cancion = res.getInt("duracion_cancion");
                int num_oyentes = res.getInt("num_oyentes");
                String estatus_legal = res.getString("estatus_legal");
                String discografia = res.getString("discografia");
                
                cancion = new Canciones();
                cancion.setId_cancion(id_cancion);
                cancion.setId_genero(id_genero);
                cancion.setNombre(nombre);
                cancion.setDuracion_cancion(duracion_cancion);
                cancion.setExplicita(explicita);
                cancion.setNum_Oyentes(num_oyentes);
                cancion.setDiscografia(discografia);
                
                canciones.add(cancion);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return canciones;
    }
    
    //INSERT
    public int insert(Canciones cancion) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, cancion.getId_cancion());
            stmt.setInt(2, cancion.getId_genero());
            stmt.setString(3, cancion.getNombre());
            stmt.setString(4, cancion.getExplicita());
            stmt.setInt(5, cancion.getDuracion_cancion());
            stmt.setInt(6, cancion.getNum_Oyentes());
            stmt.setString(7, cancion.getEstatus_legal());
            stmt.setString(8, cancion.getDiscografia());
            
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
    public int update(Canciones cancion)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
             stmt.setInt(1, cancion.getId_cancion());
            stmt.setInt(2, cancion.getId_genero());
            stmt.setString(3, cancion.getNombre());
            stmt.setString(4, cancion.getExplicita());
            stmt.setInt(5, cancion.getDuracion_cancion());
            stmt.setInt(6, cancion.getNum_Oyentes());
            stmt.setString(7, cancion.getEstatus_legal());
            stmt.setString(8, cancion.getDiscografia());
            
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
    public int delete(Canciones cancion)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cancion.getId_cancion());
            
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

