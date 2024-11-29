package Windows;

import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class ResizeRectangleWindow extends javax.swing.JDialog {
    private final Map<String, Double> properties;
        
    public ResizeRectangleWindow(Map<String, Double> properties) {
        this.properties = properties;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resizeRectanglePanel = new java.awt.Panel();
        lengthLabel = new java.awt.Label();
        lengthTextField = new java.awt.TextField();
        widthTextField = new java.awt.TextField();
        widthLabel = new java.awt.Label();
        resizeButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize Rectangle");
        setLocationByPlatform(true);
        setModal(true);

        resizeRectanglePanel.setBackground(new java.awt.Color(204, 204, 204));

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

        widthTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        widthTextField.setForeground(java.awt.Color.lightGray);
        widthTextField.setText("width");
        widthTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                widthTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                widthTextFieldFocusLost(evt);
            }
        });

        widthLabel.setAlignment(java.awt.Label.CENTER);
        widthLabel.setBackground(new java.awt.Color(0, 0, 102));
        widthLabel.setForeground(new java.awt.Color(255, 255, 255));
        widthLabel.setText("Width (cm)");

        resizeButton.setBackground(new java.awt.Color(0, 0, 102));
        resizeButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        resizeButton.setForeground(new java.awt.Color(204, 255, 255));
        resizeButton.setLabel("Resize");
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resizeRectanglePanelLayout = new javax.swing.GroupLayout(resizeRectanglePanel);
        resizeRectanglePanel.setLayout(resizeRectanglePanelLayout);
        resizeRectanglePanelLayout.setHorizontalGroup(
            resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resizeRectanglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resizeRectanglePanelLayout.createSequentialGroup()
                        .addComponent(resizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(resizeRectanglePanelLayout.createSequentialGroup()
                        .addGroup(resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(widthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lengthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(widthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
        );
        resizeRectanglePanelLayout.setVerticalGroup(
            resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resizeRectanglePanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resizeRectanglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(widthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeRectanglePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeRectanglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void widthTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_widthTextFieldFocusGained
        if(widthTextField.getText().equals("width")) {
            widthTextField.setText("");
            widthTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_widthTextFieldFocusGained

    private void widthTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_widthTextFieldFocusLost
        if(widthTextField.getText().isEmpty()) {
            widthTextField.setText("width");
            widthTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_widthTextFieldFocusLost

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        String lengthText = lengthTextField.getText();
        String widthText = widthTextField.getText();
        if(!(lengthText.matches("^[1-9]\\d*$") && widthText.matches("^[1-9]\\d*$"))) {
            JOptionPane.showMessageDialog(null, "Invalid inputs!", "Error", JOptionPane.ERROR_MESSAGE);              
            return;
        }
        properties.put("length", Double.valueOf(lengthTextField.getText()));
        properties.put("width", Double.valueOf(widthTextField.getText()));
        dispose();
    }//GEN-LAST:event_resizeButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label lengthLabel;
    private java.awt.TextField lengthTextField;
    private java.awt.Button resizeButton;
    private java.awt.Panel resizeRectanglePanel;
    private java.awt.Label widthLabel;
    private java.awt.TextField widthTextField;
    // End of variables declaration//GEN-END:variables
}
