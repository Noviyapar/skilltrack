/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3;

import l2.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SB60-35
 */
public class MahasiswaDB {
    
    public List<Mahasiswa> findAll() throws SQLException{
        List<Mahasiswa> mhsList;
        Connection con = MyConnection.getConnection();
        try {
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM Mahasiswa ");
            mhsList = new ArrayList<>();
            while(rs.next()){
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNrp(rs.getString("nrp"));
                mhs.setNama(rs.getString("nama"));
                mhs.setIpk(rs.getFloat("ipk"));
                
                mhsList.add(mhs);
            }
        }
        finally{
            if (con != null){
                con.close();
            }
        }
        
        return mhsList;
    }
    
    public void save(Mahasiswa mhs) throws SQLException{
        Connection con = MyConnection.getConnection();
        
        try {
            PreparedStatement stat= con.prepareStatement("INSERT INTO mahasiswa values(?,?,?,?)");
            stat.setInt(1, 0);
            stat.setString(2, mhs.getNrp());
            stat.setString(3, mhs.getNama());
            stat.setFloat(4, mhs.getIpk());
            
            stat.executeUpdate();
            
        }
        
        finally {
            if (con != null){
                con.close();
            }
        }
    }
    
}
