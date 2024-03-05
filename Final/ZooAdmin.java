package Final;

import java.util.*;

public class ZooAdmin {
    public enum EnumExhibit {LION, TIGER, BEAR}
    public enum EnumDec  {FEEDING, SHOW, CLOSED}
    public Exhibit exhibit;
    public boolean isClosed;
    public boolean feeding;

    public List<ExhibitStateObserver> observers;

    public ZooAdmin() {
        observers = new ArrayList<ExhibitStateObserver>();
    }

    public void registerObserver(ExhibitStateObserver o) {
        observers.add(o);
    }
    
    public void notifyObservers() {
        for (ExhibitStateObserver observer : observers) {
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
