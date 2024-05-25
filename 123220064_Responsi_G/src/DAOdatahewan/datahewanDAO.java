/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatahewan;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.datahewanimplement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datahewanDAO implements datahewanimplement{
    Connection connection;
    
    final String select = "select * from titip_hewan";
    final String insert = "INSERT INTO titip_hewan (nama_pemilik, nama_hewan, jenis_hewan, nomor_telepon, durasi_titip) VALUES(?, ?, ?, ?, ?)";
    final String update = "update titip_hewan set nama_pemilik=?, nama_hewan=?, jenis_hewan=?, nomor_telepon=?, durasi_titip=? where id=?";
    final String delete = "delete from titip_hewan where id=?";
    public datahewanDAO(){
        connection= connector.connection();
    }

    @Override
    public void insert(datahewan p) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNamaPemilik());
            statement.setString(2, p.getNamaHewan());
            statement.setString(3, p.getJenisHewan());
            statement.setString(4, p.getNomorTelepon());
            statement.setInt(5, p.DurasiTitip());
            statement.setInt(6, p.getId());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                p.setId(rs.getInt(1));
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datahewan p) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
             statement.setString(1, p.getNamaPemilik());
            statement.setString(2, p.getNamaHewan());
            statement.setString(3, p.getJenisHewan());
            statement.setString(4, p.getNomorTelepon());
            statement.setInt(5, p.DurasiTitip());
            statement.setInt(6, p.getId());
            statement.executeUpdate();
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            try{
                statement.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
        statement = connection.prepareStatement(delete);
        statement.setInt(1, id);
        statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datahewan> getAll() {
       List<datahewan> dh = null;
       try{
       dh = new ArrayList<datahewan>();
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(select);
       while(rs.next()){
           datahewan hw = new datahewan();
           hw.setId(rs.getInt("id"));
           hw.setNamaPemilik(rs.getString("nama_pemilik"));
           hw.setNamaHewan(rs.getString("nama_hewan"));
           hw.setJenisHewan(rs.getString("jenis_hewan"));
           hw.setNomorTelepon(rs.getString("nomor_telepon"));
           hw.setDurasiTitip(rs.getInt("durasi_titip"));
           dh.add(hw);
           }
       }catch(SQLException ex){
       Logger.getLogger(datahewanDAO.class.getName()).log(Level.SEVERE,null,ex);
       }
       return dh;
    }
   
}
