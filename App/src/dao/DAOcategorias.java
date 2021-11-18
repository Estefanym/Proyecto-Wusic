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
import model.Categorias;
import idao.ItfCategorias;

/**
 *
 * @author lolyc
 */
public class DAOcategorias {
    private static final String SQL_UPDATE = "UPDATE categorias SET tipo_contenido=? WHERE id_categorias=?";
    private static final String SQL_INSERT = "INSERT INTO categorias (tipo_contenido) VALUES(?)";
    private static final String SQL_SELECT = "SELECT * FROM categorias";
    private static final String SQL_DELETE = "DELETE FROM categorias WHERE id_categorias=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Categorias> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Categorias categoria = null;
        ArrayList<Categorias> categorias = new ArrayList<Categorias>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_categoria = res.getInt("idCategoria");
                String tipo_contenido = res.getString("tipo_contenido");
                
                categoria = new Categorias();
                categoria.setId_categoria(id_categoria);
                categoria.setTipo_contenido(tipo_contenido);
                
                categorias.add(categoria);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return categorias;
    }
    
    //INSERT
    public int insert(Categorias categoria) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, categoria.getTipo_contenido());
            
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
    public int update(Categorias categoria)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            
            stmt.setString(1, categoria.getTipo_contenido());
            stmt.setInt(2, categoria.getId_categoria());
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
    public int delete(Categorias categoria)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, categoria.getId_categoria());
            
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
