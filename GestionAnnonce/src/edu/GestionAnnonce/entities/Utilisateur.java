
package tn.edu.esprit.entities;

/**
 *
 * @author Donia
 */
public class Utilisateur {
    
    protected int idUtilisateur;
    protected String nomUtilisateur;
    protected String prenomUtilisateur;
    protected String email;
    protected String motDePasse;
    protected String genre ;
    protected String dateDeNaissance;
    protected int numTelephone;
    protected String adresse;
    protected String statut;

    public Utilisateur() {
    }

    public Utilisateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
        this.genre = genre;
        this.dateDeNaissance = dateDeNaissance;
        this.numTelephone = numTelephone;
        this.adresse = adresse;
        this.statut = statut;
    }

    public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String email, String motDePasse, String genre, String dateDeNaissance, int numTelephone, String adresse, String statut) {
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
        this.genre = genre;
        this.dateDeNaissance = dateDeNaissance;
        this.numTelephone = numTelephone;
        this.adresse = adresse;
        this.statut = statut;
    }

   

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public int getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", email=" + email + ", motDePasse=" + motDePasse + ", genre=" + genre + ", dateDeNaissance=" + dateDeNaissance + ", numTelephone=" + numTelephone + ", adresse=" + adresse + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idUtilisateur;
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
        final Utilisateur other = (Utilisateur) obj;
        if (this.idUtilisateur != other.idUtilisateur) {
            return false;
        }
        return true;
    }
    
    
}
