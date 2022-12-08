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
public class Secretaire {
    private int ida;
    private String nom;
    private String prenom;
    private String Sexe;
    private  String telephone;
    private  String adresse;

    public Secretaire() {
    }

    public Secretaire(String nom, String prenom, String Sexe, String telephone, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.Sexe = Sexe;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public Secretaire(int ida, String nom, String prenom, String Sexe, String telephone, String adresse) {
        this.ida = ida;
        this.nom = nom;
        this.prenom = prenom;
        this.Sexe = Sexe;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
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

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Secretaire{" + "ida=" + ida + ", nom=" + nom + ", prenom=" + prenom + ", Sexe=" + Sexe + ", telephone=" + telephone + ", adresse=" + adresse + '}';
    }

  
    
}
