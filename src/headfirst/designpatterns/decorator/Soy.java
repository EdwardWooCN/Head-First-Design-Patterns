package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 22:12
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return soyCost() + beverage.cost();
    }

    private double soyCost() {
        double cost = 0;
        switch (beverage.getSize()) {
            case TALL:
                cost = .10;
                break;
            case GRANDE:
                cost = .15;
                break;
            case VENTI:
                cost = .20;
                break;
            default:
                throw new IllegalStateException("not choose size of cup");
        }
        return cost;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }
}
