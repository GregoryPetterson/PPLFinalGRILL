package Final;

public class Zoo {
    public static void main(String[] args) {
        ZooAdmin zooAdmin = new ZooAdmin();
        ClientObserver clientObserver = new ClientObserver(zooAdmin);
        Path path = new Path();

        path.addExhibit(ZooAdmin.Exhibit.LION);
        path.addExhibit(ZooAdmin.Exhibit.TIGER);
        path.addExhibit(ZooAdmin.Exhibit.BEAR);
        zooAdmin.setExhibitState(ZooAdmin.Exhibit.LION, false, "Lion feeding");

        zooAdmin.notifyObservers();

        System.out.println("\n\n");
        
        clientObserver.display();
    
    }
    
}
