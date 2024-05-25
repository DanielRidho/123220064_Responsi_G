/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC PRAKTIKUM
 */
public class datahewan {
    private Integer id;
    private String nama_pemilik;
    private String nama_hewan;
    private String jenis_hewan;
    private String nomor_telepon;
    private Integer durasi_titip;
    private Integer total_biaya;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaPemilik() {
        return nama_pemilik;
    }

    public void setNamaPemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getNamaHewan() {
        return nama_hewan;
    }

    public void setNamaHewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }

    public String getJenisHewan() {
        return jenis_hewan;
    }

    public void setJenisHewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }
    
    public String getNomorTelepon() {
        return nomor_telepon;
    }

    public void setNomorTelepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }
    
    public Integer getDurasiTitip() {
        return durasi_titip;
    }

    public void setDurasiTitip(Integer durasi_titip) {
        this.durasi_titip = durasi_titip;
    }
    
    public Integer getTotalBiaya() {
        return total_biaya;
    }

    public void setTotalBiaya(Integer total_biaya) {
        this.total_biaya = total_biaya;
    }
}
