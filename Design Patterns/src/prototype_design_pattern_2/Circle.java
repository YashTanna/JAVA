package prototype_design_pattern_2;

public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Draw method from Circle");
    }
}
