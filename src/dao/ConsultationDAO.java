/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.consultation;
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
public class ConsultationDAO extends DAO<consultation> {
     SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public consultation recherche(int id) {
        consultation consultation = new consultation();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from consultation where idcons="+id);
            if(result.next()){
                consultation.setIdcons(result.getInt("idcons"));
                consultation.setIdmed(result.getInt("idmed"));
                consultation.setIdp(result.getInt("idp"));
                consultation.setDate(result.getDate("date"));
                consultation.setMotif(result.getString("motif"));
                consultation.setMontant(result.getInt("montant"));

                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return consultation;
    }

    @Override
    public void inserer(consultation obj) {
       
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into consultation(idmed,idp,date,motif, montant) values(?,?,?,?,?)");
            prepare.setInt (1,obj.getIdmed());
            prepare.setInt(2,obj.getIdp());
            prepare.setString(3,amj.format(obj.getDate()));
            prepare.setString(4,obj.getMotif());
            prepare.setInt(5,obj.getMontant());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(consultation obj, int id) {
       
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update consultation set idmed=?,idp=?,date=?, motif=?, montant=? where idcons="+id  );
         prepare.setInt (1,obj.getIdmed());
            prepare.setInt(2,obj.getIdp());
            prepare.setString(3,amj.format(obj.getDate()));
            prepare.setString(4,obj.getMotif());
            prepare.setInt(5,obj.getMontant());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from consultation where idcons="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<consultation> liste() {
         consultation consultation = new consultation();
         List<consultation>lo=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from consultation");
            while(result.next()){
               consultation.setIdcons(result.getInt("idcons"));
                consultation.setIdmed(result.getInt("idmed"));
                consultation.setIdp(result.getInt("idp"));
                consultation.setDate(result.getDate("date"));
                consultation.setMotif(result.getString("motif"));
                consultation.setMontant(result.getInt("montant"));
                lo.add(consultation);
                consultation = new consultation();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lo;
    }
    
    
    
}
