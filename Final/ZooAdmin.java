package Final;

public class ZooAdmin {
    public enum Exhibit {LION, TIGER, BEAR}
    public Exhibit exhibit;
    public boolean isClosed;
    public String event;
    private List<zooClientObservers> observers;

    public ZooAdmin() {
        observers = new ArrayList<ExhibitStateObserver>();
    }
    
    public void notifyObservers() {
        for (zooClientObservers observer : observers) {
            observer.update(exhibit, isClosed, event);
        }
    }

    public void exhibitStateChanged() {
        notifyObservers();
    }

    public void setExhibitState(Exhibit exhibit, boolean isClosed, String event){
        this.exhibit = exhibit;
        this.isClosed = isClosed;
        this.event = event;
        exhibitStateChanged();
    }


    
}
