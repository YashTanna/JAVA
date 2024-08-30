package FactoryDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {

    ArrayList<Shape> list = new ArrayList<Shape>();

    public void addNewShape(String shapeType){
        Shape shape = ShapeFactory.getShape(shapeType);
        list.add(shape);
    }

    public void reDraw(){
        Iterator<Shape> it = list.iterator();
        while(it.hasNext()){
            // Shape shape = it.next();
            // shape.draw();
            it.next().draw();
        }
    }
    
}
