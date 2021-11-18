package dao;

import java.sql.*;

public class Conexion {
    private final static String SQL_url = "jdbc:postgresql://192.168.59.131:5432/wusic";
    private final static String SQL_user = "postgres";
    private final static String SQL_password = "postgres" ;
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(SQL_url,SQL_user,SQL_password);
    }
    
    public static void close(Connection conexion){
        try {
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(ResultSet res){
        try {
            res.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
