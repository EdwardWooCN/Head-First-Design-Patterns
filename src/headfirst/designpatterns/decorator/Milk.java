package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 22:10
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return super.desc + ", Milk";
    }
}
