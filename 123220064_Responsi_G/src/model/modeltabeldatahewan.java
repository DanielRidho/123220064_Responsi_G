/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author PC PRAKTIKUM
 */
public class modeltabeldatahewan extends AbstractTableModel {
    
    List<datahewan> dh;
    public modeltabeldatahewan(List<datahewan> dh){
        this.dh = dh;
    }
    
    @Override
    public int getRowCount(){
        return dh.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ÏD";
            case 1:
                return "NAMA PEMILIK";
            case 2:
                return "NAMA HEWAN";
            case 3:
                return "JENIS HEWAN";
            case 4:
                return "NOMOR TELEPON";
            case 5:
                return "DURASI TITIP";
            case 6:
                return "TOTAL BIAYA";
            
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column){
        switch(column){
            case 0:
                return dh.get(row).getId();
            case 1:
                return dh.get(row).getNamaPemilik();
            case 2:
                return dh.get(row).getNamaHewan();
            case 3:
                return dh.get(row).getJenisHewan();
            case 4:
                return dh.get(row).getNomorTelepon();
            case 5:
                return dh.get(row).getDurasiTitip();
            case 6:
                return dh.get(row).getTotalBiaya();
            default:
                return null;
        }
    }
}
