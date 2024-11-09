package Windows;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

public class RectangleWindow extends javax.swing.JDialog {
    Point position;
    Map<String, Double> properties;
    
    public RectangleWindow(Point position, Map<String, Double> properties) {
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
        lengthLabel = new java.awt.Label();
        xPositionTextField = new java.awt.TextField();
        yPositionTextField = new java.awt.TextField();
        lengthTextField = new java.awt.TextField();
        widthTextField = new java.awt.TextField();
        widthLabel = new java.awt.Label();
        doneButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rectangle");
        setLocationByPlatform(true);
        setModal(true);

        circlePanel.setBackground(new java.awt.Color(204, 204, 204));

        positionLabel.setAlignment(java.awt.Label.CENTER);
        positionLabel.setBackground(new java.awt.Color(0, 0, 102));
        positionLabel.setForeground(new java.awt.Color(255, 255, 255));
        positionLabel.setText("Position");

        lengthLabel.setAlignment(java.awt.Label.CENTER);
        lengthLabel.setBackground(new java.awt.Color(0, 0, 102));
        lengthLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthLabel.setText("Length (cm)");

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
                        .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(circlePanelLayout.createSequentialGroup()
                        .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(widthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(circlePanelLayout.createSequentialGroup()
                                .addComponent(xPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yPositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(widthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lengthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGap(10, 10, 10))))
        );
        circlePanelLayout.setVerticalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xPositionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(positionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lengthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(widthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(widthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(circlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(circlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
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

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        position.x = Integer.parseInt(xPositionTextField.getText());
        position.y = Integer.parseInt(yPositionTextField.getText());
        properties.put("length", Double.valueOf(lengthTextField.getText()));
        properties.put("width", Double.valueOf(widthTextField.getText()));
        dispose();
    }//GEN-LAST:event_doneButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel circlePanel;
    private java.awt.Button doneButton;
    private java.awt.Label lengthLabel;
    private java.awt.TextField lengthTextField;
    private java.awt.Label positionLabel;
    private java.awt.Label widthLabel;
    private java.awt.TextField widthTextField;
    private java.awt.TextField xPositionTextField;
    private java.awt.TextField yPositionTextField;
    // End of variables declaration//GEN-END:variables
}