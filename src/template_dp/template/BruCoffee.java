package template_dp.template;

public class BruCoffee extends Coffee{
    @Override
    protected void addCoffeePowder() {
        System.out.println("Adding Bru Coffee Powder!");
    }
    @Override
    protected void payForTheCoffee() {
        System.out.println("Pay the price of the Bru Coffee!");
    }
}



