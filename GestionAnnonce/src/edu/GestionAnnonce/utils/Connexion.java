/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pidev.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Connexion {
       private Connection cnx;
    private static Connexion instance;
     private final String USER = "root";
    private final String PWD = "";
      private final String URL = "jdbc:mysql://localhost:3306/projet";
     
      
      private Connexion() {
        try {
            cnx = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Connected !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
      
         public static Connexion getInstance() {
        if(instance == null)
            instance = new Connexion();
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
    
}
