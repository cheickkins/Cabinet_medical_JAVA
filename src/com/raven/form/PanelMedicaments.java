package com.raven.form;

import classe.medicament;
import com.raven.component.Form;
import com.raven.swing.scrollbar.ScrollBarCustom;
import dao.MedicamentDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelMedicaments extends Form {

    public PanelMedicaments() {
        initComponents();
        liste_medicament();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_libelle = new javax.swing.JTextField();
        txt_categorie = new javax.swing.JTextField();
        txt_prix = new javax.swing.JTextField();
        btn_enreigistrer = new com.raven.swing1.Button();
        btn_modifier = new com.raven.swing1.Button();
        btn_supprimer = new com.raven.swing1.Button();
        scroll = new javax.swing.JScrollPane();
        tb_medicament = new javaswingdev.swing.table.Table();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel1.setText("Libellé");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel2.setText("Categorie");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel3.setText("Prix");

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

        tb_medicament.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Libelle", "Categorie", "Prix"
            }
        ));
        tb_medicament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_medicamentMouseClicked(evt);
            }
        });
        scroll.setViewportView(tb_medicament);

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
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_libelle, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txt_libelle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enreigistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enreigistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enreigistrerActionPerformed
        MedicamentDAO mdao = new MedicamentDAO();
        String libelle = txt_libelle.getText();
        String categorie = txt_categorie.getText();
        String prix = txt_prix.getText();
        if (libelle.equals("") || categorie.equals("") || prix.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            medicament mt = new medicament(libelle, categorie, Integer.parseInt(prix));
            mdao.inserer(mt);
            vider();
            liste_medicament();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enreigistrerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        MedicamentDAO mdao = new MedicamentDAO();
        String libelle = txt_libelle.getText();
        String categorie = txt_categorie.getText();
        String prix = txt_prix.getText();

        if (libelle.equals("") || categorie.equals("") || prix.equals("")) {
            JOptionPane.showMessageDialog(this, "Veuillez renseigner tous les champs ");
        } else {
            int index = tb_medicament.getSelectedRow();
            int id = (int)tb_medicament.getValueAt(index,0);
            medicament mt = new medicament(libelle, categorie,Integer.parseInt(prix));
            mdao.modifier(mt, id);
            vider();
            liste_medicament();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_medicament.getSelectedRow();
        if (index==-1){
            JOptionPane.showMessageDialog(this,"Veuillez selectionnez une ligne");
        }
        else {
            int id = (int)tb_medicament.getValueAt(index,0);
            MedicamentDAO mdao = new MedicamentDAO();
            mdao.supprimer(id);
            vider();
            liste_medicament();

        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void tb_medicamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_medicamentMouseClicked
 int index = tb_medicament.getSelectedRow();
        if (index!=-1){
          int id = (int)tb_medicament.getValueAt(index,0);
            MedicamentDAO mdao = new MedicamentDAO();
            medicament mtu = mdao.recherche(id);
            txt_libelle.setText(mtu.getLibelle());
            txt_categorie.setText(mtu.getCategorie());
            txt_prix.setText(mtu.getPrix()+"");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tb_medicamentMouseClicked
  private void liste_medicament() {
        MedicamentDAO mdao = new MedicamentDAO();
        List<medicament> medicament = mdao.liste();
        for (int i = 0; i < medicament.size(); i++) {
            ((DefaultTableModel) tb_medicament.getModel()).addRow(new Object[]{
                medicament.get(i).getIdm(),
                medicament.get(i).getLibelle(),
                medicament.get(i).getCategorie(),
                medicament.get(i).getPrix(),
               
            });
        }

    }
  public void vider() {
        txt_libelle.setText("");
        txt_categorie.setText("");
        txt_prix.setText("");
  
        DefaultTableModel model = (DefaultTableModel) tb_medicament.getModel();
        int n = model.getRowCount();
        for (int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing1.Button btn_enreigistrer;
    private com.raven.swing1.Button btn_modifier;
    private com.raven.swing1.Button btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scroll;
    private javaswingdev.swing.table.Table tb_medicament;
    private javax.swing.JTextField txt_categorie;
    private javax.swing.JTextField txt_libelle;
    private javax.swing.JTextField txt_prix;
    // End of variables declaration//GEN-END:variables
}
