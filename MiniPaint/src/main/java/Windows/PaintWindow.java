package Windows;

import java.util.*;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JColorChooser;
import Shapes.*;


public class PaintWindow extends JFrame implements DrawingEngine{
    private final ArrayList<Shape> shapes;

    public PaintWindow() {
        shapes = new ArrayList<>();
        initComponents();
        setVisible(true);
    }

    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        selectShapeJComboBox.addItem(shape.toString());
        refresh();
    }
    
    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
        selectShapeJComboBox.removeItem(shape.toString());
        refresh();
    }

    @Override
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void refresh() {
        paintCanvas.repaint();
    }
    
    
    private Color colorChooser(String text) {
        JColorChooser colorChooser = new JColorChooser();
        return JColorChooser.showDialog(this, text, Color.BLACK);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paintPanel = new java.awt.Panel();
        paintCanvas = new java.awt.Canvas(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                // Draw each shape on the canvas
                for (Shape shape : shapes) {
                    shape.draw(g); // Assume draw method accepts Graphics object
                }
            }
        };
        circleButton = new java.awt.Button();
        squareButton = new java.awt.Button();
        RectangleButton = new java.awt.Button();
        lineSegmentButton = new java.awt.Button();
        selectShapeLabel = new java.awt.Label();
        colorizeButton = new java.awt.Button();
        removeButton = new java.awt.Button();
        selectShapeJComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Drawing Application");
        setLocationByPlatform(true);

        paintPanel.setBackground(new java.awt.Color(204, 204, 204));

        paintCanvas.setBackground(new java.awt.Color(255, 255, 255));

        circleButton.setLabel("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        squareButton.setLabel("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        RectangleButton.setLabel("Rectangle");
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        lineSegmentButton.setLabel("Line");
        lineSegmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineSegmentButtonActionPerformed(evt);
            }
        });

        selectShapeLabel.setText("Select Shape");

        colorizeButton.setLabel("Colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        removeButton.setLabel("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        selectShapeJComboBox.setBackground(new java.awt.Color(153, 153, 153));
        selectShapeJComboBox.setMaximumRowCount(20);
        selectShapeJComboBox.setToolTipText("");

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintPanelLayout.createSequentialGroup()
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectShapeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paintPanelLayout.createSequentialGroup()
                                .addComponent(colorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paintPanelLayout.createSequentialGroup()
                                .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lineSegmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paintPanelLayout.createSequentialGroup()
                                .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(paintCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintPanelLayout.createSequentialGroup()
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lineSegmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RectangleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(selectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(selectShapeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paintCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        circleButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        Shape shape = shapes.get(selectShapeJComboBox.getSelectedIndex());
        removeShape(shape);
        refresh();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed
        Shape shape = shapes.get(selectShapeJComboBox.getSelectedIndex());
        Color outlineColor = colorChooser("Choose Outline Color");
        if(outlineColor == null)
            outlineColor = Color.BLACK;
        Color fillColor = colorChooser("Choose Fill Color");
        if(fillColor == null)
            fillColor = Color.BLACK;

        shape.setOutlineColor(outlineColor);
        shape.setFillColor(fillColor);
        refresh();
    }//GEN-LAST:event_colorizeButtonActionPerformed

    private void lineSegmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineSegmentButtonActionPerformed
        Point position = new Point();
        Map<String, Double> properties = new HashMap<>();
        new LineSegmentWindow(position, properties);
        Color outlineColor = colorChooser("Choose Outline Color");
        if(outlineColor == null)
        outlineColor = Color.BLACK;
        Color fillColor = colorChooser("Choose Fill Color");
        if(fillColor == null)
        fillColor = Color.BLACK;

        LineSegment lineSegment = new LineSegment(position, properties, outlineColor, fillColor);
        addShape(lineSegment);
    }//GEN-LAST:event_lineSegmentButtonActionPerformed

    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
        Point position = new Point();
        Map<String, Double> properties = new HashMap<>();
        new RectangleWindow(position, properties);
        Color outlineColor = colorChooser("Choose Outline Color.");
        if(outlineColor == null)
        outlineColor = Color.BLACK;
        Color fillColor = colorChooser("Choose Fill Color.");
        if(fillColor == null)
        fillColor = Color.BLACK;

        Rectangle rectangle = new Rectangle(position, properties, outlineColor, fillColor);
        addShape(rectangle);
    }//GEN-LAST:event_RectangleButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        Point position = new Point();
        Map<String, Double> properties = new HashMap<>();
        new SquareWindow(position, properties);
        Color outlineColor = colorChooser("Choose Outline Color");
        if(outlineColor == null)
        outlineColor = Color.BLACK;
        Color fillColor = colorChooser("Choose Fill Color.");
        if(fillColor == null)
        fillColor = Color.BLACK;

        Square square = new Square(position, properties, outlineColor, fillColor);
        addShape(square);
    }//GEN-LAST:event_squareButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        Point position = new Point();
        Map<String, Double> properties = new HashMap<>();
        new CircleWindow(position, properties);
        Color outlineColor = colorChooser("Choose Outline Color");
        if(outlineColor == null)
        outlineColor = Color.BLACK;
        Color fillColor = colorChooser("Choose Fill Color");
        if(fillColor == null)
        fillColor = Color.BLACK;

        Circle circle = new Circle(position, properties, outlineColor, fillColor);
        addShape(circle);
    }//GEN-LAST:event_circleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button RectangleButton;
    private java.awt.Button circleButton;
    private java.awt.Button colorizeButton;
    private java.awt.Button lineSegmentButton;
    private java.awt.Canvas paintCanvas;
    private java.awt.Panel paintPanel;
    private java.awt.Button removeButton;
    private javax.swing.JComboBox<String> selectShapeJComboBox;
    private java.awt.Label selectShapeLabel;
    private java.awt.Button squareButton;
    // End of variables declaration//GEN-END:variables
}
