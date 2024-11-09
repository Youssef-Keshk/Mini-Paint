package Windows;

import Shapes.Shape;
import java.util.ArrayList;

public interface DrawingEngine {
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    public ArrayList<Shape> getShapes();
    public void refresh();
    
}
