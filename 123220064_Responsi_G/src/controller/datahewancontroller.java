/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.ArrayList;
import DAOdatahewan.datahewanDAO;
import DAOImplement.datahewanimplement;
import model.*;
import view.MainView;
/**
 *
 * @author PC PRAKTIKUM
 */
public class datahewancontroller {
    MainView frame;
    datahewanimplement impldatahewan;
    List<datahewan>dh;
    
    public datahewancontroller(MainView frame){
        this.frame = frame;
        impldatahewan = new datahewanDAO();
        dh = impldatahewan.getAll();
    }
    
    public void isitabel(){
        dh = impldatahewan.getAll();
        modeltabeldatahewan mp = new modeltabeldatahewan(dh);
        
    }
    
    public void insert(){
        datahewan dh = new datahewan();
        dh.setId(Integer.parseInt(frame.getjTextId().getText()));
        dh.setNamaPemilik(frame.getjTextNamaPemilik().getText());
        dh.setNamaHewan(frame.getjTextNamaHewan().getText());
        dh.setJenisHewan(frame.getjTextJenisHewan().getText());
        dh.setNomorTelepon(frame.getjTextNomorTelepon().getText());
        dh.setDurasiTitip(Integer.parseInt(frame.getjTextDurasiTitip().getText()));
        dh.setTotalBiaya(Integer.parseInt(frame.getjTextTotalBiaya().getText()));
    }
    
    public void update(){
        datahewan dh = new datahewan();
        dh.setNamaPemilik(frame.getjTextNamaPemilik().getText());
        dh.setNamaHewan(frame.getjTextNamaHewan().getText());
        dh.setJenisHewan(frame.getjTextJenisHewan().getText());
        dh.setNomorTelepon(frame.getjTextNomorTelepon().getText());
        dh.setDurasiTitip(Integer.parseInt(frame.getjTextDurasiTitip().getText()));
        dh.setTotalBiaya(Integer.parseInt(frame.getjTextTotalBiaya().getText()));
        dh.setId(Integer.parseInt(frame.getjTextId().getText()));
    }
    
    public void delete(){
//     int id = Integer.parseInt(frame.getjTextId().getText()));
//     impldatahewan.delete(id);
    }
    
}
