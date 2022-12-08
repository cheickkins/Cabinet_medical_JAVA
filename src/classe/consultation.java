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
public class consultation {
    private int idcons;
    private int idmed;
    private int idp;
    private Date date;
    private String motif;
    private int montant;

    public consultation() {
    }

    public consultation(int idmed, int idp, Date date, String motif, int montant) {
        this.idmed = idmed;
        this.idp = idp;
        this.date = date;
        this.motif = motif;
        this.montant = montant;
    }

    public consultation(int idcons, int idmed, int idp, Date date, String motif, int montant) {
        this.idcons = idcons;
        this.idmed = idmed;
        this.idp = idp;
        this.date = date;
        this.motif = motif;
        this.montant = montant;
    }

    public int getIdcons() {
        return idcons;
    }

    public void setIdcons(int idcons) {
        this.idcons = idcons;
    }

    public int getIdmed() {
        return idmed;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "consultation{" + "idcons=" + idcons + ", idmed=" + idmed + ", idp=" + idp + ", date=" + date + ", motif=" + motif + ", montant=" + montant + '}';
    }
    
    }
