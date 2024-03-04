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
        System.out.println("Exhibit: " + exhibit + " is closed: " + isClosed + " Event: " + event);
    }
}
