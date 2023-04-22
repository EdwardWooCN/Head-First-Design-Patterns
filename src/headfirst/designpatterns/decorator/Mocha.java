package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 09:32
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

}
