package alexis.breuse.Condiment;

import alexis.breuse.Beverage.Beverage;

public class Mocha extends BeverageCondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return "Mocha " + beverage.getDescription();
    }
}
