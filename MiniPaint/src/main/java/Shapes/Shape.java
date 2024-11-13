package Shapes;

import java.util.Map;
import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements CustomShape{
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
    

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Color getOutlineColor() {
        return outlineColor;
    }

    @Override
    public void setOutlineColor(Color color) {
        this.outlineColor = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    
    @Override
    abstract public void draw(Graphics canvas);
}
