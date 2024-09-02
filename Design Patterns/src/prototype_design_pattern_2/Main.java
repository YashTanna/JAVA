package prototype_design_pattern_2;

public class Main {
    public static void main(String[] args) {

        ShapeCache.loadShape();
        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("Type : "+shape1.getType());
        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Type : "+shape2.getType());


    }
}
