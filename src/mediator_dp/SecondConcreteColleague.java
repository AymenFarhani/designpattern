package mediator_dp;

public class SecondConcreteColleague implements Colleague {
    private String name;
    private Mediator mediator;
    public SecondConcreteColleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }
    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received the message: " + message);
    }
}
