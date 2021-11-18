/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Canciones;
/**
 *
 * @author lolyc
 */
public interface ItfCanciones {
    public ArrayList<ItfCanciones> select() throws SQLException;
    public int insert(ItfCanciones canciones)throws SQLException;
    public int update(ItfCanciones canciones) throws SQLException;
    public int delete(ItfCanciones canciones) throws SQLException;
}
