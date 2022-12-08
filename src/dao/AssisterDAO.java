/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classe.assister;
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
public class AssisterDAO extends DAO<assister>  {
    SimpleDateFormat amj = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public assister recherche(int id) {
        assister assister = new assister();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select * from assister where idas="+id);
            if(result.next()){
                assister.setIdas(result.getInt("idas"));
                assister.setIdmed(result.getInt("idmed"));
                assister.setIdi(result.getInt("idi"));

                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return assister;
    }

    @Override
    public void inserer(assister obj) {
       
        try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("insert into assister(idmed,idi) values(?,?)");
            prepare.setInt (1,obj.getIdmed());
            prepare.setInt(2,obj.getIdi());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AssisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(assister obj, int id) {
       
       try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("Update assister set idmed=?,idi=? where idas="+id  );
         prepare.setInt (1,obj.getIdmed());
            prepare.setInt(2,obj.getIdi());
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AssisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement prepare = (PreparedStatement)this.connect.prepareStatement("delete from assister where idas="+id);
            prepare.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AssisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<assister> liste() {
         assister assister = new assister();
         List<assister>lo=new ArrayList<>();
        try {
           
            ResultSet result = this.connect.createStatement().executeQuery("select *from assister");
            while(result.next()){
               assister.setIdas(result.getInt("idas"));
                assister.setIdmed(result.getInt("idmed"));
                assister.setIdi(result.getInt("idi"));
                lo.add(assister);
                assister = new assister();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AssisterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     return lo;
    }
    
}
