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
public class analyse {
    private int idana;
    private int idi;
    private int idp;
    private String type;
    private Date date;
    private int montant;

    public analyse() {
    }

    public analyse(int idi, int idp, String type, Date date,int montant) {
        this.idi = idi;
        this.idp = idp;
        this.type = type;
        this.date = date;
        this.montant = montant;
    }

    public analyse(int idana, int idi, int idp, String type, Date date, int montant) {
        this.idana = idana;
        this.idi = idi;
        this.idp = idp;
        this.type = type;
        this.date = date;
        this.montant = montant;
    }

    public int getIdana() {
        return idana;
    }

    public void setIdana(int idana) {
        this.idana = idana;
    }

    public int getIdi() {
        return idi;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "analyse{" + "idana=" + idana + ", idi=" + idi + ", idp=" + idp + ", type=" + type + ", date=" + date + ", montant=" + montant + '}';
    }

   
    
    
}
