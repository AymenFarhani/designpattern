package observer_dp;

public class YoutubeChannelNotification {
    public static void main(String[] args) {
        ConcreteSubject youtubeChannel = new ConcreteSubject();
        Subscriber subscriber1 = new ConcreteSubscriber();
        Subscriber subscriber2 = new ConcreteSubscriber();

        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);

        youtubeChannel.addVideo("Java Observer Design pattern Part 1");
        System.out.println("######################################################################");
        youtubeChannel.unsubscribe(subscriber2);
        youtubeChannel.addVideo("Java Observer Design pattern Part 2");
    }
}


