package com.raven.form;

import classe.Utilisateur;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.UtilisateurDAO;
import static java.awt.image.ImageObserver.ABORT;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelUtilisateur extends Form {

    public PanelUtilisateur() {
        initComponents();
        liste_utilisateur();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_login = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_profil = new combo_suggestion1.ComboBoxSuggestion();
        button2 = new com.raven.swing1.Button();
        button3 = new com.raven.swing1.Button();
        button4 = new com.raven.swing1.Button();
        scroll = new javax.swing.JScrollPane();
        tb_utilisateur = new javaswingdev.swing.table.Table();

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nom");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Login");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Profil");

        txt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loginActionPerformed(evt);
            }
        });

        txt_profil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Utilisateur", "Administrateur" }));
        txt_profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_profilActionPerformed(evt);
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

        tb_utilisateur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nom", "Login", "Password", "Profil"
            }
        ));
        tb_utilisateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_utilisateurMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_utilisateur);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_profil, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 193, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_profil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loginActionPerformed

    private void txt_profilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_profilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_profilActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        UtilisateurDAO udao = new UtilisateurDAO();
        String nom = txt_nom.getText();
        String login = txt_login.getText();
        String password = txt_password.getText();
        String profil = txt_profil.getSelectedItem().toString();
        if (nom.equals("") || login.equals("") || password.equals("") || profil.equals("") ) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            Utilisateur ut = new Utilisateur(nom, login, password,profil);
            udao.inserer(ut);
            vider();
            liste_utilisateur();
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        UtilisateurDAO udao = new UtilisateurDAO();
        String nom = txt_nom.getText();
        String login = txt_login.getText();
        String password = txt_password.getText();
        String profil = txt_profil.getSelectedItem().toString();
        if (nom.equals("") || login.equals("") || password.equals("") || profil.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_utilisateur.getSelectedRow();
            int id = (int)tb_utilisateur.getValueAt(index,0);
            Utilisateur ut = new Utilisateur(nom, login, password,profil);
            udao.modifier(ut, id);
            vider();
            liste_utilisateur();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        int index = tb_utilisateur.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_utilisateur.getValueAt(index,0);
            UtilisateurDAO udao = new UtilisateurDAO();
            udao.supprimer(id);
            vider();
            liste_utilisateur();

        }
    }//GEN-LAST:event_button4ActionPerformed

    private void tb_utilisateurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_utilisateurMouseClicked
 int index = tb_utilisateur.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_utilisateur.getValueAt(index,0);
            UtilisateurDAO udao = new UtilisateurDAO();
            Utilisateur etu = udao.recherche(id);
            txt_nom.setText(etu.getNom());
            txt_login.setText(etu.getLogin());
            txt_password.setText(etu.getPassword());
            txt_profil.setSelectedItem(etu.getProfil());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_utilisateurMouseClicked
 private void liste_utilisateur() {
        UtilisateurDAO udao = new UtilisateurDAO();
        List<Utilisateur> utilisateur = udao.liste();
        for (int i = 0; i < utilisateur.size(); i++) {
            ((DefaultTableModel) tb_utilisateur.getModel()).addRow(new Object[]{
                utilisateur.get(i).getIdu(),
                utilisateur.get(i).getNom(),
                utilisateur.get(i).getLogin(),
                utilisateur.get(i).getPassword(),
                utilisateur.get(i).getProfil(),
            });
        }

    }
  public void vider() {
        txt_nom.setText("");
        txt_login.setText("");
        txt_password.setText("");
        txt_profil.setSelectedItem("");
        DefaultTableModel model = (DefaultTableModel) tb_utilisateur.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button button2;
    private com.raven.swing1.Button button3;
    private com.raven.swing1.Button button4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_utilisateur;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_password;
    private combo_suggestion1.ComboBoxSuggestion txt_profil;
    // End of variables declaration//GEN-END:variables
}
