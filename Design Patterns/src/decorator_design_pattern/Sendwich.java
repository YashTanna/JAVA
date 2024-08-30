package decorator_design_pattern;

public class Sendwich implements BreadItem{
    @Override
    public int cost() {
        return 30;
    }
}
