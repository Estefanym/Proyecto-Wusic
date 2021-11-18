package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categorias_canciones;

/**
 *
 * @author lolyc
 */
public class DAOcategorias_canciones {
    private static final String SQL_UPDATE = "UPDATE categorias_canciones SET id_categoria=?,id_cancion=? WHERE id_cc=?";
    private static final String SQL_INSERT = "INSERT INTO categorias_canciones (id_categoria,id_cancion) VALUES(?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM categorias_canciones";
    private static final String SQL_DELETE = "DELETE FROM artistas WHERE id_cc=?";

    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;

    //SELECT
    public ArrayList<Categorias_canciones> select() throws SQLException {
        conn = null;
        stmt = null;
        res = null;
        Categorias_canciones categoria_cancion = null;
        ArrayList<Categorias_canciones> categorias_canciones = new ArrayList<Categorias_canciones>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();

            while (res.next()) {
                int id_cc = res.getInt("id_cc");
                int id_categoria = res.getInt("id_categoria");
                int id_cancion = res.getInt("id_cancion");

                categoria_cancion = new Categorias_canciones();
                categoria_cancion.setId_cc(id_cc);
                categoria_cancion.setId_categoria(id_categoria);
                categoria_cancion.setId_cancion(id_cancion);

                categorias_canciones.add(categoria_cancion);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return categorias_canciones;
    }

    //INSERT
    public int insert(Categorias_canciones categoria_cancion) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setInt(1, categoria_cancion.getId_categoria());
            stmt.setInt(2, categoria_cancion.getId_cancion());

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
    public int update(Categorias_canciones categoria_cancion) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setInt(1, categoria_cancion.getId_categoria());
            stmt.setInt(2, categoria_cancion.getId_cancion());
            stmt.setInt(3, categoria_cancion.getId_cc());
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
    public int delete(Categorias_canciones categoria_cancion) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, categoria_cancion.getId_cc());

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
