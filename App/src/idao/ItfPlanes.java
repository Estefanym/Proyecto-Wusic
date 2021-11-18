/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Planes;
/**
 *
 * @author lolyc
 */
public interface ItfPlanes {
    public ArrayList<Planes> select() throws SQLException;
    public int insert(Planes planes)throws SQLException;
    public int update(Planes planes) throws SQLException;
    public int delete(Planes planes) throws SQLException;
}
