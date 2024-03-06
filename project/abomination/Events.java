package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.time.LocalTime;
import java.util.ArrayList;

public class Events {
    Exhibit exhibit;
    ArrayList<Event> events;

    public Events(Exhibit exhibit, ArrayList<Event> events ) {
        this.exhibit = exhibit;
        this.events = events;
    }

    public EnumDecorator getDecorator(){
        return decorator;
    }

    public LocalTime getTime(){
        return time;
    }

    public Exhibit getExhibit(){
        return exhibit;
    }
}
