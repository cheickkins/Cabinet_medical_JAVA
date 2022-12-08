package com.raven.form;

import classe.consultation;
import classe.medecin;
import classe.patient;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.ConsultationDAO;
import dao.MedecinDAO;
import dao.PatientDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import report.ReportFacture;
import report.ReportOrdonnance;

public class PanelConsultation extends Form {

    public PanelConsultation() {
        initComponents();
        liste_consultation();
        combo_medecin();
        combo_patient();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_medecin = new combo_suggestion1.ComboBoxSuggestion();
        txt_patient = new combo_suggestion1.ComboBoxSuggestion();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_motif = new javax.swing.JTextField();
        txt_montant = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tb_consultation = new javaswingdev.swing.table.Table();
        btn_enreigistrer = new com.raven.swing1.Button();
        btn_modifier = new com.raven.swing1.Button();
        btn_supprimer = new com.raven.swing1.Button();
        btn_imprimer = new com.raven.swing1.Button();
        btn_imprimer1 = new com.raven.swing1.Button();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel1.setText("Medecin");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel2.setText("Patient");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel4.setText("Motif");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel5.setText("Montant");

        txt_medecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medecinActionPerformed(evt);
            }
        });

        txt_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patientActionPerformed(evt);
            }
        });

        txt_motif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_motifActionPerformed(evt);
            }
        });

        txt_montant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_montantActionPerformed(evt);
            }
        });

        tb_consultation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Medecin", "Patient", "date", "Motif", "Montant"
            }
        ));
        tb_consultation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_consultationMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_consultation);

        btn_enreigistrer.setBackground(new java.awt.Color(255, 51, 51));
        btn_enreigistrer.setForeground(new java.awt.Color(255, 255, 255));
        btn_enreigistrer.setText("ENREGISTRER");
        btn_enreigistrer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_enreigistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enreigistrerActionPerformed(evt);
            }
        });

        btn_modifier.setBackground(new java.awt.Color(255, 51, 51));
        btn_modifier.setForeground(new java.awt.Color(255, 255, 255));
        btn_modifier.setText("MODIFIER");
        btn_modifier.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        btn_supprimer.setBackground(new java.awt.Color(255, 51, 51));
        btn_supprimer.setForeground(new java.awt.Color(255, 255, 255));
        btn_supprimer.setText("SUPPRIMER");
        btn_supprimer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        btn_imprimer.setBackground(new java.awt.Color(255, 51, 51));
        btn_imprimer.setForeground(new java.awt.Color(255, 255, 255));
        btn_imprimer.setText("ORDONNANCE");
        btn_imprimer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimerActionPerformed(evt);
            }
        });

        btn_imprimer1.setBackground(new java.awt.Color(255, 51, 51));
        btn_imprimer1.setForeground(new java.awt.Color(255, 255, 255));
        btn_imprimer1.setText("FACTURE");
        btn_imprimer1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_imprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_medecin, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_montant, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_imprimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txt_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_medecin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_montant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imprimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_medecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medecinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medecinActionPerformed

    private void txt_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patientActionPerformed

    private void btn_enreigistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enreigistrerActionPerformed
        ConsultationDAO cdao = new ConsultationDAO();
        int indexfin=txt_medecin.getSelectedItem().toString().indexOf(" ");
        String idmed = txt_medecin.getSelectedItem().toString().substring(0, indexfin);
         int indexfin1=txt_patient.getSelectedItem().toString().indexOf(" ");
        String idp = txt_patient.getSelectedItem().toString().substring(0, indexfin1);
        Date date = txt_date.getDate();
        String motif = txt_motif.getText();
        String montant = txt_montant.getText();

        if (idmed.equals("") || idp.equals("") || date == null  || motif.equals("")|| montant.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
//            MedecinDAO mdao=new MedecinDAO();
//            medecin m=mdao.recherche(Integer.parseInt(idmed));
//            if(m.getNbrecons()>m.getCompteur()){
 consultation ot = new consultation(Integer.parseInt(idmed), Integer.parseInt(idp), date ,motif,Integer.parseInt(montant));
 cdao.inserer(ot);
//            int c=m.getCompteur()+1;
//            mdao.compteur(Integer.parseInt(idmed), c);
             
            vider();
            liste_consultation();
//            }else{
//                JOptionPane.showMessageDialog(this, "Medecin indisponible ");
            }
        
    }//GEN-LAST:event_btn_enreigistrerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        ConsultationDAO cdao = new ConsultationDAO();
       int indexfin=txt_medecin.getSelectedItem().toString().indexOf(" ");
        String idmed = txt_medecin.getSelectedItem().toString().substring(0, indexfin);
         int indexfin1=txt_patient.getSelectedItem().toString().indexOf(" ");
        String idp = txt_patient.getSelectedItem().toString().substring(0, indexfin1);
        Date date = txt_date.getDate();
        String motif = txt_motif.getText();
        String montant = txt_montant.getText();
        if (idmed.equals("") || idp.equals("") || date == null  || motif.equals("")|| montant.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_consultation.getSelectedRow();
            int id = (int)tb_consultation.getValueAt(index,0);
            consultation ot = new consultation(Integer.parseInt(idmed), Integer.parseInt(idp), date ,motif,Integer.parseInt(montant));
            cdao.modifier(ot, id);
            vider();
            liste_consultation();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_consultation.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_consultation.getValueAt(index,0);
            ConsultationDAO cdao = new ConsultationDAO();
            consultation con=cdao.recherche(id);
            //  MedecinDAO mdao=new MedecinDAO();
           // medecin m=mdao.recherche(con.getIdmed());
            //int c=m.getCompteur()-1;
            //mdao.compteur(m.getIdmed(), c);
            cdao.supprimer(id);
            vider();
            
            liste_consultation();

        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void txt_montantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_montantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_montantActionPerformed

    private void txt_motifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_motifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motifActionPerformed

    private void tb_consultationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_consultationMouseClicked
int index = tb_consultation.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_consultation.getValueAt(index,0);
            ConsultationDAO udao = new ConsultationDAO();
            consultation etu = udao.recherche(id);
            MedecinDAO mdao = new MedecinDAO();
            medecin m = mdao.recherche(etu.getIdmed());
            txt_medecin.setSelectedItem(m.getIdmed()+" "+m.getNom()+" "+m.getPrenom());
            PatientDAO pdao = new PatientDAO();
             patient p = pdao.recherche(etu.getIdp());
            txt_patient.setSelectedItem(p.getIdp()+" "+p.getNom()+" "+p.getPrenom());
            txt_date.setDate(etu.getDate());
            txt_motif.setText(etu.getMotif());
            txt_montant.setText(etu.getMontant()+"");
           
        }      
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_consultationMouseClicked

    private void btn_imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimerActionPerformed
         ReportOrdonnance re = new ReportOrdonnance();
       re.afficher_report();
    }//GEN-LAST:event_btn_imprimerActionPerformed

    private void btn_imprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimer1ActionPerformed
        ReportFacture re = new ReportFacture();
       re.afficher_report();
    }//GEN-LAST:event_btn_imprimer1ActionPerformed
  private void combo_medecin() {
        MedecinDAO mdao = new MedecinDAO();
        List<medecin> medecin = mdao.liste();
        for (int i = 0; i < medecin.size(); i++) {
           txt_medecin.addItem(medecin.get(i).getIdmed()+" "+medecin.get(i).getNom()+" "+medecin.get(i).getPrenom());
        }

    }
       private void combo_patient() {
        PatientDAO pdao = new PatientDAO();
        List<patient> patient = pdao.liste();
        
        for (int i = 0; i < patient.size(); i++) {
           txt_patient.addItem(patient.get(i).getIdp()+" "+patient.get(i).getNom()+" "+patient.get(i).getPrenom());
        }

    }
     private void liste_consultation() {
        ConsultationDAO cdao = new ConsultationDAO();
        List<consultation> consultation = cdao.liste();
        for (int i = 0; i < consultation.size(); i++) {
            ((DefaultTableModel) tb_consultation.getModel()).addRow(new Object[]{
                consultation.get(i).getIdcons(),
                consultation.get(i).getIdmed(),
                consultation.get(i).getIdp(),
                consultation.get(i).getDate(),
                consultation.get(i).getMotif(),
                consultation.get(i).getMontant(),
              
            });
        }

    }
  public void vider() {
        txt_medecin.setSelectedItem("");
        txt_patient.setSelectedItem("");
        txt_date.setDate(null);
        txt_motif.setText("");
        txt_montant.setText("");
        DefaultTableModel model = (DefaultTableModel) tb_consultation.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button btn_enreigistrer;
    private com.raven.swing1.Button btn_imprimer;
    private com.raven.swing1.Button btn_imprimer1;
    private com.raven.swing1.Button btn_modifier;
    private com.raven.swing1.Button btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_consultation;
    private com.toedter.calendar.JDateChooser txt_date;
    private combo_suggestion1.ComboBoxSuggestion txt_medecin;
    private javax.swing.JTextField txt_montant;
    private javax.swing.JTextField txt_motif;
    private combo_suggestion1.ComboBoxSuggestion txt_patient;
    // End of variables declaration//GEN-END:variables
}
