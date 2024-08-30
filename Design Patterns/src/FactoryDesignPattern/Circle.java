package FactoryDesignPattern;

public class Circle implements Shape {

    int xPos, yPos, redius;

    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        redius = r;
        System.out.println("Constructor of Circle");
    }

    @Override
    public void draw() {

        System.out.println("draw() from Circle");

    }

    @Override
    public void fillColor() {

        System.out.println("fillColor() from Circle");

    }

}
