package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.util.ArrayList;
import java.time.LocalTime; 

public class Zoo {
    public static void main(String[] args) {      


        ArrayList<Event> lionEvents = new ArrayList<Event>(); 
        Exhibit lion = Lion.getInstance();
        lionEvents.add(new Event(lion, EnumDecorator.FEEDING, LocalTime.of(12, 0)));
        lionEvents.add(new Event(lion, EnumDecorator.PETTING, LocalTime.of(14, 0)));

        new Scheduler(lionEvents);

        ArrayList<Event> tigerEvents = new ArrayList<Event>(); 
        Exhibit tiger = Tiger.getInstance(); 
        tigerEvents.add(new Event(tiger, EnumDecorator.PETTING, LocalTime.of(11, 0)));
        tigerEvents.add(new Event(tiger, EnumDecorator.CLOSED, LocalTime.of(15, 0)));

        new Scheduler(tigerEvents);
        
        ArrayList<Event> bearEvents = new ArrayList<Event>();
        Exhibit bear = Bear.getInstance(); 
        bearEvents.add(new Event(bear, EnumDecorator.FEEDING, LocalTime.of(12, 0)));
        bearEvents.add(new Event(bear, EnumDecorator.FEEDING, LocalTime.of(16, 0)));
        bearEvents.add(new Event(bear, EnumDecorator.CLOSED, LocalTime.of(18, 0)));

        new Scheduler(bearEvents);

        System.out.println(lion.getDescription());

        System.out.println(tiger.getDescription());
        System.out.println(bear.getDescription());

        
        // Need to set what events are happening at each exhibit here.


        // Each observer knows what exhibit they're subscribed to.
        // They'll get the schedule based on what was originally set.

        // Change the schedule here and then reprint the schedule for each observer.
    
    }
    
}
