package Windows;

import java.util.*;
import java.io.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import javax.swing.*;
import Shapes.*;
import Backend.DataBaseHandler;


public class PaintWindow extends JFrame implements DrawingEngine{
    private final ArrayList<Shape> shapes;
    private Map<String, Integer> shapeCounts;
    
    public static void main(String[] args) {
        new PaintWindow();
    }

    public PaintWindow() {
        shapes = new ArrayList<>();
        shapeCounts = new HashMap<>();
        initShapesCount();
        initComponents();
        setVisible(true);
    }
    
    private void initShapesCount() {
        shapeCounts.put("Circle", 0);
        shapeCounts.put("Square", 0);
        shapeCounts.put("Rectangle", 0);
        shapeCounts.put("LineSegment", 0);
    }
    
    private void updateCount(Shape shape, int x) {
        if(x != 1 && x != -1)
            return;
        if(shape instanceof Circle)
            shapeCounts.put("Circle", shapeCounts.get("Circle") + x);
        else if(shape instanceof Square)
            shapeCounts.put("Square", shapeCounts.get("Square") + x);
        else if(shape instanceof Rectangle)
            shapeCounts.put("Rectangle", shapeCounts.get("Rectangle") + x);
        else if(shape instanceof LineSegment)
            shapeCounts.put("LineSegment", shapeCounts.get("LineSegment") + x);
    }
    
    private int getCount(Shape shape) {
        if(shape instanceof Circle)
            return shapeCounts.get("Circle");
        else if(shape instanceof Square)
            return shapeCounts.get("Square");
        else if(shape instanceof Rectangle)
            return shapeCounts.get("Rectangle");
        else if(shape instanceof LineSegment)
            return shapeCounts.get("LineSegment");        
        return 0;
    }

    @Override
    public void addShape(Shape shape) {
        updateCount(shape, 1);
        shapes.add(shape);
        selectShapeJComboBox.addItem(shape.toString() + getCount(shape));
        refresh();
    }
    
    public void addShape(ArrayList<Shape> shapes) {
        for(Shape shape : shapes)
            addShape(shape);
    }
    
    @Override
    public void removeShape(Shape shape) {
        updateCount(shape, -1);
        shapes.remove(shape);
        selectShapeJComboBox.removeItem((String)selectShapeJComboBox.getSelectedItem());
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
                for (Shape shape : shapes) {
                    shape.draw(g);
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
        moveButton = new java.awt.Button();
        resizeButton = new java.awt.Button();
        saveButton = new java.awt.Button();
        loadButton = new java.awt.Button();

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

        moveButton.setLabel("Move");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        resizeButton.setLabel("Resize");
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        saveButton.setLabel("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setLabel("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

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
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paintPanelLayout.createSequentialGroup()
                                .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addComponent(paintCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paintPanelLayout.createSequentialGroup()
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lineSegmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(selectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(selectShapeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(paintCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        circleButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int index = selectShapeJComboBox.getSelectedIndex();
        if(index == -1)
            return;
        Shape shape = shapes.get(index);
        removeShape(shape);
        refresh();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed
        int index = selectShapeJComboBox.getSelectedIndex();
        if(index == -1)
            return;
        Shape shape = shapes.get(index);
        if(!(shape instanceof LineSegment)) {
            Color outlineColor = colorChooser("Choose Outline Color");
            if(outlineColor != null)
                shape.setOutlineColor(outlineColor);
        }
        Color fillColor = colorChooser("Choose Fill Color");
        if(fillColor != null)
            shape.setFillColor(fillColor);
 
        refresh();
    }//GEN-LAST:event_colorizeButtonActionPerformed

    private void lineSegmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineSegmentButtonActionPerformed
        Point position = new Point();
        Map<String, Double> properties = new HashMap<>();
        new LineSegmentWindow(position, properties);
        Color color = colorChooser("Choose Fill Color.");
        if(color == null)
            color = Color.BLACK;
        
        LineSegment lineSegment = new LineSegment(position, properties, color, color);
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

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        int index = selectShapeJComboBox.getSelectedIndex();
        if(index == -1)
            return;
        Shape shape = shapes.get(index);
        Point position = new Point();
        new NewPositionWindow(position);
        shape.setPosition(position);
        refresh();
        
    }//GEN-LAST:event_moveButtonActionPerformed

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        Map<String, Double> properties = new HashMap<>();
        int index = selectShapeJComboBox.getSelectedIndex();
        if(index == -1)
            return;
        Shape shape = shapes.get(index);
        if(shape instanceof LineSegment)
            new ResizeLineSegmentWindow(properties);
        else if(shape instanceof Circle)
            new ResizeCircleWindow(properties);
        else if(shape instanceof Square)
            new ResizeSquareWindow(properties);
        else if(shape instanceof Rectangle)
            new ResizeRectangleWindow(properties);
        
        shape.setProperties(properties);
        refresh();

    }//GEN-LAST:event_resizeButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Save Shapes");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Shapes", "shape"));
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.getName().endsWith(".shape"))
                fileToSave = new File(fileToSave.getAbsolutePath() + ".shape");
            DataBaseHandler dbh = new DataBaseHandler(fileToSave.getAbsolutePath());
            try{
                dbh.saveShapes(shapes);
                JOptionPane.showMessageDialog(null, "Shapes have been saved successfuly", "Information", JOptionPane.INFORMATION_MESSAGE);
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, "Error saving shapes!", "Error", JOptionPane.ERROR_MESSAGE);              
            }
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Load Shapes");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Shapes", "shape"));
        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            DataBaseHandler dbh = new DataBaseHandler(fileToSave.getAbsolutePath());
            try{
                ArrayList<Shape> newShapes = dbh.loadShapes();
                addShape(newShapes);
                JOptionPane.showMessageDialog(null, "Shapes have been loaded successfuly", "Information", JOptionPane.INFORMATION_MESSAGE);
            } catch(IOException e) {
                JOptionPane.showMessageDialog(null, "Error loading shapes!", "Error", JOptionPane.ERROR_MESSAGE);              
            }
        }
    }//GEN-LAST:event_loadButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button RectangleButton;
    private java.awt.Button circleButton;
    private java.awt.Button colorizeButton;
    private java.awt.Button lineSegmentButton;
    private java.awt.Button loadButton;
    private java.awt.Button moveButton;
    private java.awt.Canvas paintCanvas;
    private java.awt.Panel paintPanel;
    private java.awt.Button removeButton;
    private java.awt.Button resizeButton;
    private java.awt.Button saveButton;
    private javax.swing.JComboBox<String> selectShapeJComboBox;
    private java.awt.Label selectShapeLabel;
    private java.awt.Button squareButton;
    // End of variables declaration//GEN-END:variables
}
