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
public class MesXp extends javax.swing.JDialog {

    private MenuXP fenetre;
    private Personne info;

    /**
     * Creates new form AddXP
     */
    public MesXp(java.awt.Dialog parent, boolean modal, Personne gens) {
        super(parent, modal);
        initComponents();
        //positionnement au milieu de la fenetre parente
        this.setLocationRelativeTo(parent);
        //modal==true signifie que l'on ne peut pas revenir 
        //sur la precedente fenêtre dans fermer connexion
        this.setModal(true);
        //on stocke dans this.fenetre la référence vers la fenetre parente
        this.fenetre = (MenuXP) parent;
        //initialisation données de la page et du paramettre info

        this.info = gens;
        Connect.getConnect();
        try {
            ResultSet res = Connect.requete("Select * from cv_experience_prof where id_utilisateur=" + info.getId());
            DefaultComboBoxModel box = (DefaultComboBoxModel) jComboBoxPerso.getModel();
            while (res.next()) {
                box.addElement(res.getString("titre_experience_prof"));
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
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldTitre = new javax.swing.JTextField();
        jButtonValide = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonAjoutList = new javax.swing.JButton();
        jButtonSupprList = new javax.swing.JButton();
        jButtonViderList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListActivite = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldActivite = new javax.swing.JTextField();
        jButtonModifDate = new javax.swing.JButton();
        jButtonModifTitre = new javax.swing.JButton();
        jComboBoxPerso = new javax.swing.JComboBox<>();
        jButtonSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout éxperience");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mes experience pro");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Titre :");

        jTextFieldDate.setEditable(false);
        jTextFieldDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jTextFieldTitre.setEditable(false);
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
        jLabel4.setText("Activité : ");

        jButtonAjoutList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAjoutList.setText("Ajouter");
        jButtonAjoutList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutListActionPerformed(evt);
            }
        });

        jButtonSupprList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonSupprList.setText("Effacer");
        jButtonSupprList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprListActionPerformed(evt);
            }
        });

        jButtonViderList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonViderList.setText("Vider");
        jButtonViderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViderListActionPerformed(evt);
            }
        });

        jListActivite.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jListActivite.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jListActivite);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("nouvelle activité :");

        jTextFieldActivite.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButtonModifDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonModifDate.setText("modifier");
        jButtonModifDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifDateActionPerformed(evt);
            }
        });

        jButtonModifTitre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonModifTitre.setText("modifier");
        jButtonModifTitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifTitreActionPerformed(evt);
            }
        });

        jComboBoxPerso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBoxPerso.setModel(new DefaultComboBoxModel());
        jComboBoxPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPersoActionPerformed(evt);
            }
        });

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldActivite))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTitre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonSupprList, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonViderList, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldDate)
                            .addComponent(jComboBoxPerso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModifTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifDate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 108, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButtonAjoutList, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonValide, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDate)
                        .addComponent(jButtonModifDate))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitre)
                    .addComponent(jButtonModifTitre))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSupprList)
                    .addComponent(jButtonViderList))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldActivite, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAjoutList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValide, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValideActionPerformed
        Integer id = info.getId();
        String date = jTextFieldDate.getText();
        String titre = jTextFieldTitre.getText();
        Connect.getConnect();
         ResultSet res = Connect.requete("select * from cv_experience_prof where titre_experience_prof='" + jComboBoxPerso.getSelectedItem() + "' and id_utilisateur = " + info.getId());
        try {
            if (res.next()) {
                Integer idp = res.getInt("id_experience_prof");
                Connect.requete2("update cv_experience_prof set date_experience_prof='"+date+"', titre_experience_prof='"+titre+"' where id_experience_prof="+idp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class.getName()).log(Level.SEVERE, null, ex);
        }        
        this.setVisible(false);

    }//GEN-LAST:event_jButtonValideActionPerformed

    private void jButtonAjoutListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutListActionPerformed
        DefaultListModel liste = (DefaultListModel) jListActivite.getModel();
        liste.addElement(jTextFieldActivite.getText());
        ResultSet res = Connect.requete("select * from cv_experience_prof where titre_experience_prof='" + jComboBoxPerso.getSelectedItem() + "' and id_utilisateur = " + info.getId());
        try {
            if (res.next()) {
                Integer idp = res.getInt("id_experience_prof");
                String donnee = jTextFieldActivite.getText();
                Connect.requete2("INSERT INTO cv_activite VALUES (" + idp + ", '" + donnee + "')");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldActivite.setText("");
    }//GEN-LAST:event_jButtonAjoutListActionPerformed

    private void jButtonSupprListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprListActionPerformed
        DefaultListModel liste = (DefaultListModel) jListActivite.getModel();
        String last = jListActivite.getSelectedValue();
        liste.remove(jListActivite.getSelectedIndex());
        Connect.requete2("delete from cv_activite where activite='" + last + "'");
    }//GEN-LAST:event_jButtonSupprListActionPerformed

    private void jButtonViderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViderListActionPerformed
        DefaultListModel liste = (DefaultListModel) jListActivite.getModel();
        liste.clear();
        ResultSet res = Connect.requete("select * from cv_experience_prof where titre_experience_prof='" + jComboBoxPerso.getSelectedItem() + "' and id_utilisateur = " + info.getId());
        try {
            if (res.next()) {
                Integer idp = res.getInt("id_experience_prof");
                Connect.requete2("delete from cv_activite where id_experience_prof="+idp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonViderListActionPerformed

    private void jButtonModifDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifDateActionPerformed
        jTextFieldDate.setEditable(true);
    }//GEN-LAST:event_jButtonModifDateActionPerformed

    private void jButtonModifTitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifTitreActionPerformed
        jTextFieldTitre.setEditable(true);
    }//GEN-LAST:event_jButtonModifTitreActionPerformed

    private void jComboBoxPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPersoActionPerformed
        try {
            ResultSet res = Connect.requete("Select * from cv_experience_prof where titre_experience_prof='" + jComboBoxPerso.getSelectedItem() + "'");
            if (res.next()) {
                jTextFieldDate.setText(res.getString("date_experience_prof"));
                jTextFieldTitre.setText(res.getString("titre_experience_prof"));
                Integer idxp = res.getInt("id_experience_prof");
                ResultSet res2 = Connect.requete("Select * from cv_activite where id_experience_prof=" + idxp);
                DefaultListModel liste = (DefaultListModel) jListActivite.getModel();
                liste.clear();
                while (res2.next()) {
                    liste.addElement(res2.getString("activite"));

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxPersoActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        ResultSet res = Connect.requete("select * from cv_experience_prof where titre_experience_prof='" + jComboBoxPerso.getSelectedItem() + "' and id_utilisateur = " + info.getId());
        try {
            if (res.next()) {
                Integer idp = res.getInt("id_experience_prof");
                Connect.requete2("delete from cv_experience_prof where id_experience_prof="+idp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesXp.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(MesXp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesXp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesXp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesXp.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MesXp dialog = new MesXp(new javax.swing.JDialog(), true, null);
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
    private javax.swing.JButton jButtonAjoutList;
    private javax.swing.JButton jButtonModifDate;
    private javax.swing.JButton jButtonModifTitre;
    private javax.swing.JButton jButtonSupprList;
    private javax.swing.JButton jButtonSupprimer;
    private javax.swing.JButton jButtonValide;
    private javax.swing.JButton jButtonViderList;
    private javax.swing.JComboBox<String> jComboBoxPerso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListActivite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldActivite;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldTitre;
    // End of variables declaration//GEN-END:variables
}
