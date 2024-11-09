package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Rectangle extends Shape {
    static int count = 1;
    final int id;
    
    public Rectangle(Point position, Map<String, Double> properties, Color color, Color fillColor) {
        super(position, properties, color, fillColor);
        id = count++;
    }
    
    @Override
    public void draw(Graphics canvas) {
        int length = (int)(properties.get("length").doubleValue());
        int width = (int)(properties.get("width").doubleValue());
        canvas.setColor(fillColor);
        canvas.fillRect(position.x, position.y, length, width);
        canvas.setColor(outlineColor);
        canvas.drawRect(position.x, position.y, length, width);      
    }   
    
    @Override
    public String toString() {
        return "Rectangle" + id;
    }
}
