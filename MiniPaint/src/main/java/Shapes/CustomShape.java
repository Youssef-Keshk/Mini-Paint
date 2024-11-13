package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public interface CustomShape {
    public Point getPosition();
    public void setPosition(Point position);
    public Map<String, Double> getProperties();
    public void setProperties(Map<String, Double> properties);
    public Color getOutlineColor();
    public void setOutlineColor(Color color);
    public Color getFillColor();
    public void setFillColor(Color fillColor);
    public void draw(Graphics canvas);
}
