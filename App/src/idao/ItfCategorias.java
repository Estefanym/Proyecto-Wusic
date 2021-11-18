/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Categorias;
/**
 *
 * @author lolyc
 */
public interface ItfCategorias {
    public ArrayList<Categorias> select() throws SQLException;
    public int insert(Categorias categorias)throws SQLException;
    public int update(Categorias categorias) throws SQLException;
    public int delete(Categorias categorias) throws SQLException;
}
