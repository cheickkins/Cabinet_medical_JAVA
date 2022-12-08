/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.infirmier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diarr
 */
public class InfirmierDAO extends DAO<infirmier> {
      public infirmier recherche(int id) {
       infirmier infirmier = new infirmier();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from infirmier where idi="+id);
            if(result.next()){
                infirmier.setIdi(result.getInt("idi"));
                infirmier.setNom(result.getString("nom"));
                infirmier.setPrenom(result.getString("prenom"));
                infirmier.setSexe(result.getString("sexe"));
                infirmier.setAdresse(result.getString("adresse"));
                infirmier.setTelephone(result.getString("telephone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return infirmier;
    }

    @Override
    public void inserer(infirmier obj) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into infirmier(nom,prenom,sexe, adresse, telephone) values(?,?,?,?,?)");
            prepare.setString (1,obj.getNom());
            prepare.setString(2,obj.getPrenom());
            prepare.setString(3,obj.getSexe());
            prepare.setString(4,obj.getAdresse());
            prepare.setString(5,obj.getTelephone());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



    @Override
    public void modifier(infirmier obj, int id) {
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update infirmier set Nom=?,prenom =?, sexe=?, adresse=?, telephone=?  where idi="+id  );
             prepare.setString (1,obj.getNom());
            prepare.setString(2,obj.getPrenom());
            prepare.setString(3,obj.getSexe());
            prepare.setString(4,obj.getAdresse());
            prepare.setString(5,obj.getTelephone());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from infirmier where idi="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<infirmier> liste() {
          infirmier infirmier = new infirmier();
         List<infirmier>lu=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from infirmier");
            while(result.next()){
                 infirmier.setIdi(result.getInt("idi"));
                infirmier.setNom(result.getString("nom"));
                infirmier.setPrenom(result.getString("prenom"));
                infirmier.setSexe(result.getString("sexe"));
                infirmier.setAdresse(result.getString("adresse"));
                infirmier.setTelephone(result.getString("telephone"));
                lu.add(infirmier);
                infirmier = new infirmier();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lu;
    }
      

    
}
