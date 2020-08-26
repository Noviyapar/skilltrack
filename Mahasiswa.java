/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3;

import l2.*;

/**
 *
 * @author SB60-35
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private float ipk;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nrp, String nama, float ipk){
        this.nrp = nrp;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    
    
}
