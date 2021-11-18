/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Pagos;
/**
 *
 * @author lolyc
 */
public interface IftPagos {
    public ArrayList<Pagos> select() throws SQLException;
    public int insert(Pagos pagos)throws SQLException;
    public int update(Pagos pagos) throws SQLException;
    public int delete(Pagos pagos) throws SQLException;
}
