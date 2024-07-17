/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.library.view;

/**
 *
 * @author hirus
 */
public class MainMenuView extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuView
     */
    public MainMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMemberManagement = new javax.swing.JButton();
        btnUserManagement = new javax.swing.JButton();
        btnCategoryManagement = new javax.swing.JButton();
        btnBookManagement = new javax.swing.JButton();
        btnBookLendManagement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMemberManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMemberManagement.setText("Member Management");
        btnMemberManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberManagementActionPerformed(evt);
            }
        });

        btnUserManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUserManagement.setText("User Management");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });

        btnCategoryManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCategoryManagement.setText("Category Management");
        btnCategoryManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryManagementActionPerformed(evt);
            }
        });

        btnBookManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBookManagement.setText("Book Management");
        btnBookManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookManagementActionPerformed(evt);
            }
        });

        btnBookLendManagement.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBookLendManagement.setText("Lend Management");
        btnBookLendManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookLendManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMemberManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(btnUserManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCategoryManagement)
                            .addComponent(btnBookManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnBookLendManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMemberManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnBookLendManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoryManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryManagementActionPerformed
        // TODO add your handling code here:
        new CategoryView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCategoryManagementActionPerformed

    private void btnBookManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookManagementActionPerformed
        // TODO add your handling code here:
        new BookView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBookManagementActionPerformed

    private void btnMemberManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberManagementActionPerformed
        // TODO add your handling code here:
        new MemberView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMemberManagementActionPerformed

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        // TODO add your handling code here:
        new UserView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void btnBookLendManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookLendManagementActionPerformed
        // TODO add your handling code here:
        new LendView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBookLendManagementActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookLendManagement;
    private javax.swing.JButton btnBookManagement;
    private javax.swing.JButton btnCategoryManagement;
    private javax.swing.JButton btnMemberManagement;
    private javax.swing.JButton btnUserManagement;
    // End of variables declaration//GEN-END:variables
}
