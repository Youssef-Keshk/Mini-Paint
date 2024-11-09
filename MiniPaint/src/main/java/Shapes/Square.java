package Shapes;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.util.Map;

public class Square extends Shape {
    static int count = 1;
    final int id;
    
    public Square(Point position, Map<String, Double> properties, Color color, Color fillColor) {
        super(position, properties, color, fillColor);
        id = count++;
    }
    
    @Override
    public void draw(Graphics canvas) {
        int side = (int)(properties.get("side").doubleValue());
        canvas.setColor(fillColor);
        canvas.fillRect(position.x, position.y, side, side);
        canvas.setColor(outlineColor);
        canvas.drawRect(position.x, position.y, side, side);      
    }
    
    @Override
    public String toString() {
        return "Square" + id;
    }
}
