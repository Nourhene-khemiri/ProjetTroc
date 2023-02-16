 
package tn.edu.esprit.services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.edu.esprit.entities.Utilisateur;
import tn.edu.esprit.utils.MyConnection;

/**
 *
 * @author Donia
 */
public class LoginService {
    
    Connection connection;
     PreparedStatement pst;
     
     public LoginService(){
    connection = MyConnection.getInstance().getConnection();
    
    }
    public boolean  findUserbyEmail (String email,String motDePasse) throws SQLException{
     String requete =" select * from compte where email=? AND motDePasse=? ";
     PreparedStatement     ps;
     
           ps = connection.prepareStatement(requete);
        
            ps.setString(1, email);
            ps.setString(2, motDePasse);
            ResultSet resultat = ps.executeQuery();
            while(resultat.next()){
     
              if (email.equals(resultat.getString("email"))==true && motDePasse.equals(resultat.getString("motDePasse")) )
                
                   return true;   
              
            

        }
        return false;
     
   
    }
     
     
     
}
