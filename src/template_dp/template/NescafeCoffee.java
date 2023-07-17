package template_dp.template;

public class NescafeCoffee extends Coffee{
    @Override
    protected void addCoffeePowder() {
        System.out.println("Adding Nescafe Coffee Powder!");

    }
    @Override
    protected void payForTheCoffee() {
        System.out.println("Pay the price of the Nescafe Coffee!");
    }
}




