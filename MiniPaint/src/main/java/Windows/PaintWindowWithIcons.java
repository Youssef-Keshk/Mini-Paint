package Windows;

import java.util.*;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.ImageIcon;

import Shapes.*;

public class PaintWindowWithIcons extends JFrame implements DrawingEngine{
    private final ArrayList<Shape> shapes;
    
    public PaintWindowWithIcons() {
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
        selectShapeLabel = new java.awt.Label();
        colorizeButton = new java.awt.Button();
        removeButton = new java.awt.Button();
        selectShapeJComboBox = new javax.swing.JComboBox<>();
        circleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        lineSegmentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paintPanel.setBackground(new java.awt.Color(204, 204, 204));

        paintCanvas.setBackground(new java.awt.Color(255, 255, 255));

        selectShapeLabel.setText("Select Shape");

        colorizeButton.setBackground(new java.awt.Color(0, 0, 102));
        colorizeButton.setForeground(new java.awt.Color(255, 255, 255));
        colorizeButton.setLabel("Colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(0, 0, 102));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setLabel("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        selectShapeJComboBox.setBackground(new java.awt.Color(0, 0, 102));
        selectShapeJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        selectShapeJComboBox.setMaximumRowCount(20);
        selectShapeJComboBox.setToolTipText("");

        circleButton.setBackground(new java.awt.Color(204, 204, 204));
        circleButton.setForeground(new java.awt.Color(255, 255, 255));
        circleButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        squareButton.setBackground(new java.awt.Color(204, 204, 204));
        squareButton.setForeground(new java.awt.Color(255, 255, 255));
        squareButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        rectangleButton.setBackground(new java.awt.Color(204, 204, 204));
        rectangleButton.setForeground(new java.awt.Color(255, 255, 255));
        rectangleButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        lineSegmentButton.setBackground(new java.awt.Color(204, 204, 204));
        lineSegmentButton.setForeground(new java.awt.Color(255, 255, 255));
        lineSegmentButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 3, true));
        lineSegmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineSegmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintPanelLayout.createSequentialGroup()
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectShapeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paintPanelLayout.createSequentialGroup()
                                .addComponent(colorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lineSegmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paintPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(paintCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintPanelLayout.createSequentialGroup()
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(circleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(lineSegmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ImageIcon originalIcon = new ImageIcon("D:\\programming2 JAVA\\ASGMTS\\LAB6\\MiniPaint\\src\\main\\java\\resources\\circle.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Adjust width and height
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        circleButton.setIcon(scaledIcon);
        originalIcon = new ImageIcon("D:\\programming2 JAVA\\ASGMTS\\LAB6\\MiniPaint\\src\\main\\java\\resources\\square.png");
        scaledImage = originalIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Adjust width and height
        scaledIcon = new ImageIcon(scaledImage);
        squareButton.setIcon(scaledIcon);
        originalIcon = new ImageIcon("D:\\programming2 JAVA\\ASGMTS\\LAB6\\MiniPaint\\src\\main\\java\\resources\\rectangle.png");
        scaledImage = originalIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Adjust width and height
        scaledIcon = new ImageIcon(scaledImage);
        rectangleButton.setIcon(scaledIcon);
        originalIcon = new ImageIcon("D:\\programming2 JAVA\\ASGMTS\\LAB6\\MiniPaint\\src\\main\\java\\resources\\line.png");
        scaledImage = originalIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Adjust width and height
        scaledIcon = new ImageIcon(scaledImage);
        lineSegmentButton.setIcon(scaledIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        Shape shape = shapes.get(selectShapeJComboBox.getSelectedIndex());
        removeShape(shape);
        refresh();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
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
    }//GEN-LAST:event_rectangleButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circleButton;
    private java.awt.Button colorizeButton;
    private javax.swing.JButton lineSegmentButton;
    private java.awt.Canvas paintCanvas;
    private java.awt.Panel paintPanel;
    private javax.swing.JButton rectangleButton;
    private java.awt.Button removeButton;
    private javax.swing.JComboBox<String> selectShapeJComboBox;
    private java.awt.Label selectShapeLabel;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
