package alexis.breuse.Condiment;

import alexis.breuse.Beverage.Beverage;

public class Milk extends BeverageCondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return "Milk " + beverage.getDescription();
    }
}
