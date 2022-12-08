/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.medecin;
import classe.medecin;
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
public class MedecinDAO extends DAO<medecin> {
      public medecin recherche(int id) {
       medecin medecin = new medecin();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from medecin where idmed="+id);
            if(result.next()){
                medecin.setIdmed(result.getInt("idmed"));
                medecin.setNom(result.getString("nom"));
                medecin.setPrenom(result.getString("prenom"));
                medecin.setSpecialite(result.getString("specialite"));
                medecin.setSexe(result.getString("sexe"));
                medecin.setAdresse(result.getString("adresse"));
                medecin.setTelephon(result.getString("telephone"));
               
                 
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return medecin;
    }

    @Override
    public void inserer(medecin obj) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into medecin(nom,prenom,specialite,sexe, adresse, telephone) values(?,?,?,?,?,?,?)");
            prepare.setString (1,obj.getNom());
            prepare.setString(2,obj.getPrenom());
            prepare.setString(3,obj.getSpecialite());
            prepare.setString(4,obj.getSexe());
            prepare.setString(5,obj.getAdresse());
            prepare.setString(6,obj.getTelephon());
          
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



    @Override
    public void modifier(medecin obj, int id) {
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update medecin set Nom=?,prenom =?,specialite=?, sexe=?, adresse=?, telephone=?  where idmed="+id  );
             prepare.setString (1,obj.getNom());
            prepare.setString(2,obj.getPrenom());
            prepare.setString(3,obj.getSpecialite());
            prepare.setString(4,obj.getSexe());
            prepare.setString(5,obj.getAdresse());
            prepare.setString(6,obj.getTelephon());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from medecin where idmed="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<medecin> liste() {
          medecin medecin = new medecin();
         List<medecin>lu=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from medecin");
            while(result.next()){
                 medecin.setIdmed(result.getInt("idmed"));
                medecin.setNom(result.getString("nom"));
                medecin.setPrenom(result.getString("prenom"));
                medecin.setSpecialite(result.getString("specialite"));
                medecin.setSexe(result.getString("sexe"));
                medecin.setAdresse(result.getString("adresse"));
                medecin.setTelephon(result.getString("telephone"));             
                lu.add(medecin);
                medecin = new medecin();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lu;
    }
        public boolean connexion(String login, String password) {
       boolean v = false;
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from medecin where login='"+login+"' and password='"+password+"'");
            if(result.next()){
               v=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return v;
    }

public void compteur(int id,int nbre){
     try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update medecin set compteur=? where idmed="+id  );
             prepare.setInt(1,nbre);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
