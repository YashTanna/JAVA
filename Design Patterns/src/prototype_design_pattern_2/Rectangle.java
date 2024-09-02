package prototype_design_pattern_2;

public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Draw method from Rectangle");
    }
}
