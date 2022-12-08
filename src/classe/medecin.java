/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author diarr
 */
public class medecin {
    private int idmed;
    private String nom;
    private String prenom;
    private String specialite;
    private String sexe;
    private String adresse;
    private String telephon;
    private int nbrecons;
    private int compteur;

    public medecin() {
    }

    public medecin(String nom, String prenom, String specialite, String sexe, String adresse, String telephon) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.sexe = sexe;
        this.adresse = adresse;
        this.telephon = telephon;
    }

    public medecin(int idmed, String nom, String prenom, String specialite, String sexe, String adresse, String telephon) {
        this.idmed = idmed;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.sexe = sexe;
        this.adresse = adresse;
        this.telephon = telephon;
       
    }

    public int getIdmed() {
        return idmed;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }


    @Override
    public String toString() {
        return "medecin{" + "idmed=" + idmed + ", nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite + ", sexe=" + sexe + ", adresse=" + adresse + ", telephon=" + telephon + '}';
    }

    
    
}
