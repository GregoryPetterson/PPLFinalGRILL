package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.time.LocalTime;

public class EventTime {
    EnumDecorator decorator;
    LocalTime time;

    EventTime(EnumDecorator decorator, LocalTime time) {
        this.decorator = decorator;
        this.time = time;
    }

        public EnumDecorator getDecorator(){
        return decorator;
    }

    public LocalTime getTime(){
        return time;
    }

    
}
