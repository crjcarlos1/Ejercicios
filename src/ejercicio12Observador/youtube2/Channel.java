package ejercicio12Observador.youtube2;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ChannelObservable{
    private String name;
    private List<SubscriberObserver> subscriberObservers;

    public Channel(String name) {
        this.name = name;
        this.subscriberObservers=new ArrayList<>();
    }

    public void updateVideo(String title){
        notifySubscribers();
    }

    public void addSubscriber(SubscriberObserver subscriberObserver){
        subscriberObservers.add(subscriberObserver);
    }

    @Override
    public void notifySubscribers() {
        for (SubscriberObserver subscriberObserver : subscriberObservers) {
            subscriberObserver.updateSubscriber();
        }
    }

}
