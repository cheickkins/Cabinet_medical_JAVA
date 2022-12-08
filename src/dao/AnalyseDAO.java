/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.analyse;
import classe.analyse;
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
public class AnalyseDAO extends DAO<analyse> {
SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public analyse recherche(int id) {
       analyse analyse = new analyse();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from analyse where idana="+id);
            if(result.next()){
                analyse.setIdana(result.getInt("idana"));
                analyse.setIdi(result.getInt("idi"));
                analyse.setIdp(result.getInt("idp"));
                analyse.setType(result.getString("type"));
                analyse.setDate(result.getDate("date"));
                analyse.setMontant(result.getInt("montant"));
               

                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return analyse;
    }

    @Override
    public void inserer(analyse obj) {
         try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into analyse(idi,idp,type,date,montant) values(?,?,?,?,?)");
            prepare.setInt (1,obj.getIdi());
            prepare.setInt(2,obj.getIdp());
            prepare.setString(3,obj.getType());
            prepare.setString(4,amj.format(obj.getDate()));
            prepare.setInt(5,obj.getMontant());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(analyse obj, int id) {
       
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update analyse set idi=?, idp=?, type=?,date=?, montant=? where idana="+id  );
           
           
            prepare.setInt (1,obj.getIdi());
            prepare.setInt(2,obj.getIdp());
            prepare.setString(3,obj.getType());
            prepare.setString(4,amj.format(obj.getDate()));
             prepare.setInt (5,obj.getMontant());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from analyse where idana="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<analyse> liste() {
        analyse analyse = new analyse();
         List<analyse>lo=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from analyse");
            while(result.next()){
               analyse.setIdana(result.getInt("idana"));
               analyse.setIdi(result.getInt("idi"));
                analyse.setIdp(result.getInt("idp"));
                analyse.setType(result.getString("type"));
                analyse.setDate(result.getDate("date"));
                analyse.setMontant(result.getInt("montant"));
                lo.add(analyse);
                analyse = new analyse();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnalyseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lo;
    }
    }
    

