/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ItfCanciones_artistas {
    public ArrayList<ItfCanciones_artistas> select() throws SQLException;
    public int insert(ItfCanciones_artistas canciones_artistas)throws SQLException;
    public int update(ItfCanciones_artistas canciones_artistas) throws SQLException;
    public int delete(ItfCanciones_artistas canciones_artistas) throws SQLException;
}
