package alexis.breuse.AdvancedCalculator;

import alexis.breuse.Calculator.Calculator;

public class PercentageCalculator extends ScientificCalculator {

    public PercentageCalculator(Calculator calculator) {
        super(calculator);
    }

    @Override
    public double divide(double n, double n2) {
        return super.divide(n, n2) * 100;
    }
}
