package decorator_design_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Price of Sandwich : "+new Sendwich().cost());
        System.out.println("Price of Burger : "+new Burger().cost());
        System.out.println("Price of Sanwich with ButterSpread : "+new ButterSpread(new Sendwich()).cost());
        System.out.println("Price of Burger with ButterSpread : "+new ButterSpread(new Burger()).cost());
        System.out.println("Price of Sanwich with CheeseSpread : "+new CheeseSpread(new Sendwich()).cost());
        System.out.println("Price of Burger with CheeseSpread : "+new CheeseSpread(new Burger()).cost());
        BreadItem sanwich = new ButterSpread(new Sendwich());
        System.out.println("Price of Burger with Butter and Cheese Spread : "+new CheeseSpread(sanwich).cost());
        BreadItem burger = new ButterSpread(new Burger());
        System.out.println("Price of Burger with Butter and Cheese Spread : "+new CheeseSpread(burger).cost());

    }
}
