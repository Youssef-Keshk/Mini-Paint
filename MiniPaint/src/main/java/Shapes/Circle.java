package Shapes;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.util.Map;

public class Circle extends Shape {
    private static final long serialVersionUID = 1L;
    
    public Circle(Point position, Map<String, Double> properties, Color color, Color fillColor) {
        super(position, properties, color, fillColor);
    }

    @Override
    public void draw(Graphics canvas) {
        int radius = (int)(properties.get("radius").doubleValue());
        canvas.setColor(fillColor);
        canvas.fillOval(position.x, position.y, radius*2, radius*2);
        canvas.setColor(outlineColor);
        canvas.drawOval(position.x, position.y, radius*2, radius*2);      
    }

    @Override
    public String toString() {
        return "Circle";
    }
    
    
}
