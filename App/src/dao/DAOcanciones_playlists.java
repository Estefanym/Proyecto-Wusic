package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Canciones_playlists;

/**
 *
 * @author lolyc
 */
public class DAOcanciones_playlists {
    private static final String SQL_UPDATE = "UPDATE canciones_playlists SET id_playlist=?,id_cancion=? WHERE id_cp=?";
    private static final String SQL_INSERT = "INSERT INTO canciones_playlists (id_playlist,id_cancion) VALUES(?, ?)";
    private static final String SQL_SELECT = "SELECT * FROM canciones_playlists";
    private static final String SQL_DELETE = "DELETE FROM canciones_playlists WHERE id_cp=?";

    private static Connection conn;
    private static PreparedStatement stmt;
    private static ResultSet res;
    private static int rows;

    //SELECT
    public ArrayList<Canciones_playlists> select() throws SQLException {
        conn = null;
        stmt = null;
        res = null;
        Canciones_playlists cancion_playlist = null;
        ArrayList<Canciones_playlists> canciones_playlists = new ArrayList<Canciones_playlists>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            res = stmt.executeQuery();

            while (res.next()) {
                int id_cp = res.getInt("id_cp");
                int id_playlist = res.getInt("id_playlist");
                int id_cancion = res.getInt("id_cancion");

                cancion_playlist = new Canciones_playlists();
                cancion_playlist.setId_cp(id_cp);
                cancion_playlist.setId_playlist(id_playlist);
                cancion_playlist.setId_cancion(id_cancion);

                canciones_playlists.add(cancion_playlist);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(res);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return canciones_playlists;
    }

    //INSERT
    public int insert(Canciones_playlists cancion_playlist) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setInt(1, cancion_playlist.getId_playlist());
            stmt.setInt(2, cancion_playlist.getId_cancion());

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
    public int update(Canciones_playlists cancion_playlist) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setInt(1, cancion_playlist.getId_playlist());
            stmt.setInt(2, cancion_playlist.getId_cancion());
            stmt.setInt(3, cancion_playlist.getId_cp());
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
    public int delete(Canciones_playlists cancion_playlist) throws SQLException {
        conn = null;
        stmt = null;
        rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cancion_playlist.getId_cp());

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
