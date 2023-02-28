/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screens.identities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import screens.telaprincipal;

/**
 *
 * @author Pichau
 */
public class Sector {

    private String num_sector;
    private String desc_Sector;

    public Sector() {
    }

    public Sector(String num_sector, String desc_Sector) {
        this.num_sector = num_sector;
        this.desc_Sector = desc_Sector;
    }

    public String getNum_sector() {
        return num_sector;
    }

    public void setNum_sector(String num_sector) {
        this.num_sector = num_sector;
    }

    public String getDesc_Sector() {
        return desc_Sector;
    }

    public void setDesc_Sector(String desc_Sector) {
        this.desc_Sector = desc_Sector;
    }

    public void addToSQL(String numsector, String descSector) throws ClassNotFoundException, SQLException, IllegalArgumentException {
        if(numsector == "" || numsector == null){
            throw new IllegalArgumentException("Setor com nome vazio! \n VERIFIQUE!");
        }
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        Statement stm = con.createStatement();
        String sql = "INSERT INTO setores (setor_num, setor_description) VALUES (?, ? )";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, numsector);
        preparedStatement.setString(2, descSector);
        preparedStatement.execute();

    }
    
    public static String removeFromSQL(String num_sector, String descSector) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        Statement st = con.createStatement();
        String sql = "DELETE FROM setores WHERE setor_num = ? AND setor_description = ?";
        PreparedStatement prepared = con.prepareStatement(sql);
        prepared.setString(1, num_sector);
        prepared.setString(2, descSector);
        prepared.execute();
        con.close();
        return ("Sucesso!");

    }

    public static void editFromSQL(String setor_desc, String sector_num) throws SQLException, ClassNotFoundException, IllegalArgumentException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        Statement stm = con.createStatement();
        if (setor_desc == null || setor_desc == "") {
            throw new IllegalArgumentException("ERROR 01: Valor inválido \n VERIFIQUE!");
        } else {
            String sql = "UPDATE setores SET setor_description = ? WHERE setor_num = ?";
            PreparedStatement command = con.prepareStatement(sql);
            command.setString(1, setor_desc);
            command.setString(2, sector_num);
            command.executeUpdate();

        }

    }

}
