package mediator_dp;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private List<Colleague> colleagues;
    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }
    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }
    @Override
    public void sendMessage(Colleague ownerColleague, String message) {
        for (Colleague colleague:colleagues) {
            if(colleague != ownerColleague) {
                colleague.receiveMessage(message);
            }
        }
    }
}
