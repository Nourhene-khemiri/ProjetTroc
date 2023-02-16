
package tn.edu.esprit.services;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.edu.esprit.entities.Client;
import tn.edu.esprit.utils.MyConnection;

/**
 *
 * @author Donia
 */
public class InscriptionService {
    
     Connection connection;
     PreparedStatement pst;
     PreparedStatement pstCompte;
     
    public InscriptionService(){
    connection = MyConnection.getInstance().getConnection();
    
    }
    public void inscrire(Client client){
    
    String requete1 ="INSERT INTO `client` (`nomUtilisateur`, `prenomUtilisateur`, `email`, `motDePasse`, `genre`, `dateDeNaissance`, `numTelephone`, `adresse`, `statut`, `point`) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?) ";
    String requete2 ="INSERT INTO `compte`(`email`, `motDePasse`, `statut`) VALUES (?,?,?)";
        try {
             pst =connection.prepareStatement(requete1);
             pst.setString(1,client.getNomUtilisateur());
            pst.setString(2,client.getPrenomUtilisateur());
            pst.setString(3,client.getEmail());
            pst.setString(4,client.getMotDePasse());
            pst.setString(5,client.getGenre());
            pst.setString(6,client.getDateDeNaissance());
            pst.setInt(7,client.getNumTelephone());
            pst.setString(8,client.getAdresse());
            pst.setString(9, client.getStatut());
            pst.setInt(10, client.getPoint());
            pst.executeUpdate();
            
            pstCompte =connection.prepareStatement(requete2);
            pstCompte.setString(1,client.getEmail());
            pstCompte.setString(2, client.getMotDePasse());
            pstCompte.setString(3,"client");
            pstCompte.executeUpdate();
            System.out.println("compte ajouté");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }
    
}
