/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev.entities;

import java.util.Objects;

/**
 *
 * @author Ghazoua
 */
public class Livreur extends Utilisateur{
    private int cin;
    private String disponibilite;

    public Livreur() {
    }

    public Livreur(int cin, String disponibilite) {
        this.cin = cin;
        this.disponibilite = disponibilite;
    }

    public Livreur(int cin, int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut,String disponibilite) {
        super(idUtilisateur, nomUtilisateur, prenomUtilisateur, email, motDePasse, genre, dateDeNaissance, numTelephone, adresse, statut);
        this.cin = cin;
        this.disponibilite = disponibilite;
    }

    public Livreur(int cin, String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut,String disponibilite) {
        super(nomUtilisateur, prenomUtilisateur, email, motDePasse, genre, dateDeNaissance, numTelephone, adresse, statut);
        this.cin = cin;
        this.disponibilite = disponibilite;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setDisponibilité(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public int getCin() {
        return cin;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.cin;
        hash = 73 * hash + Objects.hashCode(this.disponibilite);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livreur other = (Livreur) obj;
        if (this.cin != other.cin) {
            return false;
        }
        if (!Objects.equals(this.disponibilite, other.disponibilite)) {
            return false;
        }
        return true;
    }

    
    
    @Override
     public String toString(){
        return  "Utilisateur{" + "idUtilisateur=" + idUtilisateur + "cin=" + cin +", nomUtilisateur=" + nomUtilisateur + ",prenomUtilisateur=" + prenomUtilisateur + ", email=" + email + ", motDePasse=" + motDePasse + ", genre=" + genre + ", dateDeNaissance=" + dateDeNaissance + ", numTelephone=" + numTelephone + ", adresse=" + adresse + ", statut=" + statut +"disponibilite="+ disponibilite +'}';
    }
    
    
}
