package Final;

import java.util.LinkedList;

public class Path {
    LinkedList<ZooAdmin.Exhibit> path = new LinkedList<ZooAdmin.Exhibit>();

    public void addExhibit(ZooAdmin.Exhibit exhibit) {
        path.add(exhibit);
    }

    public void removeExhibit(ZooAdmin.Exhibit exhibit) {
        path.remove(exhibit);
    }
}
