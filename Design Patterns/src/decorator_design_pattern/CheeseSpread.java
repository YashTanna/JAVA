package decorator_design_pattern;

public class CheeseSpread extends BreadItemDecorator{
    CheeseSpread(BreadItem breadItem) {
        super(breadItem);
    }

    @Override
    public int cost(){
        return breadItem.cost()+10;
    }
}
