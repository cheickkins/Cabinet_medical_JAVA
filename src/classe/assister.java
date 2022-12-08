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
public class assister {
    private int idas;
    private int idmed;
    private int idi;

    public assister() {
    }

    public assister(int idmed, int idi) {
        this.idmed = idmed;
        this.idi = idi;
    }

    public assister(int idas, int idmed, int idi) {
        this.idas = idas;
        this.idmed = idmed;
        this.idi = idi;
    }

    public int getIdas() {
        return idas;
    }

    public void setIdas(int idas) {
        this.idas = idas;
    }

    public int getIdmed() {
        return idmed;
    }

    public void setIdmed(int idmed) {
        this.idmed = idmed;
    }

    public int getIdi() {
        return idi;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    @Override
    public String toString() {
        return "assister{" + "idas=" + idas + ", idmed=" + idmed + ", idi=" + idi + '}';
    }
    
    
}
