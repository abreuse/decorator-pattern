package alexis.breuse;

import alexis.breuse.Beverage.Beverage;
import alexis.breuse.Beverage.Expresso;
import alexis.breuse.Calculator.Calculator;
import alexis.breuse.AdvancedCalculator.PercentageCalculator;
import alexis.breuse.Condiment.Milk;
import alexis.breuse.Condiment.Mocha;

public class Main {

    public static void main(String[] args) {
	    Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" +beverage.cost());

        //decorating beverage with Milk and Mocha
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" +beverage.cost());

        //-------------------------------

        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(1,10));

        calculator = new PercentageCalculator(calculator);
        System.out.println(calculator.divide(1,10) + "%");
    }
}
