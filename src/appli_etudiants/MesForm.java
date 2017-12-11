/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Kuroi-Tenshi
 */
public class MesForm extends javax.swing.JDialog {
    private MenuForm fenetre;
    private Personne info;
    /**
     * Creates new form AddXP
     */
    public MesForm(java.awt.Dialog parent, boolean modal, Personne gens) {
        super(parent, modal);
        initComponents();
        //positionnement au milieu de la fenetre parente
        this.setLocationRelativeTo(parent);
        //modal==true signifie que l'on ne peut pas revenir 
        //sur la precedente fenêtre dans fermer connexion
        this.setModal(true);
        //on stocke dans this.fenetre la référence vers la fenetre parente
        this.fenetre=(MenuForm)parent;
        //initialisation données de la page et du paramettre info
        
        this.info = gens;
        Connect.getConnect();
        try {
            ResultSet res = Connect.requete("Select * from cv_formation where id_utilisateur=" + info.getId());
            DefaultComboBoxModel box = (DefaultComboBoxModel) jComboBoxPerso.getModel();
            while (res.next()) {
                box.addElement(res.getString("annee"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAnnee = new javax.swing.JTextField();
        jTextFieldTitre = new javax.swing.JTextField();
        jButtonValide = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLieu = new javax.swing.JTextField();
        jComboBoxPerso = new javax.swing.JComboBox<>();
        jLabelId = new javax.swing.JLabel();
        jButtonSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout éxperience");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajout Formation");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Année :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Titre :");

        jTextFieldAnnee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jTextFieldTitre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButtonValide.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonValide.setText("Valider");
        jButtonValide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValideActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lieu :");

        jTextFieldLieu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jComboBoxPerso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBoxPerso.setModel(new DefaultComboBoxModel());
        jComboBoxPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPersoActionPerformed(evt);
            }
        });

        jLabelId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelId.setEnabled(false);

        jButtonSupprimer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAnnee)
                            .addComponent(jTextFieldTitre)
                            .addComponent(jTextFieldLieu)
                            .addComponent(jComboBoxPerso, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonValide, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitre, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLieu, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValide, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValideActionPerformed
        Integer id = Integer.parseInt(jLabelId.getText());
        String date = jTextFieldAnnee.getText();
        String titre = jTextFieldTitre.getText();
        String lieu = jTextFieldLieu.getText();
        Connect.requete2("update cv_formation set annee='"+date+"', libelle_formation='"+titre+"', lieu='"+lieu+"' where id_formation="+id);
        this.setVisible(false);       
        
    }//GEN-LAST:event_jButtonValideActionPerformed

    private void jComboBoxPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPersoActionPerformed
        try {
            ResultSet res = Connect.requete("Select * from cv_formation where annee='" + jComboBoxPerso.getSelectedItem() + "'");
            if (res.next()) {
                jTextFieldAnnee.setText(res.getString("annee"));
                jTextFieldTitre.setText(res.getString("libelle_formation"));
                jTextFieldLieu.setText(res.getString("lieu"));
                jLabelId.setText(res.getString("id_formation"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxPersoActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        Connect.requete2("delete from cv_formation where id_formation="+Integer.parseInt(jLabelId.getText()));
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MesForm dialog = new MesForm(new javax.swing.JDialog(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JButton jButtonValide;
    private javax.swing.JComboBox<String> jComboBoxPerso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JTextField jTextFieldAnnee;
    private javax.swing.JTextField jTextFieldLieu;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables
}