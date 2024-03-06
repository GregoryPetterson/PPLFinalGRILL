package project.abomination;

import project.abomination.Scheduler.EnumDecorator;
import java.time.LocalTime;

public class Event {
    EnumDecorator decorator;
    LocalTime time;

    Event(EnumDecorator decorator, LocalTime time) {
        this.decorator = decorator;
        this.time = time;
    }
    
}
