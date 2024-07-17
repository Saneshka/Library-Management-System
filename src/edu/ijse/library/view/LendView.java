/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.library.view;

import edu.ijse.library.controller.BookController;
import edu.ijse.library.controller.LendController;
import edu.ijse.library.controller.MemberController;
import edu.ijse.library.dto.BookDTO;
import edu.ijse.library.dto.LendDTO;
import edu.ijse.library.dto.MemberDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hirus
 */
public class LendView extends javax.swing.JFrame {

    private BookController bookController;
    private MemberController memberController;
    private LendController lendController;
    private ArrayList<LendDTO> lendDTOs = new ArrayList<>();

    /**
     * Creates new form LendView
     */
    public LendView() {
        initComponents();
        bookController = new BookController();
        memberController = new MemberController();
        lendController = new LendController();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblBookCode = new javax.swing.JLabel();
        txtBookCode = new javax.swing.JTextField();
        lblMemberCode = new javax.swing.JLabel();
        txtMemberCode = new javax.swing.JTextField();
        btnBookSearch = new javax.swing.JButton();
        btnMemberSearch = new javax.swing.JButton();
        lblBookData = new javax.swing.JLabel();
        lblMemberData = new javax.swing.JLabel();
        lblLendCode = new javax.swing.JLabel();
        txtLendCode = new javax.swing.JTextField();
        lblBorrowDate = new javax.swing.JLabel();
        txtBorrowDate = new javax.swing.JTextField();
        lblDueDate = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();
        btnLendBooks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLend = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Book Lending Management");

        lblBookCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBookCode.setText("Book Code");

        txtBookCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookCodeActionPerformed(evt);
            }
        });

        lblMemberCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMemberCode.setText("Member Code");

        txtMemberCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberCodeActionPerformed(evt);
            }
        });

        btnBookSearch.setText("Search");
        btnBookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookSearchActionPerformed(evt);
            }
        });

        btnMemberSearch.setText("Search");
        btnMemberSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberSearchActionPerformed(evt);
            }
        });

        lblBookData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBookData.setText("Book Data");

        lblMemberData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMemberData.setText("Member Data");

        lblLendCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLendCode.setText("Lend Code");

        txtLendCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLendCodeActionPerformed(evt);
            }
        });

        lblBorrowDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBorrowDate.setText("Borrow Date");

        txtBorrowDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorrowDateActionPerformed(evt);
            }
        });

        lblDueDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDueDate.setText("Due Date");

        txtDueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueDateActionPerformed(evt);
            }
        });

        btnLendBooks.setText("Lend Book");
        btnLendBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLendBooksActionPerformed(evt);
            }
        });

        tblLend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLendCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLendCode, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBookCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBookCode, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMemberCode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMemberCode, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBookSearch)
                                    .addComponent(btnMemberSearch))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBookData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMemberData, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLendBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblHeader)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLendCode)
                    .addComponent(txtLendCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMemberCode)
                            .addComponent(txtMemberCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemberSearch)
                            .addComponent(lblMemberData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBookCode)
                            .addComponent(txtBookCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBookSearch)
                            .addComponent(lblBookData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBorrowDate)
                            .addComponent(txtBorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDueDate)
                            .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnLendBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBookCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookCodeActionPerformed

    private void txtMemberCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberCodeActionPerformed

    private void btnBookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookSearchActionPerformed
        // TODO add your handling code here:
        searchBook();
    }//GEN-LAST:event_btnBookSearchActionPerformed

    private void btnMemberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberSearchActionPerformed
        // TODO add your handling code here:
        searchMember();
    }//GEN-LAST:event_btnMemberSearchActionPerformed

    private void txtLendCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLendCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLendCodeActionPerformed

    private void txtBorrowDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorrowDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBorrowDateActionPerformed

    private void txtDueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueDateActionPerformed

    private void btnLendBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLendBooksActionPerformed
        // TODO add your handling code here:
        lendBook();
    }//GEN-LAST:event_btnLendBooksActionPerformed

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
            java.util.logging.Logger.getLogger(LendView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LendView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LendView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LendView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LendView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookSearch;
    private javax.swing.JButton btnLendBooks;
    private javax.swing.JButton btnMemberSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBookCode;
    private javax.swing.JLabel lblBookData;
    private javax.swing.JLabel lblBorrowDate;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLendCode;
    private javax.swing.JLabel lblMemberCode;
    private javax.swing.JLabel lblMemberData;
    private javax.swing.JTable tblLend;
    private javax.swing.JTextField txtBookCode;
    private javax.swing.JTextField txtBorrowDate;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtLendCode;
    private javax.swing.JTextField txtMemberCode;
    // End of variables declaration//GEN-END:variables

    public void searchBook() {
        try {
            String bCode = txtBookCode.getText();
            BookDTO dto = bookController.get(bCode);
            if (dto != null) {
                lblBookData.setText(dto.getTitle() + " | " + dto.getAuthor());
            } else {
                lblBookData.setText("Book Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void searchMember() {
        try {
            String mCode = txtMemberCode.getText();
            MemberDTO dto = memberController.get(mCode);
            if (dto != null) {
                lblMemberData.setText(dto.getFirstName() + " " + dto.getLastName());
            } else {
                lblMemberData.setText("Member Not Found");
            }

        } catch (Exception e) {
        }
    }

    public void clearForm() {
        txtLendCode.setText("");
        txtMemberCode.setText("");
        txtBookCode.setText("");
        txtBorrowDate.setText("");
        txtDueDate.setText("");
    }

    public void lendBook() {
        try {
            BookDTO bookDTO = bookController.get(txtBookCode.getText());
            MemberDTO memberDTO = memberController.get(txtMemberCode.getText());
            LendDTO lendDTO = new LendDTO(txtLendCode.getText(), bookDTO.getBid(), memberDTO.getMid(), txtBorrowDate.getText(), txtDueDate.getText());
            String resp = lendController.save(lendDTO);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void loadTable() {
        try {
            String[] columns = {"Lend Code", "Book", "Member", "Lend Date", "Due Date", "Status"};

            DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tblLend.setModel(dtm);

            ArrayList<LendDTO> lendDTOs = lendController.getAll();

            for (LendDTO lendDTO : lendDTOs) {
                String status = "Pending";
                if (lendDTO.getFine() == 0.0) {
                    status = "Completed";
                }
                BookDTO bookDTO = bookController.getById(lendDTO.getBookId());
                MemberDTO memberDTO = memberController.getById(lendDTO.getMemberId());
                Object rowData[] = {lendDTO.getlCode(), bookDTO.getTitle(), memberDTO.getFirstName(), lendDTO.getBorrowDate(), lendDTO.getDueDate(), status};
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
        }
    }

}