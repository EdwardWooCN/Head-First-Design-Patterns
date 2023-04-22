package src.headfirst.designpatterns.decorator;

/**
 * @author edward
 * @date 2023/4/22 09:24
 */
public abstract class Beverage {

    public enum SizeEnum {TALL, GRANDE, VENTI};

    SizeEnum size;

    String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "desc='" + getDesc() + '\'' +
                ", cost=$" + cost() +
                '}';
    }
}
