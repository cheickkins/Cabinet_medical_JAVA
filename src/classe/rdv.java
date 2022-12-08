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
public class rdv {
    private int idr;
    private int idp;
    private int idmed;
    private String motif;
    private Date date;

    public rdv() {
    }

    public rdv(int idp, int idmed, String motif, Date date) {
        this.idp = idp;
        this.idmed = idmed;
        this.motif = motif;
        this.date = date;
    }

    public rdv(int idr, int idp, int idmed, String motif, Date date) {
        this.idr = idr;
        this.idp = idp;
        this.idmed = idmed;
        this.motif = motif;
        this.date = date;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
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

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "rdv{" + "idr=" + idr + ", idp=" + idp + ", idmed=" + idmed + ", motif=" + motif + ", date=" + date + '}';
    }
    
    
}
