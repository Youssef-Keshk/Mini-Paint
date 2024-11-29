package Windows;

import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class ResizeCircleWindow extends javax.swing.JDialog {
    private final Map<String, Double> properties;
    
    public ResizeCircleWindow(Map<String, Double> properties) {
        this.properties = properties;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resizeCirclePanel = new java.awt.Panel();
        radiusLabel = new java.awt.Label();
        radiusTextField = new java.awt.TextField();
        resizeButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize Circle");
        setLocationByPlatform(true);
        setModal(true);

        resizeCirclePanel.setBackground(new java.awt.Color(204, 204, 204));

        radiusLabel.setAlignment(java.awt.Label.CENTER);
        radiusLabel.setBackground(new java.awt.Color(0, 0, 102));
        radiusLabel.setForeground(new java.awt.Color(255, 255, 255));
        radiusLabel.setText("Radius (cm)");

        radiusTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        radiusTextField.setForeground(java.awt.Color.lightGray);
        radiusTextField.setText("radius");
        radiusTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radiusTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                radiusTextFieldFocusLost(evt);
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

        javax.swing.GroupLayout resizeCirclePanelLayout = new javax.swing.GroupLayout(resizeCirclePanel);
        resizeCirclePanel.setLayout(resizeCirclePanelLayout);
        resizeCirclePanelLayout.setHorizontalGroup(
            resizeCirclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resizeCirclePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(radiusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(resizeCirclePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        resizeCirclePanelLayout.setVerticalGroup(
            resizeCirclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resizeCirclePanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(resizeCirclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiusTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resizeCirclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(resizeCirclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radiusTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiusTextFieldFocusGained
        if(radiusTextField.getText().equals("radius")) {
            radiusTextField.setText("");
            radiusTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_radiusTextFieldFocusGained

    private void radiusTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radiusTextFieldFocusLost
        if(radiusTextField.getText().isEmpty()) {
            radiusTextField.setText("radius");
            radiusTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_radiusTextFieldFocusLost

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        String radiusText = radiusTextField.getText();
        if(!(radiusText.matches("^[1-9]\\d*$"))) {
            JOptionPane.showMessageDialog(null, "Invalid radius!", "Error", JOptionPane.ERROR_MESSAGE);              
            return;
        }
        properties.put("radius", Double.valueOf(radiusText));
        dispose();
    }//GEN-LAST:event_resizeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label radiusLabel;
    private java.awt.TextField radiusTextField;
    private java.awt.Button resizeButton;
    private java.awt.Panel resizeCirclePanel;
    // End of variables declaration//GEN-END:variables
}
