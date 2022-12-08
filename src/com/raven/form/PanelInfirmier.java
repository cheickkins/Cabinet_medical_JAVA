package com.raven.form;

import classe.infirmier;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.InfirmierDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelInfirmier extends Form {

    public PanelInfirmier() {
        initComponents();
        liste_infirmier();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_sexe = new combo_suggestion1.ComboBoxSuggestion();
        txt_adresse = new javax.swing.JTextField();
        txt_telephone = new javax.swing.JTextField();
        button2 = new com.raven.swing1.Button();
        button3 = new com.raven.swing1.Button();
        button4 = new com.raven.swing1.Button();
        scroll = new javax.swing.JScrollPane();
        tb_infirmier = new javaswingdev.swing.table.Table();

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nom");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Prenom");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Sexe");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Adresse");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Telephone");

        txt_sexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "      ", "Masculin", "Feminin" }));
        txt_sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexeActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 51, 51));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("ENREGISTRER");
        button2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 51, 51));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("MODIFIER");
        button3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 51, 51));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("SUPPRIMER");
        button4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        tb_infirmier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nom", "Prenom", "Sexe", "Adresse", "Telephone"
            }
        ));
        tb_infirmier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_infirmierMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_infirmier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexeActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        InfirmierDAO idao = new InfirmierDAO();
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String adresse = txt_adresse.getText();
        String telephone = txt_telephone.getText();
        if (nom.equals("") || prenom.equals("") ||  sexe.equals("")|| adresse.equals("")|| telephone.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            infirmier it = new infirmier(nom, prenom, sexe, adresse, telephone);
            idao.inserer(it);
            vider();
            liste_infirmier();
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        InfirmierDAO idao = new InfirmierDAO();
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String adresse = txt_adresse.getText();
        String telephone = txt_telephone.getText();

        if (nom.equals("") || prenom.equals("") || sexe.equals("")|| adresse.equals("")|| telephone.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_infirmier.getSelectedRow();
            int id = (int)tb_infirmier.getValueAt(index,0);
            infirmier mt = new infirmier(nom, prenom,sexe, adresse, telephone);
            idao.modifier(mt, id);
            vider();
            liste_infirmier();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        int index = tb_infirmier.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_infirmier.getValueAt(index,0);
            InfirmierDAO idao = new InfirmierDAO();
            idao.supprimer(id);
            vider();
            liste_infirmier();

        }
    }//GEN-LAST:event_button4ActionPerformed

    private void tb_infirmierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_infirmierMouseClicked
 int index = tb_infirmier.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_infirmier.getValueAt(index,0);
            InfirmierDAO idao = new InfirmierDAO();
            infirmier itu = idao.recherche(id);
            txt_nom.setText(itu.getNom());
            txt_prenom.setText(itu.getPrenom());
            txt_sexe.setSelectedItem(itu.getSexe()+"");
            txt_adresse.setText(itu.getAdresse()+"");
            txt_telephone.setText(itu.getTelephone()+"");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_infirmierMouseClicked
 private void liste_infirmier() {
        InfirmierDAO idao = new InfirmierDAO();
        List<infirmier> infirmier = idao.liste();
        for (int i = 0; i < infirmier.size(); i++) {
            ((DefaultTableModel) tb_infirmier.getModel()).addRow(new Object[]{
                infirmier.get(i).getIdi(),
                infirmier.get(i).getNom(),
                infirmier.get(i).getPrenom(),
                infirmier.get(i).getSexe(),
                infirmier.get(i).getAdresse(),
                infirmier.get(i).getTelephone(),
               
            });
        }

    }
  public void vider() {
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_sexe.setSelectedItem("");
        txt_adresse.setText("");
        txt_telephone.setText("");
  
        DefaultTableModel model = (DefaultTableModel) tb_infirmier.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button button2;
    private com.raven.swing1.Button button3;
    private com.raven.swing1.Button button4;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_infirmier;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private combo_suggestion1.ComboBoxSuggestion txt_sexe;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
