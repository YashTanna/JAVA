package decorator_design_pattern;

public class Burger implements BreadItem{
    @Override
    public int cost() {
        return 40;
    }
}
