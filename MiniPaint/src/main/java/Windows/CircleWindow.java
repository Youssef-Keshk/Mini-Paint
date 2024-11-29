package Windows;

import java.awt.Point;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class CircleWindow extends javax.swing.JDialog {
    private final Point position;
    private final Map<String, Double> properties;
    
    public CircleWindow(Point position, Map<String, Double> properties) {
        this.position = position;
        this.properties = properties;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circlePanel = new java.awt.Panel();
        positionLabel = new java.awt.Label();
        radiusLabel = new java.awt.Label();
        xPositionTextField = new java.awt.TextField();
        yPositionTextField = new java.awt.TextField();
        radiusTextField = new java.awt.TextField();
        doneButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Circle");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setModal(true);

        circlePanel.setBackground(new java.awt.Color(204, 204, 204));

        positionLabel.setAlignment(java.awt.Label.CENTER);
        positionLabel.setBackground(new java.awt.Color(0, 0, 102));
        positionLabel.setForeground(new java.awt.Color(255, 255, 255));
        positionLabel.setText("Position");

        radiusLabel.setAlignment(java.awt.Label.CENTER);
        radiusLabel.setBackground(new java.awt.Color(0, 0, 102));
        radiusLabel.setForeground(new java.awt.Color(255, 255, 255));
        radiusLabel.setText("Radius (cm)");

        xPositionTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        xPositionTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        xPositionTextField.setForeground(java.awt.Color.lightGray);
        xPositionTextField.setText("X");
        xPositionTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xPositionTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                xPositionTextFieldFocusLost(evt);
            }
        });

        yPositionTextField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        yPositionTextField.setForeground(java.awt.Color.lightGray);
        yPositionTextField.setText("Y");
        yPositionTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yPositionTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yPositionTextFieldFocusLost(evt);
            }
        });

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

        doneButton.setBackground(new java.awt.Color(0, 0, 102));
        doneButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        doneButton.setForeground(new java.awt.Color(204, 255, 255));
        doneButton.setLabel("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circlePanelLayout = new javax.swing.GroupLayout(circlePanel);
        circlePanel.setLayout(circlePanelLayout);
        circlePanelLayout.setHorizontalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(circlePanelLayout.createSequentialGroup()
                        .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radiusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(circlePanelLayout.createSequentialGroup()
                                .addComponent(xPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(radiusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addComponent(doneButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        circlePanelLayout.setVerticalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radiusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xPositionTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xPositionTextFieldFocusGained
        if(xPositionTextField.getText().equals("X")) {
            xPositionTextField.setText("");
            xPositionTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_xPositionTextFieldFocusGained

    private void xPositionTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xPositionTextFieldFocusLost
        if(xPositionTextField.getText().isEmpty()) {
            xPositionTextField.setText("X");
            xPositionTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_xPositionTextFieldFocusLost

    private void yPositionTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yPositionTextFieldFocusGained
        if(yPositionTextField.getText().equals("Y")) {
            yPositionTextField.setText("");
            yPositionTextField.setForeground(Color.BLACK);
        } 
    }//GEN-LAST:event_yPositionTextFieldFocusGained

    private void yPositionTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yPositionTextFieldFocusLost
        if(yPositionTextField.getText().isEmpty()) {
            yPositionTextField.setText("Y");
            yPositionTextField.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_yPositionTextFieldFocusLost

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

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        String xText = xPositionTextField.getText();
        String yText = yPositionTextField.getText();
        String radiusText = radiusTextField.getText();
        if(!(xText.matches("^[1-9]\\d*$") && yText.matches("^[1-9]\\d*$") && radiusText.matches("^[1-9]\\d*$"))) {
            JOptionPane.showMessageDialog(null, "Invalid inputs!", "Error", JOptionPane.ERROR_MESSAGE);              
            return;
        }
        position.x = Integer.parseInt(xText);
        position.y = Integer.parseInt(yText);
        properties.put("radius", Double.valueOf(radiusText));
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel circlePanel;
    private java.awt.Button doneButton;
    private java.awt.Label positionLabel;
    private java.awt.Label radiusLabel;
    private java.awt.TextField radiusTextField;
    private java.awt.TextField xPositionTextField;
    private java.awt.TextField yPositionTextField;
    // End of variables declaration//GEN-END:variables
}
