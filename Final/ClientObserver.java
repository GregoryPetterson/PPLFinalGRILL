package Final;

import Final.ZooAdmin.Exhibit;
import Final.ExhibitStateObserver;

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

    public void exhibitFactoryDecorator() {
        // initialize undecoratedExhibit
        Exhibit undecoratedExhibit;

        // create exhibit based on exhibit type
        if (exhibit == Exhibit.LION) {
            undecoratedExhibit = new Lion();
        } else if (exhibit == Exhibit.TIGER) {
            undecoratedExhibit = new Tiger();
        } else if (exhibit == Exhibit.BEAR) {
            undecoratedExhibit = new Bear();

        // open or close the exhibit based on isClosed
        if (isClosed) {
            undecoratedExhibit = new ClosedExhibit(undecoratedExhibit);
        } else {
            undecoratedExhibit = new OpenExhibit(undecoratedExhibit);
        }
        
        // decorate with event based on event variable 
        if (event = "Feeding") {
            undecoratedExhibit = new FeedingEvent(undecoratedExhibit);
        }
        if (event = "Cleaning") {
            undecoratedExhibit = new CleaningEvent(undecoratedExhibit);
        }
    }
}
}
