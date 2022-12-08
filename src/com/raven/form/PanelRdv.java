package com.raven.form;

import classe.consultation;
import classe.medecin;
import classe.patient;
import classe.rdv;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.ConsultationDAO;
import dao.MedecinDAO;
import dao.PatientDAO;
import dao.RdvDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelRdv extends Form {

    public PanelRdv() {
        initComponents();
        liste_rdv();
        combo_medecin();
        combo_patient();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_enreigistrer = new com.raven.swing1.Button();
        btn_modifier = new com.raven.swing1.Button();
        btn_supprimer = new com.raven.swing1.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_medecin = new combo_suggestion1.ComboBoxSuggestion();
        txt_patient = new combo_suggestion1.ComboBoxSuggestion();
        txt_motif = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        scroll = new javax.swing.JScrollPane();
        tb_rdv = new javaswingdev.swing.table.Table();

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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel1.setText("Patient");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel2.setText("Medecin");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel3.setText("Motif");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel4.setText("Date");

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

        tb_rdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Patient", "Medecin", "Motif", "Date"
            }
        ));
        tb_rdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_rdvMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_rdv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1672, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(31, 31, 31)
                                        .addComponent(txt_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_medecin, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_medecin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enreigistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enreigistrerActionPerformed
        RdvDAO cdao = new RdvDAO();
        int indexfin1=txt_patient.getSelectedItem().toString().indexOf(" ");
        String idp = txt_patient.getSelectedItem().toString().substring(0, indexfin1);
        int indexfin=txt_medecin.getSelectedItem().toString().indexOf(" ");
        String idmed = txt_medecin.getSelectedItem().toString().substring(0, indexfin);
        String motif = txt_motif.getText();
        Date date = txt_date.getDate();

        if (idp.equals("") || idmed.equals("") ||   motif.equals("")|| date == null) {
           JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
           //MedecinDAO mdao=new MedecinDAO();
            //medecin m=mdao.recherche(Integer.parseInt(idmed));
           // if(m.getNbrecons()>m.getCompteur()){
            rdv ot = new rdv(Integer.parseInt(idp), Integer.parseInt(idmed), motif ,date);
            cdao.inserer(ot);
            //int c=m.getCompteur()+1;
            //mdao.compteur(Integer.parseInt(idmed), c);
            vider();
            liste_rdv();
            //}else{
                //JOptionPane.showMessageDialog(this, "Medecin indisponible veuillez choir un autre ");
            }
    }//GEN-LAST:event_btn_enreigistrerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        RdvDAO cdao = new RdvDAO();
        int indexfin1=txt_patient.getSelectedItem().toString().indexOf(" ");
        String idp = txt_patient.getSelectedItem().toString().substring(0, indexfin1);
        int indexfin=txt_medecin.getSelectedItem().toString().indexOf(" ");
        String idmed = txt_medecin.getSelectedItem().toString().substring(0, indexfin);
        String motif = txt_motif.getText();
        Date date = txt_date.getDate();

        if (idp.equals("") || idmed.equals("") ||   motif.equals("")|| date == null) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_rdv.getSelectedRow();
            int id = (int)tb_rdv.getValueAt(index,0);
            rdv ot = new rdv(Integer.parseInt(idp), Integer.parseInt(idmed) ,motif,date);
            cdao.modifier(ot, id);
            vider();
            liste_rdv();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_rdv.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
       else {
            int id = (int)tb_rdv.getValueAt(index,0);
            RdvDAO cdao = new RdvDAO();
            rdv con=cdao.recherche(id);
            MedecinDAO mdao=new MedecinDAO();
            medecin m=mdao.recherche(con.getIdmed());
            int c=m.getCompteur()-1;
            mdao.compteur(m.getIdmed(), c);
            cdao.supprimer(id);
            vider();
            liste_rdv();

        }
        }
        private void combo_medecin() {
            MedecinDAO mdao = new MedecinDAO();
            List<medecin> medecin = mdao.liste();
            txt_medecin.addItem("");
            for (int i = 0; i < medecin.size(); i++) {
                txt_medecin.addItem(medecin.get(i).getIdmed()+" "+medecin.get(i).getNom()+" "+medecin.get(i).getPrenom());
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
        private void liste_rdv() {
            RdvDAO cdao = new RdvDAO();

            List<rdv> rdv = cdao.liste();
            for (int i = 0; i < rdv.size(); i++) {
                ((DefaultTableModel) tb_rdv.getModel()).addRow(new Object[]{
                    rdv.get(i).getIdr(),
                    rdv.get(i).getIdp(),
                    rdv.get(i).getIdmed(),
                    rdv.get(i).getMotif(),
                    rdv.get(i).getDate(),

                });
            }

        }
        public void vider() {
            txt_patient.setSelectedItem("");
            txt_medecin.setSelectedItem("");
            txt_motif.setText("");
            txt_date.setDate(null);
            DefaultTableModel model = (DefaultTableModel) tb_rdv.getModel();
            int n = model.getRowCount();
            for (int i = n - 1; i >= 0; --i) {
                model.removeRow(i);
            }

            
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void txt_medecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medecinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medecinActionPerformed

    private void txt_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patientActionPerformed

    private void tb_rdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_rdvMouseClicked
int index = tb_rdv.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_rdv.getValueAt(index,0);
            RdvDAO udao = new RdvDAO();
            rdv etu = udao.recherche(id);
             PatientDAO pdao = new PatientDAO();
            patient p=pdao.recherche(etu.getIdp());
            txt_patient.setSelectedItem(p.getIdp()+" "+p.getNom()+" "+p.getPrenom());
            MedecinDAO mdao = new MedecinDAO();
            medecin m=mdao.recherche(etu.getIdmed());
            txt_medecin.setSelectedItem(m.getIdmed()+" "+m.getNom()+" "+m.getPrenom());
           
            txt_motif.setText(etu.getMotif());
             txt_date.setDate(etu.getDate());
           
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_rdvMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button btn_enreigistrer;
    private com.raven.swing1.Button btn_modifier;
    private com.raven.swing1.Button btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_rdv;
    private com.toedter.calendar.JDateChooser txt_date;
    private combo_suggestion1.ComboBoxSuggestion txt_medecin;
    private javax.swing.JTextField txt_motif;
    private combo_suggestion1.ComboBoxSuggestion txt_patient;
    // End of variables declaration//GEN-END:variables
}
