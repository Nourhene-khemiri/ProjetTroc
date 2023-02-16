/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pidev.services;

import edu.pidev.entities.MoyenT;
import edu.pidev.utils.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ServiceMoyenT implements IService <MoyenT>{
   Connection cnx = Connexion.getInstance().getCnx();
    @Override
    public void ajouter(MoyenT mT) {
           try {
            String req = "INSERT INTO `moyent` (`matricule`, `modele`, `marque`,`dispo`) VALUES ('" + mT.getMatricule() + "', '" + mT.getModéle() + "','"+ mT.getMarque()+"','"+mT.getDispo()+"')";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Moyen transport created !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(int id) {
      try {
            String req = "DELETE FROM `moyent` WHERE idm = " + id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Moyen de transport deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(MoyenT mT) {
       try {
            String req = "UPDATE `moyent` SET `matricule` = '" + mT.getMatricule() + "', `modele` = '" + mT.getModéle() + "' WHERE `moyent`.`idm` = " + mT.getId();
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Moyen de transport updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<MoyenT> getAll() {
          List<MoyenT> list = new ArrayList<>();
        try {
            String req = "Select * from moyent";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                MoyenT m = new MoyenT(rs.getInt(1), rs.getString("matricule"), rs.getString("modele"),rs.getString("marque"),rs.getString("dispo"));
                list.add(m);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public MoyenT getOneById(int id) {
          MoyenT m = null;
        try {
            String req = "Select * from personne";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
              m = new MoyenT(rs.getInt(1), rs.getString("matricule"), rs.getString("modele"),rs.getString("marque"),rs.getString("dispo")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return m;
    }
    }
    
