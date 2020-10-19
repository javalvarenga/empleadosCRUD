/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.empleadosproject;
//dependencias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abraham
 */
public class DataBase {
    
    private Connection conexion;
    
public DataBase(){

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String usuario="root";
        String password="ageofempire123";
        String bd="empresa";
        String host = "localhost:3306";
        String url="jdbc:mysql://"+host+"/"+bd;
        
        conexion = DriverManager.getConnection(url, usuario, password);
        
        System.out.println("Connection Succefully");
        
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        public Connection getConnection(){
        return this.conexion;
        }
        
        
    
}
