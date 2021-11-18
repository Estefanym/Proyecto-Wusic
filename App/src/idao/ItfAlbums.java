/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Albums;
/**
 *
 * @author lolyc
 */
public interface ItfAlbums {
    public ArrayList<Albums> select() throws SQLException;
    public int insert(Albums albums)throws SQLException;
    public int update(Albums albums) throws SQLException;
    public int delete(Albums albums) throws SQLException;
}
