package com.raven.form;

import classe.analyse;
import classe.infirmier;
import classe.patient;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.AnalyseDAO;
import dao.InfirmierDAO;
import dao.PatientDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import report.ReportFacture;

public class PanelAnalyse extends Form {

    public PanelAnalyse() {
        initComponents();
        combo_infirmier();
        combo_patient();
        liste_analyse();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_type = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_patient = new combo_suggestion1.ComboBoxSuggestion();
        txt_infirmier = new combo_suggestion1.ComboBoxSuggestion();
        btn_enreigistrer = new com.raven.swing1.Button();
        btn_modifier = new com.raven.swing1.Button();
        btn_supprimer = new com.raven.swing1.Button();
        scroll = new javax.swing.JScrollPane();
        tb_analyse = new javaswingdev.swing.table.Table();
        txt_montant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_imprimer = new com.raven.swing1.Button();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel1.setText("Infirmier");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel2.setText("Patient");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel3.setText("Type");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel4.setText("Date");

        txt_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patientActionPerformed(evt);
            }
        });

        txt_infirmier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_infirmierActionPerformed(evt);
            }
        });

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

        tb_analyse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Infirmier", "Patient", "Type", "Date", "Montant"
            }
        ));
        tb_analyse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_analyseMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_analyse);

        jLabel5.setText("Montant");

        btn_imprimer.setBackground(new java.awt.Color(255, 51, 51));
        btn_imprimer.setForeground(new java.awt.Color(255, 255, 255));
        btn_imprimer.setText("FACTURE");
        btn_imprimer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txt_infirmier, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_type, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scroll)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_montant, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6))
                        .addComponent(txt_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_infirmier, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txt_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txt_type, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_montant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patientActionPerformed

    private void txt_infirmierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_infirmierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_infirmierActionPerformed

    private void btn_enreigistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enreigistrerActionPerformed
        AnalyseDAO cdao = new AnalyseDAO();
         int indexfin=txt_infirmier.getSelectedItem().toString().indexOf(" ");
        String idi = txt_infirmier.getSelectedItem().toString().substring(0, indexfin);
        int indexfin1=txt_patient.getSelectedItem().toString().indexOf(" ");
        String idp = txt_patient.getSelectedItem().toString().substring(0, indexfin1);
        String type = txt_type.getText();
        Date date = txt_date.getDate();
         String montant = txt_montant.getText();
        if (idi.equals("") || idp.equals("") ||   type.equals("")|| date == null || montant.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            analyse ot = new analyse(Integer.parseInt(idi), Integer.parseInt(idp) ,type,date, Integer.parseInt(montant));
            cdao.inserer(ot);
            vider();
            liste_analyse();
        }
    }//GEN-LAST:event_btn_enreigistrerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        AnalyseDAO cdao = new AnalyseDAO();
         int indexfin=txt_infirmier.getSelectedItem().toString().indexOf(" ");
        String idi = txt_infirmier.getSelectedItem().toString().substring(0, indexfin);
        int indexfin1=txt_patient.getSelectedItem().toString().indexOf(" ");
        String idp = txt_patient.getSelectedItem().toString().substring(0, indexfin1);
       
        String type = txt_type.getText();
        Date date = txt_date.getDate();
 String montant = txt_montant.getText();
         if (idi.equals("") || idp.equals("") ||   type.equals("")|| date == null || montant.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_analyse.getSelectedRow();
            int id = (int)tb_analyse.getValueAt(index,0);
           analyse ot = new analyse(Integer.parseInt(idi), Integer.parseInt(idp) ,type,date,Integer.parseInt(montant));
            cdao.modifier(ot, id);
            vider();
            liste_analyse();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_analyse.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_analyse.getValueAt(index,0);
            AnalyseDAO cdao = new AnalyseDAO();
            cdao.supprimer(id);
            vider();
            liste_analyse();
            combo_infirmier();
            combo_patient();

        }
        }
        private void combo_infirmier() {
            InfirmierDAO idao = new InfirmierDAO();
            List<infirmier> infirmier = idao.liste();
            txt_infirmier.addItem("");
            for (int i = 0; i < infirmier.size(); i++) {
                txt_infirmier.addItem(infirmier.get(i).getIdi()+" "+infirmier.get(i).getNom()+" "+infirmier.get(i).getPrenom());
            }

        }
        private void combo_patient() {
            PatientDAO pdao = new PatientDAO();
            List<patient> patient = pdao.liste();
            txt_patient.addItem("");
            for (int i = 0; i < patient.size(); i++) {
                txt_patient.addItem(patient.get(i).getIdp()+" "+patient.get(i).getNom()+" "+patient.get(i).getPrenom());
            }

        }
        private void liste_analyse() {
            AnalyseDAO cdao = new AnalyseDAO();

            List<analyse> analyse = cdao.liste();
            for (int i = 0; i < analyse.size(); i++) {
                ((DefaultTableModel) tb_analyse.getModel()).addRow(new Object[]{
                    analyse.get(i).getIdana(),
                    analyse.get(i).getIdi(),
                    analyse.get(i).getIdp(),
                    analyse.get(i).getType(),
                    analyse.get(i).getDate(),
                    analyse.get(i).getMontant(),

                });
            }

        }
        public void vider() {
            
            txt_infirmier.setSelectedItem("");
           txt_patient.setSelectedItem("");
            txt_type.setText("");
            
            txt_date.setDate(null);
            txt_montant.setText("");
            DefaultTableModel model = (DefaultTableModel) tb_analyse.getModel();
            int n = model.getRowCount();
            for (int i = n - 1; i >= 0; --i) {
                model.removeRow(i);
            }

    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void tb_analyseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_analyseMouseClicked
        int index = tb_analyse.getSelectedRow();
        if (index!=-1){
            int id = (int)tb_analyse.getValueAt(index,0);
            AnalyseDAO udao = new AnalyseDAO();
            analyse etu = udao.recherche(id);
            
            InfirmierDAO idao = new InfirmierDAO();
            infirmier i=idao.recherche(etu.getIdi());
            txt_infirmier.setSelectedItem(i.getIdi()+" "+i.getNom()+" "+i.getPrenom());
PatientDAO pdao = new PatientDAO();
            patient p=pdao.recherche(etu.getIdp());
            txt_patient.setSelectedItem(p.getIdp()+" "+p.getNom()+" "+p.getPrenom());
            txt_type.setText(etu.getType());
            txt_date.setDate(etu.getDate());
            txt_montant.setText(etu.getMontant()+"");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_analyseMouseClicked

    private void btn_imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimerActionPerformed
        ReportFacture re = new ReportFacture();
        re.afficher_report();
    }//GEN-LAST:event_btn_imprimerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button btn_enreigistrer;
    private com.raven.swing1.Button btn_imprimer;
    private com.raven.swing1.Button btn_modifier;
    private com.raven.swing1.Button btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_analyse;
    private com.toedter.calendar.JDateChooser txt_date;
    private combo_suggestion1.ComboBoxSuggestion txt_infirmier;
    private javax.swing.JTextField txt_montant;
    private combo_suggestion1.ComboBoxSuggestion txt_patient;
    private javax.swing.JTextField txt_type;
    // End of variables declaration//GEN-END:variables
}
