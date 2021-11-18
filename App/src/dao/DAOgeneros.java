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
import model.Generos;
import idao.ItfGeneros;
/**
 *
 * @author lolyc
 */
public class DAOgeneros {
    private static final String SQL_UPDATE = "UPDATE generos SET no_oyentes=?nombre_genero=? WHERE id_genero=?";
    private static final String SQL_INSERT = "INSERT INTO generos (no_oyentes,nombre_genero) VALUES(?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM generos";
    private static final String SQL_DELETE = "DELETE FROM generos WHERE id_genero=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Generos> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Generos genero=null;
        ArrayList<Generos> generos = new ArrayList<Generos>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_genero = res.getInt("id_genero");
                int no_oyentes = res.getInt("no_oyentes");
                String nombre_genero = res.getString("nombre_genero");
                
                genero = new Generos();
                genero.setId_genero(id_genero);
                genero.setNo_oyentes(no_oyentes);
                genero.setNombre_genero(nombre_genero);
                
                generos.add(genero);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return generos;
    }
    
    //INSERT
    public int insert(Generos genero) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, genero.getNo_oyentes());
            stmt.setString(2, genero.getNombre_genero());
            
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
    public int update(Generos genero)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setInt(1, genero.getNo_oyentes());
            stmt.setString(2, genero.getNombre_genero());
            stmt.setInt(3, genero.getId_genero());
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
    public int delete(Generos genero)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, genero.getId_genero());
            
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

