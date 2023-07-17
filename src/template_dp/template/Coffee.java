package template_dp.template;

public abstract class Coffee {
    public void prepareCoffee(){
        boilWater();
        addMilk();
        addSugar();
        addCoffeePowder();
        payForTheCoffee();
    }
    protected void boilWater() {
        System.out.println("Boiling Water!");
    }
    protected void addMilk() {
        System.out.println("Adding Milk!");
    }
    protected void addSugar() {
        System.out.println("Adding Sugar!");
    }
    protected abstract void addCoffeePowder();
    protected abstract void payForTheCoffee();
}


