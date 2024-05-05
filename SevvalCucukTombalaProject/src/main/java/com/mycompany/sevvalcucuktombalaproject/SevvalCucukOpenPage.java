/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sevvalcucuktombalaproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 90554
 */
public class SevvalCucukOpenPage extends javax.swing.JFrame {

    /**
     * Creates new form SevvalCucukOpenPage
     */
    public SevvalCucukOpenPage() {
        initComponents();
        playerCombo.addItem("1");
        playerCombo.addItem("2");
        playerCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updatePlayerBVisibility();
            }
        });

        updatePlayerBVisibility();

    }

    public void updatePlayerBVisibility() {
        if (playerCombo.getSelectedIndex() == 0) {
            playerBLabel.setVisible(false);
            playerBTextField.setVisible(false);
        } else if (playerCombo.getSelectedIndex() == 1) {
            playerBLabel.setVisible(true);
            playerBTextField.setVisible(true);
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

        welcomeLabel = new javax.swing.JLabel();
        playerLabel = new javax.swing.JLabel();
        playerCombo = new javax.swing.JComboBox<>();
        playerALAbel = new javax.swing.JLabel();
        playerBLabel = new javax.swing.JLabel();
        playerATextField = new javax.swing.JTextField();
        playerBTextField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        createCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        welcomeLabel.setText("WELCOME!");

        playerLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        playerLabel.setText("Number of Players:");

        playerCombo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        playerCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerComboActionPerformed(evt);
            }
        });

        playerALAbel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        playerALAbel.setText("Player A");

        playerBLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        playerBLabel.setText("Player B");

        playerATextField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        playerATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerATextFieldActionPerformed(evt);
            }
        });

        playerBTextField.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        startButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        createCheckBox.setText("I want to create my own card(s).");
        createCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerATextField)
                            .addComponent(playerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerALAbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerBTextField)
                            .addComponent(playerBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(startButton)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerLabel)
                    .addComponent(playerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerALAbel)
                    .addComponent(playerBLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerComboActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (playerCombo.getSelectedItem().toString().equals(Integer.toString(2))) {
            if (playerATextField.getText().length() > 0 && playerBTextField.getText().length() > 0) {
                if (createCheckBox.isSelected()) {
                    SevvalCucukCreateCardPage c = new SevvalCucukCreateCardPage(2);
                    c.setVisible(true);
                } else {
                    SevvalCucukGamePage g = new SevvalCucukGamePage(2);
                    g.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Fill all the blanks.", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (playerATextField.getText().length() > 0) {
                if (createCheckBox.isSelected()) {
                    SevvalCucukCreateCardPage c = new SevvalCucukCreateCardPage(1);
                    c.setVisible(true);
                } else {
                    SevvalCucukGamePage g = new SevvalCucukGamePage(1);
                    g.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Fill all the blanks.", "Dialog", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void createCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createCheckBoxActionPerformed

    private void playerATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerATextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerATextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SevvalCucukOpenPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SevvalCucukOpenPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SevvalCucukOpenPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SevvalCucukOpenPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SevvalCucukOpenPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox createCheckBox;
    private javax.swing.JLabel playerALAbel;
    private javax.swing.JTextField playerATextField;
    private javax.swing.JLabel playerBLabel;
    private javax.swing.JTextField playerBTextField;
    private javax.swing.JComboBox<String> playerCombo;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}