package FactoryDesignPattern;

public class Rectangle implements Shape {

    int length, height;

    public Rectangle(int x, int y) {
        length = x;
        height = y;
        System.out.println("Constructor of Rectangle");
    }

    @Override
    public void draw() {

        System.out.println("draw() from Rectangle");

    }

    @Override
    public void fillColor() {

        System.out.println("fillColor() from Rectangle");

    }

}
