
package tn.edu.esprit.entities;

/**
 *
 * @author Donia
 */
public class Admin extends Utilisateur{
    
    
    private int cin;

    public Admin() {
    }

    

    public Admin( int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut,int cin) {
        super(idUtilisateur, nomUtilisateur, prenomUtilisateur, email, motDePasse, genre, dateDeNaissance, numTelephone, adresse, statut);
        this.cin = cin;
    }

    public Admin( String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut,int cin) {
        super(nomUtilisateur, prenomUtilisateur, email, motDePasse, genre, dateDeNaissance, numTelephone, adresse, statut);
        this.cin = cin;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    

   

    

    
    
    
}
