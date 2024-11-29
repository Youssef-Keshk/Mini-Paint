package Windows;

import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class ResizeLineSegmentWindow extends javax.swing.JDialog {
    private final Map<String, Double> properties;
    
    public ResizeLineSegmentWindow(Map<String, Double> properties) {
        this.properties = properties;
        initComponents();
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resizeLinePanel = new java.awt.Panel();
        lengthLabel = new java.awt.Label();
        lengthTextField = new java.awt.TextField();
        angleTextField = new java.awt.TextField();
        angleLabel = new java.awt.Label();
        resizeButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize Line");
        setLocationByPlatform(true);
        setModal(true);

        resizeLinePanel.setBackground(new java.awt.Color(204, 204, 204));

        lengthLabel.setAlignment(java.awt.Label.CENTER);
        lengthLabel.setBackground(new java.awt.Color(0, 0, 102));
        lengthLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthLabel.setText("Length (cm)");

        lengthTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lengthTextField.setForeground(java.awt.Color.lightGray);
        lengthTextField.setText("length");
        lengthTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lengthTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lengthTextFieldFocusLost(evt);
            }
        });

        angleTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        angleTextField.setForeground(java.awt.Color.lightGray);
        angleTextField.setText("angle");
        angleTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                angleTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                angleTextFieldFocusLost(evt);
            }
        });

        angleLabel.setAlignment(java.awt.Label.CENTER);
        angleLabel.setBackground(new java.awt.Color(0, 0, 102));
        angleLabel.setForeground(new java.awt.Color(255, 255, 255));
        angleLabel.setText("Angle (deg)");

        resizeButton.setBackground(new java.awt.Color(0, 0, 102));
        resizeButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        resizeButton.setForeground(new java.awt.Color(204, 255, 255));
        resizeButton.setLabel("Resize");
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resizeLinePanelLayout = new javax.swing.GroupLayout(resizeLinePanel);
        resizeLinePanel.setLayout(resizeLinePanelLayout);
        resizeLinePanelLayout.setHorizontalGroup(
            resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resizeLinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resizeLinePanelLayout.createSequentialGroup()
                        .addComponent(resizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(resizeLinePanelLayout.createSequentialGroup()
                        .addGroup(resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(angleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resizeLinePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(angleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(resizeLinePanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        resizeLinePanelLayout.setVerticalGroup(
            resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resizeLinePanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resizeLinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(angleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeLinePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeLinePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lengthTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lengthTextFieldFocusGained
        if(lengthTextField.getText().equals("length")) {
            lengthTextField.setText("");
            lengthTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lengthTextFieldFocusGained

    private void lengthTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lengthTextFieldFocusLost
        if(lengthTextField.getText().isEmpty()) {
            lengthTextField.setText("length");
            lengthTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_lengthTextFieldFocusLost

    private void angleTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_angleTextFieldFocusGained
        if(angleTextField.getText().equals("angle")) {
            angleTextField.setText("");
            angleTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_angleTextFieldFocusGained

    private void angleTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_angleTextFieldFocusLost
        if(angleTextField.getText().isEmpty()) {
            angleTextField.setText("angle");
            angleTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_angleTextFieldFocusLost

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        String lengthText = lengthTextField.getText();
        String angleText = angleTextField.getText();
        if(!(lengthText.matches("^[1-9]\\d*$") && angleText.matches("^[0-9]\\d*$"))) {
            JOptionPane.showMessageDialog(null, "Invalid inputs!", "Error", JOptionPane.ERROR_MESSAGE);              
            return;
        }
        properties.put("length", Double.valueOf(lengthTextField.getText()));
        properties.put("angle", Double.valueOf(angleTextField.getText()));
        dispose();
    }//GEN-LAST:event_resizeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label angleLabel;
    private java.awt.TextField angleTextField;
    private java.awt.Label lengthLabel;
    private java.awt.TextField lengthTextField;
    private java.awt.Button resizeButton;
    private java.awt.Panel resizeLinePanel;
    // End of variables declaration//GEN-END:variables
}
