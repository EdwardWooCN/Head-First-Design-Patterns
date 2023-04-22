package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 09:31
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        desc = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
