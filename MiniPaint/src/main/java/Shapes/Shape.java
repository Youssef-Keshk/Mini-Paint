package Shapes;

import java.util.Map;
import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    protected Point position;
    protected Map<String, Double> properties;
    protected Color outlineColor;
    protected Color fillColor;

    public Shape(Point position, Map<String, Double> properties, Color outlineColor, Color fillColor) {
        this.position = position;
        this.properties = properties;
        this.outlineColor = outlineColor;
        this.fillColor = fillColor;
    }
    

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Map<String, Double> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    public Color getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(Color color) {
        this.outlineColor = color;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    
    abstract public void draw(Graphics canvas);
}
