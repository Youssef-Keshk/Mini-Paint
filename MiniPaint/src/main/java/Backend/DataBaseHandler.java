package Backend;

import Shapes.*;
import java.io.*;
import java.util.ArrayList;

public class DataBaseHandler {
    private final String path;
    
    public DataBaseHandler(String path) {
        this.path = path;
    }
    
     public void saveShapes(ArrayList<Shape> shapes) throws IOException {
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
         oos.writeObject(shapes);
     }
     
     @SuppressWarnings("unchecked")
     public ArrayList<Shape> loadShapes() throws IOException {         
         try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
             return (ArrayList<Shape>) ois.readObject(); // readObject() throws checked ClassNotFoundException
             
         }catch(ClassNotFoundException e) {
             return new ArrayList<>();
         }
     }
    
}
