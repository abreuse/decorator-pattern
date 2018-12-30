package alexis.breuse.Beverage;

public class Expresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }
}
