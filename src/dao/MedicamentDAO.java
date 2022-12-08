/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.medicament;
import classe.medicament;
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
public class MedicamentDAO extends DAO<medicament>{
    public medicament recherche(int id) {
       medicament medicament = new medicament();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from medicament where idm="+id);
            if(result.next()){
                medicament.setIdm(result.getInt("idm"));
                medicament.setLibelle(result.getString("libelle"));
                medicament.setCategorie(result.getString("categorie"));
                medicament.setPrix(result.getInt("prix"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return medicament;
    }

    @Override
    public void inserer(medicament obj) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into medicament(libelle,categorie,prix) values(?,?,?)");
            prepare.setString (1,obj.getLibelle());
            prepare.setString(2,obj.getCategorie());
            prepare.setInt(3,obj.getPrix());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



    @Override
    public void modifier(medicament obj, int id) {
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update medicament set libelle=?,categorie =?,prix=? where idm="+id  );
             prepare.setString (1,obj.getLibelle());
            prepare.setString(2,obj.getCategorie());
            prepare.setInt(3,obj.getPrix());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from medicament where idm="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<medicament> liste() {
          medicament medicament = new medicament();
         List<medicament>lu=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from medicament");
            while(result.next()){
                 medicament.setIdm(result.getInt("idm"));
                medicament.setLibelle(result.getString("libelle"));
                medicament.setCategorie(result.getString("categorie"));
                medicament.setPrix(result.getInt("prix"));
                lu.add(medicament);
                medicament = new medicament();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lu;
    }
    
}
