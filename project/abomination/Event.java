package project.abomination;

import project.abomination.Administration.EnumDecorator;
import java.time.LocalTime;

public class Event {
    Exhibit exhibit;
    EnumDecorator decorator;
    LocalTime time;

    public Event(Exhibit exhibit, EnumDecorator decorator, LocalTime time) {
        this.decorator = decorator;
        this.time = time;
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
