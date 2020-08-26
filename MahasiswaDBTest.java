/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import l2.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SB60-35
 */
public class MahasiswaDBTest {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Demo Mahasiswa Form");
        //MahasiswaForm mf = new MahasiswaForm();
        
        frame.add(new MahasiswaForm());
        frame.pack();
        frame.setVisible(true);
        
    }
    
    
}
