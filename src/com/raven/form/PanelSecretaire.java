package com.raven.form;

import classe.Secretaire;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.SecretaireDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelSecretaire extends Form {

    public PanelSecretaire() {
        initComponents();
        liste_accueil();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_telephone = new javax.swing.JTextField();
        txt_sexe = new combo_suggestion1.ComboBoxSuggestion();
        jLabel18 = new javax.swing.JLabel();
        txt_adresse = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tb_accueil = new javaswingdev.swing.table.Table();
        button2 = new com.raven.swing1.Button();
        button3 = new com.raven.swing1.Button();
        button4 = new com.raven.swing1.Button();

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nom");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Prenom");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Sexe");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Telephone");

        txt_telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telephoneActionPerformed(evt);
            }
        });

        txt_sexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "      ", "Masculin", "Feminin" }));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Adresse");

        tb_accueil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nom", "Prenom", "Sexe", "Telephone", "Adresse"
            }
        ));
        tb_accueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_accueilMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_accueil);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        SecretaireDAO adao = new SecretaireDAO();
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String telephone = txt_telephone.getText();
        String adresse = txt_adresse.getText();
        if (nom.equals("") || prenom.equals("") || sexe.equals("")|| telephone.equals("")|| adresse.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            Secretaire at = new Secretaire(nom, prenom, sexe, telephone,adresse);
            adao.inserer(at);
            vider();
            liste_accueil();
        }
        }

        private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {
            SecretaireDAO adao = new SecretaireDAO();
            String nom = txt_nom.getText();
            String prenom = txt_prenom.getText();
            String sexe = txt_sexe.getSelectedItem().toString();
            String telephone = txt_telephone.getText();
            String adresse = txt_adresse.getText();
            if (nom.equals("") || prenom.equals("") || sexe.equals("")|| telephone.equals("")|| adresse.equals("")) {
                JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
            } else {
                int index = tb_accueil.getSelectedRow();
                int id = (int)tb_accueil.getValueAt(index,0);
                Secretaire at = new Secretaire(nom, prenom, sexe, telephone,adresse);
                adao.modifier(at, id);
                vider();
                liste_accueil();
            }
        }

        private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {
            int index = tb_accueil.getSelectedRow();
            if (index==-1){
                JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
            }
            else {
                int id = (int)tb_accueil.getValueAt(index,0);
                SecretaireDAO adao = new SecretaireDAO();
                adao.supprimer(id);
                vider();
                liste_accueil();

            }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        SecretaireDAO adao = new SecretaireDAO();
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String telephone = txt_telephone.getText();
        String adresse = txt_adresse.getText();
        if (nom.equals("") || prenom.equals("") || sexe.equals("")|| telephone.equals("")|| adresse.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_accueil.getSelectedRow();
            int id = (int)tb_accueil.getValueAt(index,0);
            Secretaire at = new Secretaire(nom, prenom, sexe, telephone,adresse);
            adao.modifier(at, id);
            vider();
            liste_accueil();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        int index = tb_accueil.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_accueil.getValueAt(index,0);
            SecretaireDAO adao = new SecretaireDAO();
            adao.supprimer(id);
            vider();
            liste_accueil();

        }
    }//GEN-LAST:event_button4ActionPerformed

    private void txt_telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telephoneActionPerformed

    private void tb_accueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_accueilMouseClicked
 int index = tb_accueil.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_accueil.getValueAt(index,0);
            SecretaireDAO adao = new SecretaireDAO();
            Secretaire atu = adao.recherche(id);
            txt_nom.setText(atu.getNom());
            txt_prenom.setText(atu.getPrenom());
            txt_sexe.setSelectedItem(atu.getSexe()+"");
            txt_telephone.setText(atu.getTelephone()+"");
            txt_adresse.setText(atu.getAdresse()+"");
        }             // TODO add your handling code here:
    }//GEN-LAST:event_tb_accueilMouseClicked
private void liste_accueil() {
        SecretaireDAO adao = new SecretaireDAO();
        List<Secretaire> accueil = adao.liste();
        for (int i = 0; i < accueil.size(); i++) {
            ((DefaultTableModel) tb_accueil.getModel()).addRow(new Object[]{
                accueil.get(i).getIda(),
                accueil.get(i).getNom(),
                accueil.get(i).getPrenom(),
                accueil.get(i).getSexe(),
                accueil.get(i).getTelephone(),
                 accueil.get(i).getAdresse(),
               
            });
        }

    }
  public void vider() {
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_sexe.setSelectedItem("");
        txt_telephone.setText("");
        txt_adresse.setText("");
  
        DefaultTableModel model = (DefaultTableModel) tb_accueil.getModel();
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_accueil;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private combo_suggestion1.ComboBoxSuggestion txt_sexe;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
