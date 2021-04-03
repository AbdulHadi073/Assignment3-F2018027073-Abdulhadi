/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umtpostgrestest;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RAH
 */
public class UMTPostgresTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
          Connection connection;
          String dbURL="jdbc:postgresql://127.0.0.1/umtproj";
          String userName="postgres";
          String password="postgres";
          
          connection= DriverManager.getConnection(dbURL, userName, password);
          
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
    }
    
}
