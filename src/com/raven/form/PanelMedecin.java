package com.raven.form;

import classe.medecin;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.MedecinDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelMedecin extends Form {

    public PanelMedecin() {
        initComponents();
        liste_medecin();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_specialite = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        txt_telephone = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tb_medecin = new javaswingdev.swing.table.Table();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        button2 = new com.raven.swing1.Button();
        button3 = new com.raven.swing1.Button();
        button4 = new com.raven.swing1.Button();
        txt_sexe = new combo_suggestion1.ComboBoxSuggestion();

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });

        tb_medecin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nom", "Prenom", "Specialite", "Sexe", "Adresse", "Telephone", "Nbre consultation"
            }
        ));
        tb_medecin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_medecinMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_medecin);

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nom");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Prenom");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Specialite");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Sexe");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Adresse");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Telephone");

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

        txt_sexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "      ", "Masculin", "Feminin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(txt_sexe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_prenom, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_specialite, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(13, 13, 13)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_specialite, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(txt_prenom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_adresse, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sexe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_medecinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_medecinMouseClicked
        int index = tb_medecin.getSelectedRow();
        if (index!=-1){
            int id = (int)tb_medecin.getValueAt(index,0);
            MedecinDAO mdao = new MedecinDAO();
            medecin mtu = mdao.recherche(id);
            txt_nom.setText(mtu.getNom());
            txt_prenom.setText(mtu.getPrenom());
            txt_specialite.setText(mtu.getSpecialite()+"");
            txt_sexe.setSelectedItem(mtu.getSexe()+"");
            txt_adresse.setText(mtu.getAdresse()+"");
            txt_telephone.setText(mtu.getTelephon()+"");
       
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_medecinMouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        MedecinDAO mdao = new MedecinDAO();
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String specialite = txt_specialite.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String adresse = txt_adresse.getText();
        String telephone = txt_telephone.getText();
       
        if (nom.equals("") || prenom.equals("") || specialite.equals("")|| sexe.equals("")|| adresse.equals("")|| telephone.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            medecin mt = new medecin(nom, prenom, specialite, sexe, adresse, telephone);
            mdao.inserer(mt);
            vider();
            liste_medecin();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        MedecinDAO mdao = new MedecinDAO();
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String specialite = txt_specialite.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String adresse = txt_adresse.getText();
        String telephone = txt_telephone.getText();
        

        if (nom.equals("") || prenom.equals("") || specialite.equals("") || sexe.equals("")|| adresse.equals("")|| telephone.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_medecin.getSelectedRow();
            int id = (int)tb_medecin.getValueAt(index,0);
            medecin mt = new medecin(nom, prenom, specialite ,sexe, adresse, telephone);
            mdao.modifier(mt, id);
            vider();
            liste_medecin();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        int index = tb_medecin.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_medecin.getValueAt(index,0);
            MedecinDAO pdao = new MedecinDAO();
            pdao.supprimer(id);
            vider();
            liste_medecin();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed
private void liste_medecin() {
        MedecinDAO mdao = new MedecinDAO();
        List<medecin> medecin = mdao.liste();
        for (int i = 0; i < medecin.size(); i++) {
            ((DefaultTableModel) tb_medecin.getModel()).addRow(new Object[]{
                medecin.get(i).getIdmed(),
                medecin.get(i).getNom(),
                medecin.get(i).getPrenom(),
                medecin.get(i).getSpecialite(),
                medecin.get(i).getSexe(),
                medecin.get(i).getAdresse(),
                medecin.get(i).getTelephon(),
             
               
            });
        }

    }
  public void vider() {
        txt_prenom.setText("");
        txt_nom.setText("");
        txt_specialite.setText("");
        txt_sexe.setSelectedItem("");
        txt_adresse.setText("");
        txt_telephone.setText("");
  
        DefaultTableModel model = (DefaultTableModel) tb_medecin.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button button2;
    private com.raven.swing1.Button button3;
    private com.raven.swing1.Button button4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_medecin;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private combo_suggestion1.ComboBoxSuggestion txt_sexe;
    private javax.swing.JTextField txt_specialite;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
