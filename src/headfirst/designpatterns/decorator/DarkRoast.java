package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 22:04
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        desc = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
