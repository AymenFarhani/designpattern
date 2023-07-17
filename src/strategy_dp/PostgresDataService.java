package strategy_dp;

public class PostgresDataService implements DataRepository{
    @Override
    public void saveData() {
        System.out.println("Save data in Postgres database!");
    }
}
