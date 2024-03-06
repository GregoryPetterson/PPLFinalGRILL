package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.util.ArrayList;
import java.time.LocalTime;

public class Zoo {
    public static void main(String[] args) {

        Exhibit lion = Lion.getInstance();
        ArrayList<EventTime> lionEventTimes = new ArrayList<EventTime>();
        lionEventTimes.add(new EventTime(EnumDecorator.FEEDING, LocalTime.of(12, 0)));
        lionEventTimes.add(new EventTime(EnumDecorator.PETTING, LocalTime.of(14, 0)));

        Events lionEvents = new Events(lion, lionEventTimes);

        Exhibit lionSchedule = new Scheduler(lionEvents).notifyFactory();

        Exhibit tiger = Tiger.getInstance();
        ArrayList<EventTime> tigerEventTimes = new ArrayList<EventTime>();
        tigerEventTimes.add(new EventTime(EnumDecorator.FEEDING, LocalTime.of(13, 0)));
        tigerEventTimes.add(new EventTime(EnumDecorator.PETTING, LocalTime.of(15, 0)));

        Events tigerEvents = new Events(tiger, tigerEventTimes);

        Exhibit tigerSchedule = new Scheduler(tigerEvents).notifyFactory();

        Exhibit bear = Bear.getInstance();
        ArrayList<EventTime> bearEventTimes = new ArrayList<EventTime>();
        bearEventTimes.add(new EventTime(EnumDecorator.FEEDING, LocalTime.of(10, 0)));
        bearEventTimes.add(new EventTime(EnumDecorator.PETTING, LocalTime.of(16, 0)));
        bearEventTimes.add(new EventTime(EnumDecorator.FEEDING, LocalTime.of(15, 0)));
        bearEventTimes.add(new EventTime(EnumDecorator.PETTING, LocalTime.of(17, 0)));

        Events bearEvents = new Events(bear, bearEventTimes);

        Exhibit bearSchedule = new Scheduler(bearEvents).notifyFactory();



        System.out.println(lionSchedule.getDescription());

        System.out.println(tigerSchedule.getDescription());
        System.out.println(bearSchedule.getDescription());

        // Need to set what events are happening at each exhibit here.

        // Each observer knows what exhibit they're subscribed to.
        // They'll get the schedule based on what was originally set.

        // Change the schedule here and then reprint the schedule for each observer.

    }

}
