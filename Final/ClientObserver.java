package Final;

public class ClientObserver implements ExhibitStateObserver {
    public void update(Exhibit exhibit, boolean isClosed, String event) {
        System.out.println("Exhibit: " + exhibit + " is closed: " + isClosed + " Event: " + event);
    }
}
