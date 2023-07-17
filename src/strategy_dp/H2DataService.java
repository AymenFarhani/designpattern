package strategy_dp;

public class H2DataService implements DataRepository{
    @Override
    public void saveData() {
        System.out.println("Save data in H2 database!");
    }
}
