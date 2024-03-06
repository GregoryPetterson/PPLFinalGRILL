package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.util.ArrayList;
import java.time.LocalTime; 

public class Zoo {
    public static void main(String[] args) {      


        ArrayList<Events> lionEvents = new ArrayList<Events>(); 
        Exhibit lion = Lion.getInstance();
        lionEvents.add(new Events(lion, EnumDecorator.FEEDING, LocalTime.of(12, 0)));
        lionEvents.add(new Events(lion, EnumDecorator.PETTING, LocalTime.of(14, 0)));

        new Scheduler(lionEvents).notifyFactory();

        ArrayList<Events> tigerEvents = new ArrayList<Events>(); 
        Exhibit tiger = Tiger.getInstance(); 
        tigerEvents.add(new Events(tiger, EnumDecorator.PETTING, LocalTime.of(11, 0)));
        tigerEvents.add(new Events(tiger, EnumDecorator.CLOSED, LocalTime.of(15, 0)));

        new Scheduler(tigerEvents).notifyFactory();
        
        ArrayList<Events> bearEvents = new ArrayList<Events>();
        Exhibit bear = Bear.getInstance(); 

        // Not actually wrapped?
        bearEvents.add(new Events(bear, EnumDecorator.FEEDING, LocalTime.of(12, 0)));
        bearEvents.add(new Events(bear, EnumDecorator.FEEDING, LocalTime.of(16, 0)));
        bearEvents.add(new Events(bear, EnumDecorator.CLOSED, LocalTime.of(18, 0)));


        new Scheduler(bearEvents).notifyFactory();
        

        System.out.println(lion.getDescription());

        System.out.println(tiger.getDescription());
        System.out.println(bear.getDescription());

        
        // Need to set what events are happening at each exhibit here.


        // Each observer knows what exhibit they're subscribed to.
        // They'll get the schedule based on what was originally set.

        // Change the schedule here and then reprint the schedule for each observer.
    
    }
    
}
