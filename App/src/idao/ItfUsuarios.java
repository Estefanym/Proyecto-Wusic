/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuarios;
/**
 *
 * @author lolyc
 */
public interface ItfUsuarios {
    public ArrayList<Usuarios> select() throws SQLException;
    public int insert(Usuarios usuarios)throws SQLException;
    public int update(Usuarios usuarios) throws SQLException;
    public int delete(Usuarios usuarios) throws SQLException;
}
