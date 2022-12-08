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
public class medicament {
    private int idm;
    private String libelle;
    private String categorie;
    private int prix;

    public medicament() {
    }

    public medicament(String libelle, String categorie, int prix) {
        this.libelle = libelle;
        this.categorie = categorie;
        this.prix = prix;
    }

    public medicament(int idm, String libelle, String categorie, int prix) {
        this.idm = idm;
        this.libelle = libelle;
        this.categorie = categorie;
        this.prix = prix;
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "medicament{" + "idm=" + idm + ", libelle=" + libelle + ", categorie=" + categorie + ", prix=" + prix + '}';
    }
    
    
}
