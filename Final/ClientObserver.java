package Final;

import Final.ZooAdmin.Exhibit;

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
}
