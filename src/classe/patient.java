/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Date;

/**
 *
 * @author diarr
 */
public class patient {
    private int idp;
    private int ida;
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private String adresse;
    private Date date;

    public patient() {
    }

    public patient(int ida, String nom, String prenom, int age, String sexe, String adresse, Date date) {
        this.ida = ida;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
        this.date = date;
    }

    public patient(int idp, int ida, String nom, String prenom, int age, String sexe, String adresse, Date date) {
        this.idp = idp;
        this.ida = ida;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        this.adresse = adresse;
        this.date = date;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "patient{" + "idp=" + idp + ", ida=" + ida + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", sexe=" + sexe + ", adresse=" + adresse + ", date=" + date + '}';
    }
    

    
    }

   
    
    
    

