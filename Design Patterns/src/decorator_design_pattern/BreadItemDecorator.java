package decorator_design_pattern;

public class BreadItemDecorator implements BreadItem{

    protected BreadItem breadItem;

    BreadItemDecorator(BreadItem breadItem){
        this.breadItem = breadItem;
    }

    @Override
    public int cost() {
        return  breadItem.cost();
    }
}
