/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class VueReservation extends VueGenerique {

    /**
     * Creates new form VueReservation
     */
    public VueReservation() {
        initComponents();
    }
    
    public JLabel getjLabelGroupe() {
        return jLabelGroupe;
    }
    
    public JLabel getjLabelLieu() {
        return jLabelLieu;
    }
    
    public JLabel getjLabelDate() {
        return jLabelDate;
    }
    
    public JLabel getjLabelHeureDebut() {
        return jLabelHeureDebut;
    }
    
    public JLabel getjLabelHeureFin() {
        return jLabelHeureFin;
    }
    
    public JLabel getjLabelPlacesTotal() {
        return jLabelPlacesTotal;
    }
    
    public JLabel getjLabelPlacesRestantes() {
        return jLabelPlacesRestantes;
    }
    
    public JTextField getjTextFieldPlacesReserver() {
        return jTextFieldPlacesReserver;
    }
    
    public JButton getjButtonReserver() {
        return jButtonReserver;
    }
    
    public JButton getjButtonAnnuler() {
        return jButtonAnnuler;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitreGroupe = new javax.swing.JLabel();
        jLabelGroupe = new javax.swing.JLabel();
        jLabelTitreLieu = new javax.swing.JLabel();
        jLabelLieu = new javax.swing.JLabel();
        jLabelTitreDate = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTitreDebut = new javax.swing.JLabel();
        jLabelHeureDebut = new javax.swing.JLabel();
        jLabelTitreFin = new javax.swing.JLabel();
        jLabelHeureFin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonReserver = new javax.swing.JButton();
        jButtonAnnuler = new javax.swing.JButton();
        jLabelPlacesTotal = new javax.swing.JLabel();
        jLabelPlacesRestantes = new javax.swing.JLabel();
        jTextFieldPlacesReserver = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitreGroupe.setText("Groupe");
        jLabelTitreGroupe.setToolTipText("");

        jLabelGroupe.setText("jLabel1");

        jLabelTitreLieu.setText("Lieu");

        jLabelLieu.setText("jLabel1");

        jLabelTitreDate.setText("Date");

        jLabelDate.setText("jLabel1");

        jLabelTitreDebut.setText("Heure Debut");

        jLabelHeureDebut.setText("jLabel1");

        jLabelTitreFin.setText("Heure de fin");

        jLabelHeureFin.setText("jLabel1");

        jLabel1.setText("Places");

        jLabel2.setText("Total");

        jLabel3.setText("Restantes");

        jButtonReserver.setText("Réserver");

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jLabelPlacesTotal.setText("jLabel4");

        jLabelPlacesRestantes.setText("jLabel4");

        jTextFieldPlacesReserver.setText("0");
        jTextFieldPlacesReserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacesReserverActionPerformed(evt);
            }
        });

        jLabel4.setText("Réservation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitreGroupe)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabelGroupe)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLieu)
                            .addComponent(jLabelTitreLieu))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelPlacesTotal))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPlacesRestantes)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitreDate)
                            .addComponent(jLabelDate))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitreDebut)
                            .addComponent(jLabelHeureDebut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHeureFin)
                            .addComponent(jLabelTitreFin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAnnuler)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReserver))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPlacesReserver, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(36, 36, 36)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitreGroupe)
                    .addComponent(jLabelTitreLieu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGroupe)
                    .addComponent(jLabelLieu))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitreDate)
                    .addComponent(jLabelTitreDebut)
                    .addComponent(jLabelTitreFin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelHeureDebut)
                    .addComponent(jLabelHeureFin))
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlacesTotal)
                    .addComponent(jLabelPlacesRestantes)
                    .addComponent(jTextFieldPlacesReserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReserver)
                    .addComponent(jButtonAnnuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jTextFieldPlacesReserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacesReserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlacesReserverActionPerformed

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
            java.util.logging.Logger.getLogger(VueReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonReserver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelGroupe;
    private javax.swing.JLabel jLabelHeureDebut;
    private javax.swing.JLabel jLabelHeureFin;
    private javax.swing.JLabel jLabelLieu;
    private javax.swing.JLabel jLabelPlacesRestantes;
    private javax.swing.JLabel jLabelPlacesTotal;
    private javax.swing.JLabel jLabelTitreDate;
    private javax.swing.JLabel jLabelTitreDebut;
    private javax.swing.JLabel jLabelTitreFin;
    private javax.swing.JLabel jLabelTitreGroupe;
    private javax.swing.JLabel jLabelTitreLieu;
    private javax.swing.JTextField jTextFieldPlacesReserver;
    // End of variables declaration//GEN-END:variables
}
