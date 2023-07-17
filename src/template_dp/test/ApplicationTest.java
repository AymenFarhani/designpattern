package template_dp.test;

import template_dp.template.BruCoffee;
import template_dp.template.Coffee;
import template_dp.template.NescafeCoffee;


public class ApplicationTest {
    public static void main(String[] args) {
        Coffee bruCoffee = new BruCoffee();
        bruCoffee.prepareCoffee();
        System.out.println("===============================");
        Coffee nescafeCoffee = new NescafeCoffee();
        nescafeCoffee.prepareCoffee();
    }
}
