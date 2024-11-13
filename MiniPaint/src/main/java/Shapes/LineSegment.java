package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class LineSegment extends Shape {
    static int count = 1;
    final int id;
    
    public LineSegment(Point position, Map<String, Double> properties, Color outlineColor, Color fillColor) {
        super(position, properties, outlineColor, fillColor);
        id = count++;
    }

    @Override
    public void draw(Graphics canvas) {
        double angle = Math.toRadians(properties.get("angle"));
        int length = (int)properties.get("length").doubleValue();
        Point position2 = new Point();
        position2.x = (int) (position.x + length * Math.cos(angle));
        position2.y = (int)(position.y - length * Math.sin(angle));
        
        canvas.setColor(fillColor);
        canvas.drawLine(position.x, position.y, position2.x, position2.y);     
    }
    
    @Override
    public String toString() {
        return "Line Segment" + id;
    }
}
