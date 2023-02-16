/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pidev.entities.Livreur;
import pidev.utils.DataBase1;

/**
 *
 * @author Ghazoua
 */
public class ServiceLivreur implements IService<Livreur>{
    Connection cnx = DataBase1.getInstance().getCnx();

    @Override
    public void ajouter(Livreur l) {
        try {
            String req = "INSERT INTO `livreur` (`cin`,`nomUtilisateur`, `prenomUtilisateur`, `email`, `motDePasse`,`genre`,`dateDeNaissance` ,`numTelephone`, `adresse`, `statut`,`disponibilite`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, l.getCin());
            ps.setString(2, l.getNomUtilisateur());
            ps.setString(3, l.getPrenomUtilisateur());
            ps.setString(4, l.getEmail());
            ps.setString(5, l.getMotDePasse());
            ps.setString(6, l.getGenre());
            ps.setString(7, l.getDateDeNaissance());
            ps.setInt(8, l.getNumTelephone());
            ps.setString(9, l.getAdresse());
            ps.setString(10, l.getStatut());
            ps.setString(11, l.getDisponibilite());
            ps.executeUpdate();
            System.out.println("Livreur created !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(int cin) {
        try {
            String req = "DELETE FROM `livreur` WHERE cin = " + cin;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Livreur deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Livreur l) {
        try {
            String req = "UPDATE `livreur` SET `nomUtilisateur` = '" + l.getNomUtilisateur() + "', `prenomUtilisateur` = '" + l.getPrenomUtilisateur() + "',`email` = '" + l.getEmail() + "',`motDePasse` = '" + l.getMotDePasse() + "',`genre` = '" + l.getGenre() + "',`dateDeNaissance` = '" + l.getDateDeNaissance() + "',`numTelephone` = '" + l.getNumTelephone() + "',`adresse` = '" + l.getAdresse() + "',`statut` = '" + l.getStatut() + "',`disponibilite` = '" + l.getDisponibilite() + "' WHERE `livreur`.`cin` = " + l.getCin(); 
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Livreur updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
        }
    }

    @Override
    public List<Livreur> afficher() {
        List<Livreur> list = new ArrayList<>();
        try {
            String req = "Select * from livreur";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Livreur l = new Livreur(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12));
               // list.stream().
                list.add(l);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public Livreur rechercher(int cin) {
        try {
            String req= "Select * from livreur where cin=" + cin;
            PreparedStatement ps = cnx.prepareStatement(req);
            ResultSet resultSet = ps.executeQuery();
            List<ResultSet> list1 = new ArrayList<>();
            
            //list1.stream().forEach(x -> System.out.println(x));
            }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null; 
    }
    
}
