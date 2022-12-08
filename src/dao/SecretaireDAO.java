/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.Secretaire;
import classe.Secretaire;
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
public class SecretaireDAO extends DAO<Secretaire> {
     public Secretaire recherche(int id) {
       Secretaire secretaire = new Secretaire();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from secretaire where ida="+id);
            if(result.next()){
                secretaire.setIda(result.getInt("ida"));
                secretaire.setNom(result.getString("nom"));
                secretaire.setPrenom(result.getString("prenom"));
                secretaire.setSexe(result.getString("sexe"));
                secretaire.setTelephone(result.getString("telephone"));
                secretaire.setAdresse(result.getString("adresse"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SecretaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return secretaire;
    }

    @Override
    public void inserer(Secretaire obj) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into secretaire(nom,prenom,sexe, telephone,adresse) values(?,?,?,?,?)");
            prepare.setString (1,obj.getNom());
            prepare.setString(2,obj.getPrenom());
            prepare.setString(3,obj.getSexe());
            prepare.setString(4,obj.getTelephone());
            prepare.setString(5,obj.getAdresse());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SecretaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



    @Override
    public void modifier(Secretaire obj, int id) {
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update secretaire set Nom=?,prenom =?, sexe=?, telephone=?, adresse=? where ida="+id  );
             prepare.setString (1,obj.getNom());
            prepare.setString(2,obj.getPrenom());
             prepare.setString(3,obj.getSexe());
            prepare.setString(4,obj.getTelephone());
             prepare.setString(5,obj.getAdresse());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SecretaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from secretaire where ida="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SecretaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Secretaire> liste() {
          Secretaire secretaire = new Secretaire();
         List<Secretaire>lu=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from secretaire");
            while(result.next()){
                 secretaire.setIda(result.getInt("ida"));
                secretaire.setNom(result.getString("nom"));
                secretaire.setPrenom(result.getString("prenom"));
                secretaire.setSexe(result.getString("sexe"));
                secretaire.setTelephone(result.getString("telephone"));
                secretaire.setAdresse(result.getString("adresse"));
                lu.add(secretaire);
                secretaire = new Secretaire();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SecretaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lu;
    }
       

  
}
