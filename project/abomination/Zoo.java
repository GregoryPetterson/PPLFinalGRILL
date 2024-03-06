package project.abomination;

import project.abomination.Administration.EnumDec;
import java.util.ArrayList;
import java.time.LocalTime; 

public class Zoo {
    public static void main(String[] args) {
        // Create a zoo admin so we can notify observers when events are cancelled
        // or removed.
        ArrayList<Event> lionEvents = new ArrayList<Event>(); 

        lionEvents.add(new Event(EnumDec.FEEDING, LocalTime.of(12, 0)));
        lionEvents.add(new Event(EnumDec.SHOW, LocalTime.of(14, 0)));

        ArrayList<Event> tigerEvents = new ArrayList<Event>(); 
        tigerEvents.add(new Event(EnumDec.SHOW, LocalTime.of(11, 0)));
        tigerEvents.add(new Event(EnumDec.CLOSED, LocalTime.of(15, 0)));
        
        ArrayList<Event> bearEvents = new ArrayList<Event>(); 
        bearEvents.add(new Event(EnumDec.FEEDING, LocalTime.of(12, 0)));
        bearEvents.add(new Event(EnumDec.FEEDING, LocalTime.of(16, 0)));
        bearEvents.add(new Event(EnumDec.CLOSED, LocalTime.of(18, 0)));


        Administration zooAdmin = new Administration();
        // Need to set what events are happening at each exhibit here.
        ClientObserver dorothy = new ClientObserver(zooAdmin);
        ClientObserver tinman = new ClientObserver(zooAdmin);
        ClientObserver scarecrow = new ClientObserver(zooAdmin);

        // Each observer knows what exhibit they're subscribed to.
        // They'll get the schedule based on what was originally set.

        // Change the schedule here and then reprint the schedule for each observer.
        zooAdmin.addExhibitState(new Event(EnumDec.CLOSED, LocalTime.of(18, 0)));

        zooAdmin.notifyObservers();
    
    }
    
}
