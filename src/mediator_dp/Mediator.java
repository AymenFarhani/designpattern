package mediator_dp;

public interface Mediator {
    void register(Colleague colleague);
    void sendMessage(Colleague colleague, String message);
}
