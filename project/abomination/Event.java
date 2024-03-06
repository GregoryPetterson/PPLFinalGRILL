package project.abomination;

import project.abomination.Administration.EnumDecorator;
import project.abomination.Administration.EnumExhibit;
import java.time.LocalTime;
import java.util.ArrayList;

public class Event {
    ArrayList<EnumDecorator> decorators;
    EnumExhibit exhibit;
    LocalTime time;

    public Event(Exhibit exhibit, ArrayList<EnumDecorator> decorators, LocalTime time) {
        this.decorators = decorators;
        this.time = time;
    }

    public ArrayList<EnumDecorator> getDecorators(){
        return decorators;
    }

    public ArrayList<EnumDecorator> getExhibit(){
        return decorators;
    }
}
