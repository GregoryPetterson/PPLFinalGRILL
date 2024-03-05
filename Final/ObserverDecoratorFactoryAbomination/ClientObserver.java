package Final.ObserverDecoratorFactoryAbomination;

import java.util.ArrayList;

import Final.ObserverDecoratorFactoryAbomination.ZooAdmin.EnumDec;
import Final.ObserverDecoratorFactoryAbomination.ZooAdmin.EnumExhibit;

public class ClientObserver {

    public Exhibit exhibit;
    public boolean isClosed;
    public String event;
    public ZooAdmin zooAdmin;

    public ClientObserver(ZooAdmin zooAdmin) {
        this.zooAdmin = zooAdmin;
        zooAdmin.registerObserver(this);
    }

    public void update(Exhibit exhibit, boolean isClosed, String event) {
        this.exhibit = exhibit;
        this.isClosed = isClosed;
        this.event = event;
        display();
    }



    public void exhibitFactoryDecorator(EnumExhibit exhibit, ArrayList<EnumDec> decorators) {
        // initialize decorator
        Exhibit decorator;

        // Create exhibit based on one of the exhibits a client subscribed to.
        if (exhibit == EnumExhibit.LION) {
            decorator = new Lion();
        } else if (exhibit == EnumExhibit.TIGER) {
            decorator = new Tiger();
        } else if (exhibit == EnumExhibit.BEAR) {
            decorator = new Bear();
        }

        // Decorate it accordingly based on what zooAdmin notified us about events.

        for (EnumDec dec : decorators) {

            // open or close the exhibit based on isClosed
            if (dec == EnumDec.CLOSED) {
                decorator = new ClosedExhibit(decorator);
            } else {
                if (dec == EnumDec.FEEDING) {
                    decorator = new FeedingEvent(decorator);
                }
                if (dec == EnumDec.SHOW) {
                    decorator = new CleaningEvent(decorator);
                }
            }

            // decorate with event based on event variable


        }
    }
}
