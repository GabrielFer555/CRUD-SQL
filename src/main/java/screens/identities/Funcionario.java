/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screens.identities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pichau
 */
public  class Funcionario {
    private String name;
    private double paycheck;
    private int hours_of_work;
    private double totalpayment;
    private static int totalfunc = 0;
    private boolean terceirizado;

    public Funcionario() {
    }

    public Funcionario(String name, double paycheck, int hours_of_work, boolean terceirizado) {
        this.name = name;
        this.paycheck = paycheck;
        this.hours_of_work = hours_of_work;
        this.totalpayment = totalpayment;
        this.terceirizado = terceirizado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaycheck() {
        return paycheck;
    }

    public void setPaycheck(double paycheck) {
        this.paycheck = paycheck;
    }

    public int getHours_of_work() {
        return hours_of_work;
    }

    public void setHours_of_work(int hours_of_work) {
        this.hours_of_work = hours_of_work;
    }

    public double getTotalpayment() {
        return totalpayment;
    }

    public void setTotalpayment(double totalpayment) {
        this.totalpayment = totalpayment;
    }

    public static int getTotalfunc() {
        return totalfunc;
    }

    public boolean isTerceirizado() {
        return terceirizado;
    }

    public void setTerceirizado(boolean terceirizado) {
        this.terceirizado = terceirizado;
    }
    
    
    public void addToSQL(String x, String y) throws ClassNotFoundException, SQLException, IllegalArgumentException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        totalfunc +=1;
    }
    
    public static String removeFromSQL (String x, String y) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
        totalfunc -= 1;
        return null;        
    }
    
    public static void editFromSQL(String x, String y)throws SQLException, ClassNotFoundException, IllegalArgumentException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "password");
    }
   
     
    public double calculatesalary(int hours, double paymentperhour){
        return (hours * paymentperhour);
    }
}
