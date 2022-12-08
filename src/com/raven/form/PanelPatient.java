package com.raven.form;

import classe.Secretaire;
import classe.medecin;
import classe.patient;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.MedecinDAO;
import dao.PatientDAO;
import dao.SecretaireDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelPatient extends Form {

    public PanelPatient() {
        initComponents();
        liste_patient();
        combo_Secretaire();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        tb_patient = new javaswingdev.swing.table.Table();
        txt_sexe = new combo_suggestion1.ComboBoxSuggestion();
        btn_enreigistrer = new com.raven.swing1.Button();
        btn_supprimer = new com.raven.swing1.Button();
        btn_modifier = new com.raven.swing1.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_prenom = new javax.swing.JTextField();
        txt_adresse = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_secretaire = new combo_suggestion1.ComboBoxSuggestion();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_rechercher = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel2.setText("Age");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel3.setText("Prenom");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel4.setText("Sexe");

        tb_patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "secretaire", "Nom", "Prenom", "Age", "Sexe", "adresse", "date"
            }
        ));
        tb_patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_patientMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_patient);
        if (tb_patient.getColumnModel().getColumnCount() > 0) {
            tb_patient.getColumnModel().getColumn(4).setResizable(false);
            tb_patient.getColumnModel().getColumn(5).setResizable(false);
            tb_patient.getColumnModel().getColumn(6).setResizable(false);
            tb_patient.getColumnModel().getColumn(7).setResizable(false);
        }

        txt_sexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "      ", "Masculin", "Feminin" }));
        txt_sexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexeActionPerformed(evt);
            }
        });

        btn_enreigistrer.setForeground(new java.awt.Color(255, 255, 255));
        btn_enreigistrer.setText("ENREIGISTRER");
        btn_enreigistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enreigistrerActionPerformed(evt);
            }
        });

        btn_supprimer.setForeground(new java.awt.Color(255, 255, 255));
        btn_supprimer.setText("SUPPRIMER");
        btn_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_supprimerMouseClicked(evt);
            }
        });
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        btn_modifier.setForeground(new java.awt.Color(255, 255, 255));
        btn_modifier.setText("MODIFIER");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel5.setText("Secretaire");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel6.setText("Adresse");

        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        txt_secretaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_secretaireActionPerformed(evt);
            }
        });

        txt_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rechercherActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/rec.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel8.setText("Date d'enreigistrement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_secretaire, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1669, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_secretaire, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_sexe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexeActionPerformed

    private void btn_supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supprimerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimerMouseClicked

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_patient.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_patient.getValueAt(index,0);
            PatientDAO odao = new PatientDAO();
            odao.supprimer(id);
            vider();
            liste_patient();

        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
 PatientDAO odao = new PatientDAO();
  int indexfin1=txt_secretaire.getSelectedItem().toString().indexOf(" ");
        String ida = txt_secretaire.getSelectedItem().toString().substring(0, indexfin1);
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String age = txt_age.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
       String adresse = txt_adresse.getText();
       Date date = txt_date.getDate();

        if (ida.equals("") ||nom.equals("") || prenom.equals("") || age.equals("") || sexe.equals("")|| adresse.equals("")|| date==null) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_patient.getSelectedRow();
            int id = (int)tb_patient.getValueAt(index,0);
            patient pt = new patient(Integer.parseInt(ida),nom, prenom, Integer.parseInt(age), sexe,adresse,date);
            odao.modifier(pt, id);
            vider();
            liste_patient();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_enreigistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enreigistrerActionPerformed
PatientDAO pdao = new PatientDAO();
        int indexfin=txt_secretaire.getSelectedItem().toString().indexOf(" ");
        String ida = txt_secretaire.getSelectedItem().toString().substring(0, indexfin);
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String age = txt_age.getText();
        String sexe = txt_sexe.getSelectedItem().toString();
        String adresse = txt_adresse.getText();
       Date date = txt_date.getDate();
        if (ida.equals("") ||nom.equals("") || prenom.equals("") || age.equals("") || sexe.equals("")|| adresse.equals("")|| date==null) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
           patient pt = new patient(Integer.parseInt(ida),nom, prenom, Integer.parseInt(age), sexe,adresse,date);
            pdao.inserer(pt);
            vider();
            liste_patient();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enreigistrerActionPerformed

    private void tb_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_patientMouseClicked
int index = tb_patient.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_patient.getValueAt(index,0);
            PatientDAO pdao = new PatientDAO();
            patient ptu = pdao.recherche(id);
          SecretaireDAO sdao = new SecretaireDAO();
          Secretaire s =sdao.recherche(ptu.getIda());
           txt_secretaire.setSelectedItem(s.getIda()+" "+s.getNom()+" "+s.getPrenom());
           txt_nom.setText(ptu.getNom());
            txt_prenom.setText(ptu.getPrenom());
            txt_age.setText(ptu.getAge()+"");
            txt_sexe.setSelectedItem(ptu.getSexe()+"");
             txt_adresse.setText(ptu.getAdresse()+"");
              txt_date.setDate(ptu.getDate());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_patientMouseClicked

    private void txt_secretaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_secretaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_secretaireActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rechercherActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String n = txt_rechercher.getText();
        DefaultTableModel model = (DefaultTableModel) tb_patient.getModel();
        int n1 = model.getRowCount();
        for (int i = n1 - 1; i >= 0; --i) {
            model.removeRow(i);
        }
         PatientDAO pdao = new PatientDAO();
        List<patient> patient = pdao.recherche(n);
        for (int i = 0; i < patient.size(); i++) {
            ((DefaultTableModel) tb_patient.getModel()).addRow(new Object[]{
                patient.get(i).getIdp(),
                patient.get(i).getIda(),
                patient.get(i).getNom(),
                patient.get(i).getPrenom(),
                patient.get(i).getAge(),
                patient.get(i).getSexe(),
                patient.get(i).getAdresse(),
                patient.get(i).getDate(),
               
            });
        }
    }//GEN-LAST:event_jLabel7MouseClicked
  private void liste_patient() {
        PatientDAO pdao = new PatientDAO();
        List<patient> patient = pdao.liste();
        for (int i = 0; i < patient.size(); i++) {
            ((DefaultTableModel) tb_patient.getModel()).addRow(new Object[]{
                patient.get(i).getIdp(),
                patient.get(i).getIda(),
                patient.get(i).getNom(),
                patient.get(i).getPrenom(),
                patient.get(i).getAge(),
                patient.get(i).getSexe(),
                patient.get(i).getAdresse(),
                patient.get(i).getDate(),
               
            });
        }

    }
  public void vider() {
        txt_secretaire.setSelectedItem("");
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_age.setText("");
        txt_sexe.setSelectedIndex(0);
        txt_adresse.setText("");
        txt_date.setDate(null);
  
        DefaultTableModel model = (DefaultTableModel) tb_patient.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
  
  private void combo_Secretaire() {
            SecretaireDAO sdao = new SecretaireDAO();
        List<Secretaire> Secretaire = sdao.liste();
        txt_secretaire.addItem("");
        for (int i = 0; i < Secretaire.size(); i++) {
           txt_secretaire.addItem(Secretaire.get(i).getIda()+" "+Secretaire.get(i).getNom()+" "+Secretaire.get(i).getPrenom());
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button btn_enreigistrer;
    private com.raven.swing1.Button btn_modifier;
    private com.raven.swing1.Button btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_patient;
    private javax.swing.JTextField txt_adresse;
    private javax.swing.JTextField txt_age;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_rechercher;
    private combo_suggestion1.ComboBoxSuggestion txt_secretaire;
    private combo_suggestion1.ComboBoxSuggestion txt_sexe;
    // End of variables declaration//GEN-END:variables
}
