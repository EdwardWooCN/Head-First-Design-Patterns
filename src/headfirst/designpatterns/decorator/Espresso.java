package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 09:29
 */
public class Espresso extends Beverage {

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
