package strategy_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Context firstContext = new Context(new PostgresDataService());
        firstContext.saveData();
        System.out.println("========================");
        Context secondContext = new Context(new H2DataService());
        secondContext.saveData();
    }
}
