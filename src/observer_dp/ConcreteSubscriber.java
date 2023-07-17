package observer_dp;


public class ConcreteSubscriber implements Subscriber{
    @Override
    public void update(String videoTitle) {
        System.out.println("new Notification:'"+ videoTitle +"' video was added");
    }
}
