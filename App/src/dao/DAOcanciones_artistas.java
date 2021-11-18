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
import model.Canciones_artistas;

/**
 *
 * @author lolyc
 */
public class DAOcanciones_artistas {
    private static final String SQL_UPDATE = "UPDATE canciones_artistas SET id_cancion=?,id_artista=? WHERE id_ca=?";
    private static final String SQL_INSERT = "INSERT INTO canciones_artistas (id_cancion,id_artista) VALUES(?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM canciones_artistas";
    private static final String SQL_DELETE = "DELETE FROM canciones_artistas WHERE id_ca=?";

    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;

    //SELECT
    public ArrayList<Canciones_artistas> select() throws SQLException {
        conn = null;
        stmt = null;
        res = null;
        Canciones_artistas cancion_artista = null;
        ArrayList<Canciones_artistas> canciones_artistas = new ArrayList<Canciones_artistas>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();

            while (res.next()) {
                int id_ca = res.getInt("id_ca");
                int id_cancion = res.getInt("id_cancion");
                int id_artista = res.getInt("id_artista");

                cancion_artista = new Canciones_artistas();
                cancion_artista.setId_ca(id_ca);
                cancion_artista.setId_cancion(id_cancion);
                cancion_artista.setId_artista(id_artista);

                canciones_artistas.add(cancion_artista);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return canciones_artistas;
    }

    //INSERT
    public int insert(Canciones_artistas cancion_artista) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setInt(1, cancion_artista.getId_cancion());
            stmt.setInt(2, cancion_artista.getId_artista());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    //UPDATE
    public int update(Canciones_artistas cancion_artista) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setInt(1, cancion_artista.getId_cancion());
            stmt.setInt(2, cancion_artista.getId_artista());
            stmt.setInt(3, cancion_artista.getId_ca());
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    //DELETE
    public int delete(Canciones_artistas cancion_artista) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cancion_artista.getId_ca());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
