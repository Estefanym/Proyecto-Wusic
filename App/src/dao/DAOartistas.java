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
import model.Artistas;
import idao.ItfArtistas;


/**
 *
 * @author lolyc
 */
public class DAOartistas {
    private static final String SQL_UPDATE = "UPDATE artistas SET nombre_artista=?,seguidores_artista=?,discografia=?, redes_sociales=? WHERE id_artista=?";
    private static final String SQL_INSERT = "INSERT INTO artistas (nombre_artista,seguidores_artista,discografia,redes_sociales) VALUES(?, ?,? , ?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM artistas";
    private static final String SQL_DELETE = "DELETE FROM artistas WHERE id_artistas=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Artistas> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Artistas artista=null;
        ArrayList<Artistas> artistas = new ArrayList<Artistas>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_artista = res.getInt("id_artista");
                String nombre_artista = res.getString("nombre_artista");
                int seguidores_artista = res.getInt("seguidores_artista");
                String discografia = res.getString("discografia");
                String redes_sociales = res.getString("redes_sociales");
                
                artista = new Artistas();
                artista.setId_artista(id_artista);
                artista.setNombre_artista(nombre_artista);
                artista.setSeguidores_artista(seguidores_artista);
                artista.setDiscografia(discografia);
                artista.setRedes_sociales(redes_sociales);
                
                artistas.add(artista);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return artistas;
    }
    
    //INSERT
    public int insert(Artistas artista) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
                
            stmt.setString(1, artista.getNombre_artista());
            stmt.setInt(2, artista.getSeguidores_artista());
            stmt.setString(3, artista.getDiscografia());
            stmt.setString(4, artista.getRedes_sociales());
            
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
    public int update(Artistas artista)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            
            stmt.setString(1, artista.getNombre_artista());
            stmt.setInt(2, artista.getSeguidores_artista());
            stmt.setString(3, artista.getDiscografia());
            stmt.setString(4, artista.getRedes_sociales());
            stmt.setInt(5, artista.getId_artista());
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
    public int delete(Artistas artista)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, artista.getId_artista());
            
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
