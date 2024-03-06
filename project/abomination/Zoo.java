package project.abomination;

import Final.ObserverDecoratorFactoryAbomination.ZooAdmin.EnumExhibit;

public class Zoo {
    public static void main(String[] args) {
        // Create a zoo admin so we can notify observers when events are cancelled
        // or removed.
        ZooAdmin zooAdmin = new ZooAdmin();
        // Need to set what events are happening at each exhibit here.
        ClientObserver dorothy = new ClientObserver(zooAdmin);
        ClientObserver tinman = new ClientObserver(zooAdmin);
        ClientObserver scarecrow = new ClientObserver(zooAdmin);

        dorothy.addExhibit(ZooAdmin.EnumExhibit.LION);
        dorothy.addExhibit(ZooAdmin.EnumExhibit.TIGER);
        dorothy.addExhibit(ZooAdmin.EnumExhibit.BEAR);


        tinman.addExhibit(ZooAdmin.EnumExhibit.LION);

        scarecrow.addExhibit(ZooAdmin.EnumExhibit.LION);
        scarecrow.addExhibit(ZooAdmin.EnumExhibit.TIGER);
        // Each observer knows what exhibit they're subscribed to.
        // They'll get the schedule based on what was originally set.

        // Change the schedule here and then reprint the schedule for each observer.
        zooAdmin.setExhibitState(ZooAdmin.EnumExhibit.LION, false, "Lion feeding");

        zooAdmin.notifyObservers();
    
    }
    
}
