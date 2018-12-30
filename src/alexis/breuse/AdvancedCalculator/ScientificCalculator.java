package alexis.breuse.AdvancedCalculator;

import alexis.breuse.Calculator.Calculator;

public class ScientificCalculator extends Calculator {
    protected Calculator calculator;

    public ScientificCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
