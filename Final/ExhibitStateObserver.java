package Final;

import Final.ZooAdmin.Exhibit;

public interface ExhibitStateObserver {
    public void update(Exhibit exhibit, boolean isClosed, String event);
}
