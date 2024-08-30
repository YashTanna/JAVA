package FactoryDesignPattern;

public class ShapeFactory {
    
    public static Shape getShape(String sourceType){

        switch (sourceType) {
            case "circle":
                return new Circle(10, 20, 30);  

            case "rectangle":
                return new Rectangle(20, 30);

        }

        return null;
    }

}
