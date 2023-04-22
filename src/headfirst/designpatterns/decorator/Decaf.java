package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 22:09
 */
public class Decaf extends Beverage {

    public Decaf() {
        desc = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
