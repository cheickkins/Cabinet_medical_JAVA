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
public class contenir {
    private int idc;
    private int ido;
    private int idmed;
    private int qteproduit;

    public contenir() {
    }

    public contenir(int ido, int idmed, int qteproduit) {
        this.ido = ido;
        this.idmed = idmed;
        this.qteproduit = qteproduit;
    }

    public contenir(int idc, int ido, int idmed, int qteproduit) {
        this.idc = idc;
        this.ido = ido;
        this.idmed = idmed;
        this.qteproduit = qteproduit;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public int getIdmed() {
        return idmed;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public int getQteproduit() {
        return qteproduit;
    }

    public void setQteproduit(int qteproduit) {
        this.qteproduit = qteproduit;
    }

    @Override
    public String toString() {
        return "contenir{" + "idc=" + idc + ", ido=" + ido + ", idmed=" + idmed + ", qteproduit=" + qteproduit + '}';
    }
    
    
}
