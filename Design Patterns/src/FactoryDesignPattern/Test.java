package FactoryDesignPattern;

public class Test {
    
    public static void main(String[] args) {
        
        Canvas canvas = new Canvas();
        canvas.addNewShape("circle");
        canvas.addNewShape("rectangle");
        canvas.reDraw();

    }

}
