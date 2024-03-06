package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.time.LocalTime;

// This class associates times with decorators.
public class TimeAndDecorator {
    EnumDecorator decorator;
    LocalTime time;

    TimeAndDecorator(EnumDecorator decorator, LocalTime time) {
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
