/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import idao.ItfAlbums;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Albums;

/**
 *
 * @author lolyc
 */
public class DAOalbums {
    private static final String SQL_UPDATE = "UPDATE albums SET id_artista=?,nombre=?,fecha_estreno=?,explicita=?, num_oyentes=?, discografia=? WHERE id_album=?";
    private static final String SQL_INSERT = "INSERT INTO albums (id_artista,nombre,fecha_estreno,explicita,num_oyentes,discografia) VALUES(?, ?,? , ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM albums";
    private static final String SQL_DELETE = "DELETE FROM albums WHERE id_album=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Albums> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Albums album=null;
        ArrayList<Albums> albums = new ArrayList<Albums>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_album = res.getInt("id_album");
                int id_artista = res.getInt("id_artista");
                String nombre = res.getString("nombre");
                String fecha_estreno = res.getString("fecha_estreno");
                String explicita = res.getString("explicita");
                int num_oyentes = res.getInt("num_oyentes");
                String discografia = res.getString("discografia");
                
                album = new Albums();
                album.setId_album(id_album);
                album.setId_artista(id_artista);
                album.setNombre(nombre);
                album.setFecha_estreno(fecha_estreno);
                album.setExplicita(explicita);
                album.setNum_Oyentes(num_oyentes);
                album.setDiscografia(discografia);
                
                albums.add(album);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return albums;
    }
    
    //INSERT
    public int insert(Albums album) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, album.getId_artista());
            stmt.setString(2, album.getNombre());
            stmt.setString(3, album.getFecha_estreno());
            stmt.setString(4, album.getExplicita());
            stmt.setInt(5, album.getNum_Oyentes());
            stmt.setString(6, album.getDiscografia());
            
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
    public int update(Albums album)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setInt(1, album.getId_artista());
            stmt.setString(2, album.getNombre());
            stmt.setString(3, album.getFecha_estreno());
            stmt.setString(4, album.getExplicita());
            stmt.setInt(5, album.getNum_Oyentes());
            stmt.setString(6, album.getDiscografia());
            stmt.setInt(7, album.getId_album());
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
    public int delete(Albums album)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, album.getId_album());
            
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
