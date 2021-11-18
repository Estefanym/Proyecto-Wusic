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
import model.Usuarios;

/**
 *
 * @author lolyc
 */
public class DAOusuarios {
    private static final String SQL_UPDATE = "UPDATE usuarios SET id_plan=?,nombre=?,email=?,password=?, telefono=?, no_seguidores=? WHERE id_usuario=?";
    private static final String SQL_INSERT = "INSERT INTO usuarios (id_plan,nombre,email,password,telefono,no_seguidores) VALUES(?, ?,? , ?, ?,?)";
    private static final String SQL_SELECT = "SELECT * FROM usuarios";
    private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id_usuario=?";
    
    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;
    
    
    //SELECT
    public ArrayList<Usuarios> select() throws SQLException{
        conn = null;
        stmt = null;
        res = null;
        Usuarios usuario=null;
        ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();
            
            while(res.next()){
                int id_usuario = res.getInt("id_usuario");
                int id_plan = res.getInt("id_plan");
                String nombre = res.getString("nombre");
                String email = res.getString("email");
                String password = res.getString("password");
                String telefono = res.getString("telefono");
                int no_seguidores = res.getInt("no_seguidores");
                
                usuario = new Usuarios();
                usuario.setId_usuario(id_usuario);
                usuario.setId_plan(id_plan);
                usuario.setNombre(nombre);
                usuario.setEmail(email);
                usuario.setPassword(password);
                usuario.setTelefono(telefono);
                usuario.setNo_seguidores(no_seguidores);
                
                usuarios.add(usuario);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuarios;
    }
    
    //INSERT
    public int insert(Usuarios usuario) throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setInt(1, usuario.getId_plan());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getPassword());
            stmt.setString(5, usuario.getTelefono());
            stmt.setInt(6, usuario.getNo_seguidores());
            
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
    public int update(Usuarios usuario)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setInt(1, usuario.getId_plan());
            stmt.setString(2, usuario.getNombre());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getPassword());
            stmt.setString(5, usuario.getTelefono());
            stmt.setInt(6, usuario.getNo_seguidores());
            stmt.setInt(7, usuario.getId_usuario());
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
    public int delete(Usuarios usuario)throws SQLException{
        conn = null;
        stmt = null;
        rows = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            
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
