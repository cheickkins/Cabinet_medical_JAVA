/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.patient;
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
public class PatientDAO extends DAO<patient>{
     SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
      @Override
    public patient recherche(int id) {
       patient patient = new patient();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from patient where idp="+id);
            if(result.next()){
                patient.setIdp(result.getInt("idp"));
                patient.setIda(result.getInt("ida"));          
                patient.setNom(result.getString("nom"));
                patient.setPrenom(result.getString("prenom"));
                patient.setAge(result.getInt("age"));
                patient.setSexe(result.getString("sexe"));
                patient.setAdresse(result.getString("adresse"));
                patient.setDate(result.getDate("date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return patient;
    }

    @Override
    public void inserer(patient obj) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into patient(idp,ida,nom,prenom,age,sexe,adresse, date) values(?,?,?,?,?,?,?,?)");
           prepare.setInt(1,obj.getIdp());
           prepare.setInt(2,obj.getIda()); 
            prepare.setString (3,obj.getNom());
            prepare.setString(4,obj.getPrenom());
            prepare.setInt(5,obj.getAge());
            prepare.setString(6,obj.getSexe());
            prepare.setString(7,obj.getAdresse());
            prepare.setString(8,amj.format(obj.getDate()));
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



    @Override
    public void modifier(patient obj, int id) {
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update patient set ida=?,Nom=?,prenom =?,age=?, sexe=?,adresse=?,date=? where idp="+id  );
            prepare.setInt(1,obj.getIda());
            prepare.setString (2,obj.getNom());
            prepare.setString(3,obj.getPrenom());
            prepare.setInt(4,obj.getAge());
            prepare.setString(5,obj.getSexe());
            prepare.setString(6,obj.getAdresse());
            prepare.setString(7,amj.format(obj.getDate()));
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from patient where idp="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<patient> liste() {
          patient patient = new patient();
         List<patient>lu=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from patient");
            while(result.next()){
                patient.setIdp(result.getInt("idp"));
                patient.setIda(result.getInt("ida"));
                patient.setNom(result.getString("nom"));
                patient.setPrenom(result.getString("prenom"));
                patient.setAge(result.getInt("age"));
                patient.setSexe(result.getString("sexe"));
                patient.setAdresse(result.getString("adresse"));
                patient.setDate(result.getDate("date"));
                lu.add(patient);
                patient = new patient();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lu;
    }
      
     public List<patient> recherche(String n) {
          patient patient = new patient();
         List<patient>lu=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from patient where nom like '%"+n +"%' or prenom like '%"+n +"%' or adresse like '%"+n +"%'  ");
            while(result.next()){
                patient.setIdp(result.getInt("idp"));
                patient.setIda(result.getInt("ida"));
                patient.setNom(result.getString("nom"));
                patient.setPrenom(result.getString("prenom"));
                patient.setAge(result.getInt("age"));
                patient.setSexe(result.getString("sexe"));
                patient.setAdresse(result.getString("adresse"));
                patient.setDate(result.getDate("date"));
                lu.add(patient);
                patient = new patient();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lu;
    }
    
}
