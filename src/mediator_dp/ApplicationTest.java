package mediator_dp;

public class ApplicationTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague firstColleague = new FirstConcreteColleague("Colleague 1", mediator);
        Colleague secondColleague = new SecondConcreteColleague("Colleague 2", mediator);
        Colleague thirdColleague = new SecondConcreteColleague("Colleague 3", mediator);

        mediator.register(firstColleague);
        mediator.register(secondColleague);
        mediator.register(thirdColleague);

        firstColleague.sendMessage("I am First Colleague and I am in the right side!");
        System.out.println("==================================================================================");
        secondColleague.sendMessage( "I am Second Colleague and I am in the left side!");
    }
}
