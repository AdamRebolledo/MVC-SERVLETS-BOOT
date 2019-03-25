/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;

/**
 *
 * @author 56974
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/nuestragencia";
            String user = "root";
            String pass = "";
            con=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println(e);
        }
     
    }
    public Connection getConnection(){
    return con;
    }
    
  
    
}
