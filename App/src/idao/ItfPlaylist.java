/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Playlists;
/**
 *
 * @author lolyc
 */
public interface ItfPlaylist {
    public ArrayList<Playlists> select() throws SQLException;
    public int insert(Playlists playlist)throws SQLException;
    public int update(Playlists playlist) throws SQLException;
    public int delete(Playlists playlist) throws SQLException;
}
