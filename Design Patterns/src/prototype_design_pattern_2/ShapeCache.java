package prototype_design_pattern_2;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String,Shape> shapeMap = new HashMap<>();
    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape)shape.clone();
    }

    public static void loadShape(){
        System.out.println("Starting object creation and caching");
        Shape circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Shape rec = new Rectangle();
        rec.setId("2");
        shapeMap.put(rec.getId(),rec);
        System.out.println("Object creation and caching is compleyted");
    }
}
