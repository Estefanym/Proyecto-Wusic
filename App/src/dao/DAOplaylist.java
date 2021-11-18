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
import model.Playlists;

/**
 *
 * @author lolyc
 */
public class DAOplaylist {
    private static final String SQL_UPDATE = "UPDATE playlists SET id_usuario=?,nombre_playlist=?,estatus=?,WHERE id_playlist=?";
    private static final String SQL_INSERT = "INSERT INTO playlists (id_usuario,nombre_playlist,estatus) VALUES(?, ?,?)";
    private static final String SQL_SELECT = "SELECT * FROM playlists";
    private static final String SQL_DELETE = "DELETE FROM playlists WHERE id_playlist=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Playlists> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Playlists playlist=null;
        ArrayList<Playlists> playlists = new ArrayList<Playlists>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_playlist = res.getInt("id_playlist");
                int id_usuario = res.getInt("id_usuario");
                String nombre_playlist = res.getString("nombre_playlist");
                String estatus = res.getString("estatus");
                
                playlist = new Playlists();
                playlist.setId_usuario(id_usuario);
                playlist.setNombre_playlist(nombre_playlist);
                playlist.setEstatus(estatus);
                
                playlists.add(playlist);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return playlists;
    }
    
    //INSERT
    public int insert(Playlists playlist) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, playlist.getId_usuario());
            stmt.setString(2, playlist.getNombre_playlist());
            stmt.setString(3, playlist.getEstatus());
            
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
    public int update(Playlists playlist)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setInt(1, playlist.getId_usuario());
            stmt.setString(2, playlist.getNombre_playlist());
            stmt.setString(3, playlist.getEstatus());
            stmt.setInt(4, playlist.getId_playlist());
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
    public int delete(Playlists playlist)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, playlist.getId_playlist());
            
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