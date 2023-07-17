package observer_dp;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSubject implements YoutubeChannel{
    Set<Subscriber> subscribers= new HashSet<>();
    Set<String> videoTitles= new HashSet<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(String videoTitle) {
        for(Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }
    public void addVideo(String videoTitle) {
        videoTitles.add(videoTitle);
        notifySubscribers(videoTitle);
    }
}

