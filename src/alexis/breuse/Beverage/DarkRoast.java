package alexis.breuse.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return "DarkRoast";
    }
}
