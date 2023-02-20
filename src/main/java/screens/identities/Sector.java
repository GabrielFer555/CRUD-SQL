/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screens.identities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    
    public String addToSQL(String numsector, String descSector){
        try {
            String num, descrip;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
            Statement stm = con.createStatement();
            String sql = "INSERT INTO setores (setor_num, setor_description) VALUES (?, ? )";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, numsector);
            preparedStatement.setString(2, descSector);
            preparedStatement.execute();

            return ("Sucesso!");
        } catch (SQLException b) {
            return ("ERRO AO CONECTAR COM O BANCO DE DADOS \n VERIFIQUE!");
        } catch (ClassNotFoundException ex) {
            return (ex.getMessage());
        }
    }
}
