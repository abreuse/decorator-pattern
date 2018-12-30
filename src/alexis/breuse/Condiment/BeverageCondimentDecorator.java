package alexis.breuse.Condiment;

import alexis.breuse.Beverage.Beverage;

public abstract class BeverageCondimentDecorator extends Beverage {
    protected Beverage beverage;

    public BeverageCondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
