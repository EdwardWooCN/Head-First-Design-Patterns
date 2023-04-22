package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 22:14
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }
}
