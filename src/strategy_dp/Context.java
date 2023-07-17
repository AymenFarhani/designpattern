package strategy_dp;


public class Context {
    private DataRepository dataRepository;
    public Context(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }
    public void saveData(){
        dataRepository.saveData();
    }
}
