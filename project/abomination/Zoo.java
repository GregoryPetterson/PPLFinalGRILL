package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.util.ArrayList;
import java.time.LocalTime;

public class Zoo {
    public static void main(String[] args) {
        // For each exhibit, we need to set the events their corresponding times.
        Exhibit lion = Lion.getInstance();
        // lion is a singleton.
        ArrayList<TimeAndDecorator> lionEventTimes = new ArrayList<TimeAndDecorator>();
        // Each exhibit has one events object. Within that object is an arraylist of TimeAndDecorator objects.
        // Each TimeAndDecorator object has a decorator (event) and its corresponding time.
        lionEventTimes.add(new TimeAndDecorator(EnumDecorator.OPEN, LocalTime.of(9, 0)));
        lionEventTimes.add(new TimeAndDecorator(EnumDecorator.FEEDING, LocalTime.of(12, 0)));
        lionEventTimes.add(new TimeAndDecorator(EnumDecorator.PETTING, LocalTime.of(14, 0)));
        lionEventTimes.add(new TimeAndDecorator(EnumDecorator.TRAINING, LocalTime.of(15, 30)));
        lionEventTimes.add(new TimeAndDecorator(EnumDecorator.CLOSED, LocalTime.of(18, 0)));

        Events lionEvents = new Events(lion, lionEventTimes);

        Exhibit lionSchedule = new Scheduler(lionEvents).notifyFactory();

        Exhibit tiger = Tiger.getInstance();
        ArrayList<TimeAndDecorator> tigerEventTimes = new ArrayList<TimeAndDecorator>();
        tigerEventTimes.add(new TimeAndDecorator(EnumDecorator.OPEN, LocalTime.of(9, 0)));
        tigerEventTimes.add(new TimeAndDecorator(EnumDecorator.FEEDING, LocalTime.of(13, 0)));
        tigerEventTimes.add(new TimeAndDecorator(EnumDecorator.PETTING, LocalTime.of(15, 0)));
        tigerEventTimes.add(new TimeAndDecorator(EnumDecorator.TRAINING, LocalTime.of(16, 30)));
        tigerEventTimes.add(new TimeAndDecorator(EnumDecorator.CLOSED, LocalTime.of(18, 0)));

        Events tigerEvents = new Events(tiger, tigerEventTimes);

        Exhibit tigerSchedule = new Scheduler(tigerEvents).notifyFactory();

        Exhibit bear = Bear.getInstance();
        ArrayList<TimeAndDecorator> bearEventTimes = new ArrayList<TimeAndDecorator>();
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.OPEN, LocalTime.of(9, 0)));
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.FEEDING, LocalTime.of(10, 0)));
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.TRAINING, LocalTime.of(11, 0))); 
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.PETTING, LocalTime.of(16, 0)));
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.FEEDING, LocalTime.of(15, 0)));
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.PETTING, LocalTime.of(17, 0)));
        bearEventTimes.add(new TimeAndDecorator(EnumDecorator.CLOSED, LocalTime.of(18, 0)));

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
