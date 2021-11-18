/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Artistas;
/**
 *
 * @author lolyc
 */
public interface ItfArtistas {
    public ArrayList<ItfArtistas> select() throws SQLException;
    public int insert(ItfArtistas artistas)throws SQLException;
    public int update(ItfArtistas artistas) throws SQLException;
    public int delete(ItfArtistas artistas) throws SQLException;
}
