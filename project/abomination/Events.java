package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.time.LocalTime;
import java.util.ArrayList;

public class Events {
    Exhibit exhibit;
    ArrayList<EventTime> eventTimes;

    public Events(Exhibit exhibit, ArrayList<EventTime> eventTimes ) {
        this.exhibit = exhibit;
        this.eventTimes = eventTimes;
    }


    public Exhibit getExhibit(){
        return exhibit;
    }

    public ArrayList<EventTime> getEventTimes(){
        return eventTimes;
    }
}
