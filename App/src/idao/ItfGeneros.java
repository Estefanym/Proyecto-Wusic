/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Generos;
/**
 *
 * @author lolyc
 */
public interface ItfGeneros {
    public ArrayList<Generos> select() throws SQLException;
    public int insert(Generos generos)throws SQLException;
    public int update(Generos generos) throws SQLException;
    public int delete(Generos generos) throws SQLException;
}
