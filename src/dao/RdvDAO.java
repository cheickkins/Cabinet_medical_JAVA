/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.rdv;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diarr
 */
public class RdvDAO extends DAO<rdv> {
     SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public rdv recherche(int id) {
        rdv rdv = new rdv();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from rdv where idr="+id);
            if(result.next()){
                rdv.setIdr(result.getInt("idr"));
                rdv.setIdp(result.getInt("idp"));
                rdv.setIdmed(result.getInt("idmed"));
                rdv.setMotif(result.getString("motif"));
                rdv.setDate(result.getDate("date"));
                
               

                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return rdv;
    }

    @Override
    public void inserer(rdv obj) {
       
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into rdv(idp,idmed,motif,date) values(?,?,?,?)");
            prepare.setInt(1,obj.getIdp());
            prepare.setInt (2,obj.getIdmed());
            prepare.setString(3,obj.getMotif());
            prepare.setString(4,amj.format(obj.getDate()));
            
            
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(rdv obj, int id) {
       
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update rdv set idp=?,idmed=?, motif=?, date=? where idr="+id  );
           
            prepare.setInt(1,obj.getIdp());
            prepare.setInt (2,obj.getIdmed());
            prepare.setString(3,obj.getMotif());
            prepare.setString(4,amj.format(obj.getDate()));
            
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from rdv where idr="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<rdv> liste() {
         rdv rdv = new rdv();
         List<rdv>lo=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from rdv");
            while(result.next()){
               rdv.setIdr(result.getInt("idr"));
               rdv.setIdp(result.getInt("idp"));
                rdv.setIdmed(result.getInt("idmed"));
                rdv.setMotif(result.getString("motif"));
                rdv.setDate(result.getDate("date"));
                lo.add(rdv);
                rdv = new rdv();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lo;
    }
    
}
