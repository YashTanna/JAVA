package decorator_design_pattern;

public class ButterSpread extends BreadItemDecorator{
    ButterSpread(BreadItem breadItem) {
        super(breadItem);
    }

    @Override
    public int cost(){
        return breadItem.cost()+5;
    }
}
