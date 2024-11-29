package Windows;

import java.awt.Point;
import java.awt.Color;
import javax.swing.JOptionPane;

public class NewPositionWindow extends javax.swing.JDialog {
    private final Point position;
    
    public NewPositionWindow(Point position) {
        this.position = position;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circlePanel = new java.awt.Panel();
        xPositionLabel = new java.awt.Label();
        yPositionLabel = new java.awt.Label();
        xPositionTextField = new java.awt.TextField();
        yPositionTextField = new java.awt.TextField();
        moveButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Move Shape");
        setLocationByPlatform(true);
        setModal(true);

        circlePanel.setBackground(new java.awt.Color(204, 204, 204));

        xPositionLabel.setAlignment(java.awt.Label.CENTER);
        xPositionLabel.setBackground(new java.awt.Color(0, 0, 102));
        xPositionLabel.setForeground(new java.awt.Color(255, 255, 255));
        xPositionLabel.setText("New X");

        yPositionLabel.setAlignment(java.awt.Label.CENTER);
        yPositionLabel.setBackground(new java.awt.Color(0, 0, 102));
        yPositionLabel.setForeground(new java.awt.Color(255, 255, 255));
        yPositionLabel.setText("New Y");

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

        moveButton.setBackground(new java.awt.Color(0, 0, 102));
        moveButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        moveButton.setForeground(new java.awt.Color(204, 255, 255));
        moveButton.setLabel("Move");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout circlePanelLayout = new javax.swing.GroupLayout(circlePanel);
        circlePanel.setLayout(circlePanelLayout);
        circlePanelLayout.setHorizontalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(circlePanelLayout.createSequentialGroup()
                        .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yPositionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xPositionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        circlePanelLayout.setVerticalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xPositionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yPositionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        String xText = xPositionTextField.getText();
        String yText = yPositionTextField.getText();
        if(!(xText.matches("^[1-9]\\d*$") && yText.matches("^[1-9]\\d*$"))) {
            JOptionPane.showMessageDialog(null, "Invalid inputs!", "Error", JOptionPane.ERROR_MESSAGE);              
            return;
        }
        position.x = Integer.parseInt(xPositionTextField.getText());
        position.y = Integer.parseInt(yPositionTextField.getText());
        dispose();
    }//GEN-LAST:event_moveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel circlePanel;
    private java.awt.Button moveButton;
    private java.awt.Label xPositionLabel;
    private java.awt.TextField xPositionTextField;
    private java.awt.Label yPositionLabel;
    private java.awt.TextField yPositionTextField;
    // End of variables declaration//GEN-END:variables
}
