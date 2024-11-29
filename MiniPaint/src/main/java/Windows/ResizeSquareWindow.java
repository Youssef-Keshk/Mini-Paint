package Windows;

import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class ResizeSquareWindow extends javax.swing.JDialog {
    private final Map<String, Double> properties;
    
    public ResizeSquareWindow(Map<String, Double> properties) {
        this.properties = properties;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resizeSquarePanel = new java.awt.Panel();
        sideLabel = new java.awt.Label();
        sideTextField = new java.awt.TextField();
        resizeButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize Square");
        setLocationByPlatform(true);
        setModal(true);

        resizeSquarePanel.setBackground(new java.awt.Color(204, 204, 204));

        sideLabel.setAlignment(java.awt.Label.CENTER);
        sideLabel.setBackground(new java.awt.Color(0, 0, 102));
        sideLabel.setForeground(new java.awt.Color(255, 255, 255));
        sideLabel.setText("Side (cm)");

        sideTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sideTextField.setForeground(java.awt.Color.lightGray);
        sideTextField.setText("side");
        sideTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sideTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sideTextFieldFocusLost(evt);
            }
        });

        resizeButton.setBackground(new java.awt.Color(0, 0, 102));
        resizeButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        resizeButton.setForeground(new java.awt.Color(204, 255, 255));
        resizeButton.setLabel("Resize");
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resizeSquarePanelLayout = new javax.swing.GroupLayout(resizeSquarePanel);
        resizeSquarePanel.setLayout(resizeSquarePanelLayout);
        resizeSquarePanelLayout.setHorizontalGroup(
            resizeSquarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resizeSquarePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resizeSquarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resizeSquarePanelLayout.createSequentialGroup()
                        .addComponent(resizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(resizeSquarePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(sideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(sideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        resizeSquarePanelLayout.setVerticalGroup(
            resizeSquarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resizeSquarePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(resizeSquarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeSquarePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeSquarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sideTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sideTextFieldFocusGained
        if(sideTextField.getText().equals("side")) {
            sideTextField.setText("");
            sideTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_sideTextFieldFocusGained

    private void sideTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sideTextFieldFocusLost
        if(sideTextField.getText().isEmpty()) {
            sideTextField.setText("side");
            sideTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_sideTextFieldFocusLost

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        String text = sideTextField.getText();
        if(!text.matches("^[1-9]\\d*$")) {
            JOptionPane.showMessageDialog(null, "Invalid side!", "Error", JOptionPane.ERROR_MESSAGE);              
            return;
        }
        properties.put("side", Double.valueOf(text));
        dispose();
    }//GEN-LAST:event_resizeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button resizeButton;
    private java.awt.Panel resizeSquarePanel;
    private java.awt.Label sideLabel;
    private java.awt.TextField sideTextField;
    // End of variables declaration//GEN-END:variables
}
