/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.sql.Date;

/**
 *
 * @author diarr
 */
public class ordonnance {
    private int ido;
    private int idp;
    private int idmed;
    private int idm;
    private Date date;

    public ordonnance() {
    }

    public ordonnance(int idp, int idmed, int idm, Date date) {
        this.idp = idp;
        this.idmed = idmed;
        this.idm = idm;
        this.date = date;
    }

    public ordonnance(int ido, int idp, int idmed, int idm, Date date) {
        this.ido = ido;
        this.idp = idp;
        this.idmed = idmed;
        this.idm = idm;
        this.date = date;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getIdmed() {
        return idmed;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ordonnance{" + "ido=" + ido + ", idp=" + idp + ", idmed=" + idmed + ", idm=" + idm + ", date=" + date + '}';
    }

   
    
    
}
