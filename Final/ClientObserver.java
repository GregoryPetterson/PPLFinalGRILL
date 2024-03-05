package Final;

import Final.ZooAdmin.EnumExhibit;
import Final.ZooAdmin.EnumDec;
import Final.ExhibitStateObserver;
import java.util.ArrayList;

public class ClientObserver implements ExhibitStateObserver {

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

    public void display() {
        String isClosedString;
        if (isClosed) {
            isClosedString = "Exhibit is closed";
        } else {
            isClosedString = "Exhibit is open";
        }
        System.out.println("Exhibit: " + exhibit + "\n" + isClosedString + "\n" + "Event: " + event);
    }

    public void exhibitFactoryDecorator(EnumExhibit exhibit, ArrayList<EnumDec> decorators) {
        // initialize decorator
        Exhibit decorator;

        // create exhibit based on exhibit type
        if (exhibit == EnumExhibit.LION) {
            decorator = new Lion();
        } else if (exhibit == EnumExhibit.TIGER) {
            decorator = new Tiger();
        } else if (exhibit == EnumExhibit.BEAR) {
            decorator = new Bear();
        }

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
