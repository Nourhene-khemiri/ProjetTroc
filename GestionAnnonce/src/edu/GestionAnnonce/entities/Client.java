/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.entities;

/**
 *
 * @author Donia
 */
public class Client extends Utilisateur{
private int point;
    public Client() {
    }

    

    public Client( int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut,int point) {
        super(idUtilisateur, nomUtilisateur, prenomUtilisateur, email, motDePasse, genre, dateDeNaissance, numTelephone, adresse, statut);
        this.point = point;
    }

    public Client( String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut,int point) {
        super(nomUtilisateur, prenomUtilisateur, email, motDePasse, genre, dateDeNaissance, numTelephone, adresse, statut);
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

   
    
    
}
